package com.flowerbed;

/**
 * Created by Mikron.Licud on 20/06/2016.
 */
public class Flowerbed implements IFlowerbed {

    private double circumference = 0;

    public double getCircumference(){
        return  circumference;
    }

    public void setCircumference(int radius){
        circumference = Math.PI * 2 * radius;
    }

}
