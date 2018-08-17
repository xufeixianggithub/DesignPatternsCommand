package com.xufx.Receiver;

import com.xufx.Interfaces.Command;
import com.xufx.Interfaces.CookApi;
import com.xufx.Queue.CommandQueue;

import java.util.Random;

public class HotCook implements CookApi,Runnable{
    private String name;
    public HotCook(String name){
        this.name=name;

    }

    public void cook(int tableNum, String name) {
        int cookTime =(int)(20*Math.random());
        System.out.println("厨师"+this.name+"正在为"+tableNum+"号桌，做"+name);

        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"厨师为"+tableNum+"号桌做好了："+name+",共计耗时="+cookTime+"秒");
    }

    public void run() {

        while (true){
            Command command= CommandQueue.getOneCommand();
            if(command!=null) {
                command.setCookApi(this);
                command.execute();
            }

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
