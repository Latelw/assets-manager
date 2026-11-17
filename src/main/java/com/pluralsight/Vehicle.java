package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, BigDecimal originalCost, String dateAcquired, String makeModel, int odometer, int year) {
        super(description, originalCost, dateAcquired);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public BigDecimal getValue(){
        //Need to use car's year plus current date to determine how old the car is.
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - getYear();
        BigDecimal value = getOriginalCost();
        if (age >= 10){
            value = BigDecimal.valueOf(1000);
            return value;
        } else if (age >= 7) {
            value = getOriginalCost() * new BigDecimal(0.08);

        }
    }
}
