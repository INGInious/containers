class Turns:
    def __init__(self):
        self.reservations = []
        self.next_reservation_index = 0

    def next(self):
        if self.has_next():
            reservation = self.reservations[self.next_reservation_index]
            self.next_reservation_index += 1
            return reservation
        else:
            return None

    def insert(self, reservation):
        self.reservations.append(reservation)

    def has_next(self):
        return self.next_reservation_index >= 0 and self.next_reservation_index < len(self.reservations)