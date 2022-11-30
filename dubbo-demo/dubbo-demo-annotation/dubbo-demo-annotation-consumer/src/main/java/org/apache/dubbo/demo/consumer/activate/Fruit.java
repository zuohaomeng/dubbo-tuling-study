package org.apache.dubbo.demo.consumer.activate;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
@SPI
public interface Fruit {
    @Adaptive
    String getName(URL url);

    String getNickname(URL url);
}
