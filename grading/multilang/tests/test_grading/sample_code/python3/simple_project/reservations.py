class Reservation:
    def __init__(self, description, user):
        self.description = description
        self.user = user

    def __str__(self):
        return self.description + " " + str(self.user)