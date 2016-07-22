# -*- coding: utf-8 -*-
#
# This file is part of INGInious. See the LICENSE and the COPYRIGHTS files for
# more information about the licensing of this file.

import os
import base64

def get_codeblock(language, text):
    """ Generate rst codeblock for given text and language """
    rst = "\n\n.. code-block:: " + language + "\n\n"
    for line in text.splitlines():
        rst += "\t" + line + "\n"

    rst += "\n"
    
    return rst

def get_imageblock(filename, format=''):
    _, extension = os.path.splitext(filename)

    with open(filename, "rb") as image_file:
        encoded_string = base64.b64encode(image_file.read()).decode('utf-8')

    encoded_string = '\n\n.. raw:: html\n\n\t<img src="data:image/' + (format if format else extension[1:]) + ';base64,' + encoded_string +'">\n'

    return encoded_string