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

    public void execute() {
        this.cookApi.cook("北京烤鸭");
    }
}