package pl.car.it.rent.model.gui;


import pl.car.it.rent.model.Bus;
import pl.car.it.rent.model.Car;

import java.util.Scanner;

public class Gui {

    Scanner scanner = new Scanner(System.in);

    //Gui(){
    //    this.scanner = new Scanner(System.in);
    //}
    // niepotrzebny konstruktor

    public String showMenu(){

        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");

        //String wczytanie = scanner.nextLine();

        return scanner.nextLine();
    }

    public void listCars(Car[] cars) {
        for (Car car : cars) {
            if (!car.isRent()) {

                System.out.println(new StringBuilder().append(car.getBrand()).append(" ").append(car.getModel())
                        .append(" ").append(car.getPrice()).append(" ").append(car.getYear()).append(" ")
                        .append(car.getPlate()).toString());
            }
        }
    }

    public String readPlate() {
        System.out.println("Podaj tablice auta, ktore chcesz wyporzyczyc:");

        return scanner.nextLine();
    }

    public void rentResult(boolean result){
        if(result){
            System.out.println("Sukces");
        } else {
            System.out.println("Error!");
        }
    }

    public void listBusses(Bus[] buses) {
        for (Bus bus : buses) {
            if (!bus.isRent()) {

                System.out.println(new StringBuilder().append(bus.getBrand()).append(" ").append(bus.getModel())
                        .append(" ").append(bus.getPrice()).append(" ").append(bus.getYear()).append(" ")
                        .append(bus.getPlate()).append(" ").append(bus.getSeats()).append(" ")
                        .append(bus.isTicketMachine()));
            }
        }
    }
}
