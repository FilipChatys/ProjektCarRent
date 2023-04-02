package pl.car.it.rent.model;

import pl.car.it.rent.model.db.BussRepository;
import pl.car.it.rent.model.db.CarRepository;
import pl.car.it.rent.model.gui.Gui;

public class Core {

    BussRepository bussesDB = new BussRepository();

    CarRepository baza = new CarRepository();

    Gui gui = new Gui();

    public void start() {

        boolean run = true;

        do {
            String plate;

            boolean carSucces, bussSucces;

            switch (gui.showMenu()) {
                case "1":
                    System.out.println("Oto lista aut");

                    gui.listCars(baza.getCars());
                    System.out.println("\n");
                    gui.listBusses(bussesDB.getBusses());
                    break;

                case "2":

                    plate = gui.readPlate();

                    carSucces = baza.rentCar(plate);

                    bussSucces = bussesDB.rentBus(plate);

                    gui.rentResult(carSucces || bussSucces);

                    break;

                case "3":

                    plate = gui.readPlate();

                    carSucces = baza.returnCar(plate);

                    bussSucces = bussesDB.returnBus(plate);

                    gui.rentResult(carSucces || bussSucces);

                    break;

                case "4":
                    run = false;
                    break;

                default:
                    System.out.println("Niewłaściwy input, wybierz opcję 1, 2 lub 3");
                    break;
            }

        } while (run);
    }
}


