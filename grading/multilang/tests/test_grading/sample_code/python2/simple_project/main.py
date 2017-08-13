from myClasses import MyClass
from persons import Doctor
import sys

name = sys.stdin.readlines()[0]

myObject = MyClass()
doctor = Doctor(name)
myObject.say_hello(doctor)