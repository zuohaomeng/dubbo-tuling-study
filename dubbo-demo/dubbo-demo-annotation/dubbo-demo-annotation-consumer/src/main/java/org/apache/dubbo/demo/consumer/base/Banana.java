package org.apache.dubbo.demo.consumer.base;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class Banana implements Fruit {
    @Override
    public String getName() {
        return "banana";
    }

    @Override
    public String getNickname() {
        return "香蕉";
    }
}
