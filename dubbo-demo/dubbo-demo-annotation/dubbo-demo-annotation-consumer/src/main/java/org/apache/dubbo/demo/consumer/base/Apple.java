package org.apache.dubbo.demo.consumer.base;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class Apple implements Fruit{
    @Override
    public String getName() {
        return "apple";
    }

    @Override
    public String getNickname() {
        return "苹果";
    }
}
