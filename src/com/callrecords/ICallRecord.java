package com.callrecords;

/**
 * Created by Mikron.Licud on 20/06/2016.
 */
public interface ICallRecord {

    void setCountryRate(double _rate);

    void setCallMinutes(int _minutes);

    double getCost();

}
