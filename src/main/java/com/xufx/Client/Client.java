package com.xufx.Client;

import com.xufx.Command.ChopCommand;
import com.xufx.Command.DuckCommand;
import com.xufx.Command.MenuCommand;
import com.xufx.Invoker.Waiter;
import com.xufx.Manager.CookManager;

public class Client {
    public static void main(String[] args) {
        CookManager.runCookManager();

        for(int i=1;i<=5;i++){
            Waiter waiter=new Waiter();


            ChopCommand chopCommand=new ChopCommand(i);

            DuckCommand duckCommand=new DuckCommand(i);


            waiter.orderDish(chopCommand);

            waiter.orderDish(duckCommand);

            waiter.overOrder();

        }

    }
}