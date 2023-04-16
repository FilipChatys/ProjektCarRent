package pl.car.it.rent.model;
import pl.car.it.rent.model.Authenticator.Authenticator;
import pl.car.it.rent.model.db.VehicleRepository;
import pl.car.it.rent.model.gui.Gui;

public class Core {

    VehicleRepository database = new VehicleRepository();

    Authenticator authenticator = new Authenticator();

    Gui gui = new Gui();

    public void start() {
//Logowanie
       if(!authenticator.authenticate()){
           return;
       }

        mainloop:
        while (true) {

            switch (gui.showMenu()) {
                case "1":
                    System.out.println("Oto lista aut");

                    gui.listVehicles(database.getVehicles());
                    break;

                case "2":

                    gui.rentResult(database.rentVehicle(gui.readPlate()));

                    break;

                case "3":


                    gui.rentResult(database.returnVehicle(gui.readPlate()));

                    break;

                case "4":

                    break mainloop;

                default:
                    System.out.println("Niewłaściwy input, wybierz opcję 1, 2 lub 3");
                    break;
            }

        }
    }


}


