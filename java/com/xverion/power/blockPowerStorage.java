package com.xverion.power;

/**
 * Created by brian on 25-6-2014.
 */
public class blockPowerStorage
{
    protected double AmountStoredMax;

    protected double AmountStored;

    protected double Needed;


    public blockPowerStorage(double Amount, double neededAmount)
    {
        this.AmountStoredMax = Amount;
        this.Needed = neededAmount;
    }

    public void setAmountStored(double amount)
    {
        AmountStored += amount;
    }

    public double getAmountStored()
    {
        return AmountStored;
    }

    public double getAmountStoredMax()
    {
        return AmountStoredMax;
    }

    public double getAmountNeeded()
    {
        return Needed;
    }
}
