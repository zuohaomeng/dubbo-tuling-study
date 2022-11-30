package org.apache.dubbo.demo.consumer.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class SpiTest {
    public static void main(String[] args) {
        ExtensionLoader<Fruit> loader = ExtensionLoader.getExtensionLoader(Fruit.class);
        Fruit fruit = loader.getAdaptiveExtension();
        URL url = new URL("me", "127.0.0.1", 888);
        url = url.addParameter("fruit", "apple");
        System.out.println(fruit.getName(url));
    }
}
