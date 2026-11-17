package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset{

    private String address;
    private int squareFoot;
    private int lotSize;
    private int condition;

    public House(String description, BigDecimal originalCost, String dateAcquired, String address, int condition, int lotSize, int squareFoot) {
        super(description, originalCost, dateAcquired);
        this.address = address;
        this.condition = condition;
        this.lotSize = lotSize;
        this.squareFoot = squareFoot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
       try {
           if (condition < 5) {
               this.condition = condition;
           }
       } catch (Exception e) {
           System.out.println("Error with condition input");
       }

    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }
    @Override
    public BigDecimal getValue(){
        if (getCondition() == 1){
            return BigDecimal.valueOf((getSquareFoot() * 180.00) + (getLotSize() * 0.25));
        } else if (getCondition() == 2) {
            return BigDecimal.valueOf((getSquareFoot() * 130.00) + (getLotSize() * 0.25));

        } else if (getCondition() == 3) {
            return BigDecimal.valueOf((getSquareFoot() * 90.00) + (getLotSize() * 0.25));


        } else if (getCondition() == 4) {
            return BigDecimal.valueOf((getSquareFoot() * 80.00) + (getLotSize() * 0.25));

        } else {
            return null;
        }

    }
}
