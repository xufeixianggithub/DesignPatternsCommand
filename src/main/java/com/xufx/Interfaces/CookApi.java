package com.xufx.Interfaces;

/**
 * 厨师的接口 接收者
 */
public interface CookApi {
    /**
     * 示意，做菜的方法
     * @param tableNum 点菜的桌号
     * @param name 菜名
     */
    public void cook(int tableNum,String name);
}