package com.yt.builder;

import java.math.BigDecimal;
import java.util.Date;

public class Director {

    public static void main(String[] args) {
        RedPacket redPacket = RedPacketBuilderImpl.getBuilder().setPublishName("小明")
                .setReceiveTime(new Date())
                .setReceiveName("小王")
                .setRedPacketPrice(BigDecimal.valueOf(899)).build();

        System.out.println(redPacket);

    }
}
