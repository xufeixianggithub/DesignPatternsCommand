package com.xufx.Receiver;

import com.xufx.Interfaces.CookApi;

/**
 * 厨师对象，做凉菜
 */
public class CoolCook implements CookApi {
    public void cook(String name) {
        System.out.println("凉菜"+name+"已经做好，本厨师正在装盘。" );
    }
}