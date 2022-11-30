package org.apache.dubbo.demo.consumer.base;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author ZuoHao
 * @date 2022/11/23
 */
@SPI
public interface Fruit {

    String getName();

    String getNickname();
}
