package Adapter.pattern;

public class client {
    public static void main(String[] args){
        Target target = new Adapter();
        target.request();
    }

}
