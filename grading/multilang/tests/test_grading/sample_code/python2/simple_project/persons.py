class Person:
    def __init__(self, name):
        self.name = name

    def get_name(self):
        return self.name

class Doctor(Person):
    def get_name(self):
        return "Dr " + self.name