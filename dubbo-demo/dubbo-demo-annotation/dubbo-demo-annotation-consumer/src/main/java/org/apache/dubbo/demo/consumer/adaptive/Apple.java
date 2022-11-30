package org.apache.dubbo.demo.consumer.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class Apple implements Fruit {
    @Override
    public String getName(URL url) {
        return "apple";
    }

    @Override
    public String getNickname(URL url) {
        return "苹果";
    }
}
