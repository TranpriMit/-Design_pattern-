package Adapter.example;

public class HouseHoldPower implements V220Power {
    @Override
    public String getName(){return "家用电源";}

    @Override
    public int getVoltage(){return 220;}
}
