package org.apache.dubbo.demo.consumer.base;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class ColorFruitWrapper implements Fruit {
    Fruit fruit;

    public ColorFruitWrapper(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String getName() {
        return "color" + fruit.getName();
    }

    @Override
    public String getNickname() {
        return "color" + fruit.getNickname();
    }
}
