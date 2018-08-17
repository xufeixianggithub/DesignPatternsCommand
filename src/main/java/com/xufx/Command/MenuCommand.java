package com.xufx.Command;

import com.xufx.Interfaces.Command;
import com.xufx.Interfaces.CookApi;
import com.xufx.Queue.CommandQueue;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements Command{
    List<Command> menuCommandlist=new ArrayList<Command>();

    public void execute() {//将菜单对象传入到队列，在队列中处理菜单对象的
        CommandQueue.addMenu(this);
    }

    public void setCookApi(CookApi cookApi) {

    }

    public int getTableNum() {
        return 0;
    }
    public void addCommand(Command command){
        menuCommandlist.add(command);
    }
    public List<Command> getMenuCommandlist(){
        return  menuCommandlist;
    }
}
