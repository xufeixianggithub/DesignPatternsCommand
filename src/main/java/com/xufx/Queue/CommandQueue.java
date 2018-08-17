package com.xufx.Queue;

import com.xufx.Command.MenuCommand;
import com.xufx.Interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    //声明一个存储所有命令对象的队列
    private static  List<Command> commandList=new ArrayList<Command>();

    //接收菜单对象添，将菜单对象中的单命令对象添加到队列中

    public synchronized static void  addMenu(MenuCommand menuCommand){
        for(Command c:menuCommand.getMenuCommandlist()){
            commandList.add(c);
        }
    }

    public synchronized static Command getOneCommand(){
        Command command=null;
        if (commandList.size()>0) {
            command=commandList.get(0);
            commandList.remove(command);
        }
        return command;
    }
}
