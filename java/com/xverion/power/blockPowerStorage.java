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

    public void addpowerToStorage(double amount)
    {
        AmountStored += amount;
    }

    public double getPowerStored()
    {
        return AmountStored;
    }

    public boolean CheckAmountForImbue()
    {
        if(getPowerStored() >= Needed)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
