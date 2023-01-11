import json
import os

from docker import APIClient

TAG = 'latest'
root = '../../grading'

def is_container(root: str, name: str) -> bool:
    name = os.path.join(root, name)
    return os.path.isdir(name) and os.path.exists(os.path.join(name, 'Dockerfile'))

containers = [entry for entry in os.listdir(root) if is_container(root, entry)]
cli = APIClient()
for container in containers:
    registry = f'inginious/{container}'
    container_tag = f'{registry}:{TAG}'
    print(container, container_tag)

    # Build current container
    for out in cli.build(path=f'{root}/{container}', tag=container_tag):
        line = json.loads(out.decode('utf-8'))
        if line != '\n': print(line)

    # Push current container
    #for out in cli.push(registry, tag=TAG):
    #    print(out)
