package pl.car.it.rent.model.db;

import pl.car.it.rent.model.Bus;


public class BussRepository {

    private Bus[] busses = new Bus [3];

    public BussRepository() {
        this.busses[0] = new Bus("Star", "1000", 2005, 600.0, "KR111", 69, true);

        this.busses[1] = new Bus("Jelcz", "S2000", 1410, 900.0, "KR222", 30, false);

        this.busses[2] = new Bus("Volvo", "GTR", 2006, 651.0, "KR333", 44, true);
    }

    public Bus[] getBusses() {
        return busses;
    }

    public boolean rentBus(String plate){
        for(Bus bus : this.busses){
            if(!bus.isRent() && bus.getPlate().equals(plate)){
                bus.setRent(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnBus(String plate){
        for(Bus bus : this.busses){
            if(bus.isRent() && bus.getPlate().equals(plate)){
                bus.setRent(false);
                return true;
            }
        }
        return false;
    }

}
