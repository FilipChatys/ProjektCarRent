package pl.car.it.rent.model.db;

import pl.car.it.rent.model.Car;

public class CarRepository {

    private Car[] cars = new Car[5];

    public CarRepository(){
        this.cars[0] = new Car("BMW","3", 2015, 300.0, "KR11");

        this.cars[1] = new Car("Opel","5", 2010, 400.0, "TK201");

        this.cars[2] = new Car("Skoda","Kodyak", 2020, 800.0, "PR212");

        this.cars[3] = new Car("Kia","Ceed", 2011, 600.0, "TKI14");

        this.cars[4] = new Car("Renault","Megan", 2012, 500.0, "BS690");
    }

    public boolean rentCar(String plate){
        for(Car car : this.cars){
            if(!car.isRent() && car.getPlate().equals(plate)){
                car.setRent(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnCar(String plate){
        for(Car car : this.cars){
            if(car.isRent() && car.getPlate().equals(plate)){
                car.setRent(false);
                return true;
            }
        }
        return false;
    }

    public Car[] getCars (){
        return cars;
    }

}
