package com.xufx.Manager;

import com.xufx.Receiver.HotCook;

public class CookManager {
    private static  boolean Flag=false;

   public static void runCookManager(){

       if(!Flag){
           Flag=true;
           HotCook zs=new HotCook("张三");
           HotCook ls=new HotCook("李四");
           HotCook ww=new HotCook("王五");


           Thread t1=new Thread(zs);
           t1.start();
           Thread t2=new Thread(ls);
           t2.start();
           Thread t3=new Thread(ww);
           t3.start();
       }


   }

}
