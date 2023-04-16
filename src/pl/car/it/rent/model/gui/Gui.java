package pl.car.it.rent.model.gui;

import Pojazdy.Vehicle;
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

    public void listVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
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

    public User readLoginAndPassword(){
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Password:");
        return new User(login, scanner.nextLine());
    }
}
