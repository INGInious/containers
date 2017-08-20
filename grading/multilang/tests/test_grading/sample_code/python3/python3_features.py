"""
Test file for python3 specific features
based on http://sebastianraschka.com/Articles/2014_python_2_3_key_diff.html#python-3
"""

#python3 print tests
print('Python3')
print('utf-8 \u03BCnico\u0394é!')

#__contains__ method (python3 specific)
range.__contains__

#exception handling
try:
    let_us_cause_a_NameError
except NameError as err:
    print(err, '--> our error message')
