package com.xufx.Command;

import com.xufx.Interfaces.Command;
import com.xufx.Interfaces.CookApi;

public class ChopCommand implements Command{
    private CookApi cookApi=null;
    private int tableNum=0;

    public ChopCommand(int tableNum){
        this.tableNum=tableNum;
    }

    public void execute() {
        cookApi.cook(tableNum,"绿豆排骨");
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi=cookApi;
    }

    public int getTableNum() {
        return tableNum;
    }
}
