package pl.car.it.rent.model;

import pl.car.it.rent.model.db.CarRepository;
import pl.car.it.rent.model.gui.Gui;

public class App {
    public static void main(String[] args) {

        System.out.println("Witamy w wyporzyczalni");

        new Core().start();
    }
}


