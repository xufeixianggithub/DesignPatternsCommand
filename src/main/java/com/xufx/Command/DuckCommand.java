package com.xufx.Command;

import com.xufx.Interfaces.Command;
import com.xufx.Interfaces.CookApi;

/**
 * 命令对象，北京烤鸭
 */
public class DuckCommand implements Command {
    private CookApi cookApi = null;
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
    private int tableNum;
    public DuckCommand(int tableNum){
        this.tableNum = tableNum;
    }
    public int getTableNum(){
        return this.tableNum;
    }

    public void execute() {
        this.cookApi.cook(tableNum,"北京烤鸭");
    }
}