package com.xufx.Invoker;

import com.xufx.Command.MenuCommand;
import com.xufx.Interfaces.Command;

public class Waiter {
    private MenuCommand menuCommand=new MenuCommand();

    /*public Waiter(MenuCommand menuCommand){
        this.menuCommand=menuCommand;
    }*/

   /* public void setMenuCommand(MenuCommand menuCommand) {
        this.menuCommand = menuCommand;
    }*/

    //点菜
    public void orderDish(Command command){

        menuCommand.addCommand(command);
    }
    public void overOrder(){
        menuCommand.execute();
    }
}
