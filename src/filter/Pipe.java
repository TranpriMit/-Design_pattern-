package filter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pipe {
    //定义输入与输出管道
    private Scanner pipeReader;
    private PrintWriter pipeWrite;
    public Pipe(){
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader();
        try{
            pw.connect(pr);
        }catch (IOException e){
            e.getMessage();
        }
        pipeWrite = new PrintWriter(pw);
        pipeReader = new Scanner(pr);
    }
    //读入一行数据到管道
    public String readLine() throws IOException{
        if(pipeReader.hasNextLine()){
            return pipeReader.nextLine();
        }
        return null;
    }
    //从管道输出数据
    //public void writerLine(String)
}
