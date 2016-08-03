# -*- coding: utf-8 -*-
#
# This file is part of INGInious. See the LICENSE and the COPYRIGHTS files for
# more information about the licensing of this file.

import os
import re
import json
import codecs
import base64

def load_input():
    """ Open existing input file """
    file = open('/.__input/__inputdata.json', 'r')
    result = json.loads(file.read().strip('\0').strip())
    file.close()
    return result

def get_input(problem):
    """" Returns the specified problem answer in the form 
         {"type": "text", "value": "VALUE"}
         or {"type": "file", "filename":"FILENAME", value:BYTES}
         
         problem: problem id
    """
    input_data = load_input()
    problem_input = input_data['input'][problem]
    if isinstance(problem_input, dict) and "filename" in problem_input and "value" in problem_input:
        return {"type":"file", "filename": problem_input["filename"], "value": base64.b64decode(problem_input["value"])}
    else:
        return {"type":"text", "value": problem_input}
    
def parse_template(input_filename, output_filename=''):
    """ Parses a template file
        Replaces all occurences of @@problem_id@@ by the value
        of the 'problem_id' key in data dictionary
        
        input_filename: file to parse
        output_filename: if not specified, overwrite input file
    """
    data = load_input()
    with codecs.open(input_filename, 'r', 'utf-8') as file:
        template = file.read()
    
    # Check if 'input' in data
    if not 'input' in data:
        raise ValueError("Could not find 'input' in data")
    
    # Parse template
    for field in data['input']:
        subs = ["filename", "value"] if isinstance(data['input'][field], dict) and "filename" in data['input'][field] and "value" in data['input'][field] else [""]
        for sub in subs:
            displayed_field = field + (":" if sub else "") + sub
            regex = re.compile("@([^@]*)@" + displayed_field + '@([^@]*)@')
            for prefix, postfix in set(regex.findall(template)):
                if sub == "value":
                    text = base64.b64decode(data['input'][field][sub]).decode('utf-8')
                elif sub:
                    text = data['input'][field][sub]
                else:
                    text = data['input'][field]
                rep = "\n".join([prefix + v + postfix for v in text.splitlines()])
                template = template.replace("@{0}@{1}@{2}@".format(prefix, displayed_field, postfix), rep)
    
    if output_filename == '':
        output_filename=input_filename
    
    # Ensure directory of resulting file exists
    try:
        os.makedirs(os.path.dirname(output_filename))
    except OSError as e:
        pass

    # Write file
    with codecs.open(output_filename, 'w', 'utf-8') as file:
        file.write(template)
