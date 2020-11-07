package Adapter.example;

public class V220ToV5Adapter implements V5Power {
    private V220Power v220Power;

    public V220ToV5Adapter(V220Power v220Power){
        this.v220Power = v220Power;
    }

    @Override
    public String getName(){
        return "电源适配器 ==>" + v220Power.getName();
    }

    @Override
    public int getVoltage(){
        System.out.println("原始电压为" + v220Power.getVoltage());
        System.out.println("进行电压转换：" + v220Power.getVoltage() + "-->"+5);
        System.out.println("转换完成");
        return 5;
    }
}
