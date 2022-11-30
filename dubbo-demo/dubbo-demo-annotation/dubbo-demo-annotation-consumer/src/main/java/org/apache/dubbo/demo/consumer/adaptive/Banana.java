package org.apache.dubbo.demo.consumer.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
public class Banana implements Fruit {
    @Override
    public String getName(URL url) {
        return "banana";
    }

    @Override
    public String getNickname(URL url) {
        return "香蕉";
    }
}
