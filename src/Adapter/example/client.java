package Adapter.example;

public class client {
    public static void main(String[] args){
        Phone phone = new Phone();
        System.out.println("使用家用电源充电");
        V220Power v220Power = new HouseHoldPower();
        V5Power v5Power= new V220ToV5Adapter(v220Power);
        phone.batteryCharge(v5Power);
    }
}
