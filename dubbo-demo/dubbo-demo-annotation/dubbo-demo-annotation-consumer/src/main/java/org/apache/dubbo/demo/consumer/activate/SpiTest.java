package org.apache.dubbo.demo.consumer.activate;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.List;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class SpiTest {
    public static void main(String[] args) {
            ExtensionLoader<Fruit> loader = ExtensionLoader.getExtensionLoader(Fruit.class);
            URL url = new URL("me", "127.0.0.1", 888);
            url = url.addParameter("xxx", "apple");
            List<Fruit> activateExtension = loader.getActivateExtension(url, "xxx","spring");
            for (Fruit f : activateExtension) {
                System.out.println(f.getName(url));
            }
    }
}
