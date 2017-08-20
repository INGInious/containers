"""
Test file for Python 3 specific features
based on http://sebastianraschka.com/Articles/2014_python_2_3_key_diff.html#python-3
"""

# Python 3 print tests
print('Python3')
print('utf-8 \u03BCnico\u0394é!')

# range().__contains__ method (Python 3 specific)
2 in range(10)

# Exception handling
try:
    let_us_cause_a_NameError
except NameError as err:
    print(err, '--> our error message')
