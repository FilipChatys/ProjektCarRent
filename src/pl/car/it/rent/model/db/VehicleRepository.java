package pl.car.it.rent.model.db;
import Pojazdy.Vehicle;
import pl.car.it.rent.model.Bus;
import pl.car.it.rent.model.Car;
import pl.car.it.rent.model.Motorcycle;


public class VehicleRepository {

        private Vehicle[] vehicles = new Vehicle[10];

        public VehicleRepository() {
            this.vehicles[0] = new Car("BMW", "3", 2015,
                    300.0, "KR11");
            this.vehicles[1] = new Car("Audi", "A5", 2016,
                    350.0, "KR22");
            this.vehicles[2] = new Car("Kia", "Ceed", 2017,
                    320.0, "KR33");
            this.vehicles[3] = new Car("Toyota", "Corolla",
                    2018, 370.0, "KR44");
            this.vehicles[4] = new Car("Volvo", "V50", 2013,
                    200.0, "KR55");
            this.vehicles[5] = new Bus("Star", "1000",
                    2005, 600.0, "KR111", 52,
                    true);
            this.vehicles[6] = new Bus("Jelcz", "S2000",
                    1984, 900.0, "KR222", 30,
                    false);
            this.vehicles[7] = new Bus("Volvo", "GTR",
                    2006, 650.0, "KR333", 45,
                    true);
            this.vehicles[8] = new Motorcycle("Jamaha", "C1",
                    2006, 650.0, "KR444");
            this.vehicles[9] = new Motorcycle("Suzuki", "S4",
                    2006, 650.0, "KR555");
        }

        public boolean rentVehicle(String plate) {
            for(Vehicle vehicle : this.vehicles) {
                if(!vehicle.isRent() && vehicle.getPlate().equals(plate)) {
                    vehicle.setRent(true);
                    return true;
                }
            }
            return false;
        }

        public boolean returnVehicle(String plate) {
            for(Vehicle vehicle : this.vehicles) {
                if(vehicle.isRent() && vehicle.getPlate().equals(plate)) {
                    vehicle.setRent(false);
                    return true;
                }
            }
            return false;
        }

        public Vehicle[] getVehicles() {
            return vehicles;
        }
}

