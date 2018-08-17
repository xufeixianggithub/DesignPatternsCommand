package com.xufx.Command;

import com.xufx.Interfaces.Command;
import com.xufx.Interfaces.CookApi;

public class DuckCommand implements Command{

    private CookApi cookApi=null;
    private int tableNum=0;

    public DuckCommand(int tableNum){
        this.tableNum=tableNum;
    }


    public void execute() {
        cookApi.cook(tableNum,"北京烤鸭");
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi=cookApi;
    }

    public int getTableNum() {
        return tableNum;
    }
}
