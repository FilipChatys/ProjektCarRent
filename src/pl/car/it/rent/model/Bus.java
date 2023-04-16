package pl.car.it.rent.model;

import Pojazdy.Vehicle;

public class Bus extends Vehicle {
    private int seats;
    private boolean ticketMachine;

    public Bus(String brand, String model, int year, double price, String plate, int seats, boolean ticketMachine) {
        super(brand, model, year, price, plate);
        this.seats = seats;
        this.ticketMachine = ticketMachine;
    }

    public Bus() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isTicketMachine() {
        return ticketMachine;
    }

    public void setTicketMachine(boolean ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public String toString(){
        String vehiclePart = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(vehiclePart)
                //.append(this.getClass().getSimpleName())
                .append(" Ilość miejsc siedzących: ")
                .append(this.seats)
                .append(" Biletomat: ")
                .append(this.ticketMachine ? "Tak" : " Nie");

        return sb.toString();
    }

}