package com.yt.builder;

import java.math.BigDecimal;
import java.util.Date;


public class RedPacket {

    private String pulishName;
    private String receiveName;
    private Date   receiveTime;
    private BigDecimal redpacketPrice;

    public RedPacket(String pulishName, String receiveName, Date receiveTime, BigDecimal redpacketPrice) {
        this.pulishName = pulishName;
        this.receiveName = receiveName;
        this.receiveTime = receiveTime;
        this.redpacketPrice = redpacketPrice;
    }

    public String getPulishName() {
        return pulishName;
    }

    public void setPulishName(String pulishName) {
        this.pulishName = pulishName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public BigDecimal getRedpacketPrice() {
        return redpacketPrice;
    }

    public void setRedpacketPrice(BigDecimal redpacketPrice) {
        this.redpacketPrice = redpacketPrice;
    }

    @Override
    public String toString() {
        return "RedPacket{" +
                "pulishName='" + pulishName + '\'' +
                ", receiveName='" + receiveName + '\'' +
                ", receiveTime=" + receiveTime +
                ", redpacketPrice=" + redpacketPrice +
                '}';
    }
}
