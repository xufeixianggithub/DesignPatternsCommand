package com.xufx.Receiver;

import com.xufx.Interfaces.CookApi;

/**
 * 厨师对象，做热菜
 */
public class HotCook implements CookApi {

    public void cook(String name) {
        System.out.println("本厨师正在做："+name);
    }
}