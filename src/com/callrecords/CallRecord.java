package com.callrecords;

/**
 * Created by Mikron.Licud on 20/06/2016.
 */
public class CallRecord implements ICallRecord {

    private double rate;

    private int minutes;

    @Override
    public void setCountryRate(double _rate) {
        rate = _rate;
    }

    @Override
    public void setCallMinutes(int _minutes) {
        minutes = _minutes;
    }

    @Override
    public double getCost() {
        return rate * minutes;
    }
}
