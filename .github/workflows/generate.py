from yaml import load, BaseLoader

from jinja2 import FileSystemLoader, Environment, select_autoescape

env = Environment(loader=FileSystemLoader("."), autoescape=select_autoescape(), trim_blocks=True, lstrip_blocks=True)
template = env.get_template("compose.tmpl")

with open("context.yml", "r") as fd:
    context = load(fd, BaseLoader)

with open("compose.yml", "w") as fd:
    fd.write(template.render(context))
