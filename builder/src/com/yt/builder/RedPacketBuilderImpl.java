package com.yt.builder;

import java.math.BigDecimal;
import java.util.Date;

public class RedPacketBuilderImpl implements RedPacketBuilder {

    private String pulishName;
    private String receiveName;
    private Date   receiveTime;
    private BigDecimal redpacketPrice;


    public static RedPacketBuilder getBuilder(){
        return new RedPacketBuilderImpl();
    }

    @Override
    public RedPacketBuilder setPublishName(String publishName) {
        this.pulishName = publishName;
        return this;
    }

    @Override
    public RedPacketBuilder setReceiveName(String receiveName) {
        this.receiveName = receiveName;
        return this;
    }

    @Override
    public RedPacketBuilder setReceiveTime(Date receiceTime) {
        this.receiveTime = receiceTime;
        return this;
    }

    @Override
    public RedPacketBuilder setRedPacketPrice(BigDecimal redpacketPrice) {
        this.redpacketPrice = redpacketPrice;
        return this;
    }

    @Override
    public RedPacket build() {

        return new RedPacket(pulishName, receiveName, receiveTime, redpacketPrice);
    }
}
