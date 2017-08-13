from turns import Turns
from user import User
from reservations import Reservation

turns = Turns()

mauricio = User("Mauricio")
juan = User("Juan")
pedro = User("Pedro")

turns.insert(Reservation("Frijoles", mauricio))
turns.insert(Reservation("Aguacate", juan))
turns.insert(Reservation("Jugo", mauricio))
turns.insert(Reservation("Fruta", pedro))
turns.insert(Reservation("Arroz", pedro))
turns.insert(Reservation("Sopa", juan))
turns.insert(Reservation("Pollo", mauricio))

print( str(turns.next()) + " " + str(3/2) )
