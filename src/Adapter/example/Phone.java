package Adapter.example;

    public class Phone {
        /**
         * 充电
         */
        public void batteryCharge(V5Power v5Power) {
            System.out.println("1.连接电源 ==> " + v5Power.getName());
            System.out.println("2.当前电压 : " + v5Power.getVoltage());
            System.out.println("3.进行充电 ... ");
        }
    }
