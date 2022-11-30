package org.apache.dubbo.demo.consumer.base;

import org.apache.dubbo.common.extension.Adaptive;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class SweetFruitWrapper implements Fruit {
    Fruit fruit;

    public SweetFruitWrapper(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String getName() {
        return "sweet" + fruit.getName();
    }

    @Override
    public String getNickname() {
        return "sweet" + fruit.getNickname();
    }
}
