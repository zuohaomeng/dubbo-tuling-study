package org.apache.dubbo.demo.consumer.base;

import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Date;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class SpiTest {
    public static void main(String[] args) {
//        ExtensionLoader<Fruit> loader = ExtensionLoader.getExtensionLoader(Fruit.class);
//        Fruit fruit = loader.getExtension("banana");
//        System.out.println(fruit.getName());
//        System.out.println(fruit.getNickname());
        System.out.println(new Date(1669199096742L));
    }
}
