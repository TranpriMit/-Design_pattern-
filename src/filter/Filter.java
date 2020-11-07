package filter;

import java.io.IOException;

public abstract class  Filter implements Runnable{
    //定义输入与输出的管道
    protected Pipe input;
    protected Pipe output;

    private boolean isStart = false;

    Filter(Pipe input, Pipe output){
        this.input = input;
        this.output = output;
    }

    //防止多次调用，调用线程后开始执行
    public void start(){
        if(!isStart){
            isStart = true;
            Thread thread = new Thread();
            thread.start();
        }
    }

    //线程的run方法
    public void run(){
        try{
            this.transform();
        } catch (IOException e){
            e.getMessage();
        }
    }

    //将数据转换并且通过管道读取写入数据，由子类实现的抽象方法
    protected abstract void transform() throws IOException;
}
