package com.yt.builder;

import java.math.BigDecimal;
import java.util.Date;

public interface RedPacketBuilder {

    RedPacketBuilder setPublishName(String publishName);
    RedPacketBuilder setReceiveName(String receiveName);
    RedPacketBuilder  setReceiveTime(Date receiceTime);
    RedPacketBuilder setRedPacketPrice(BigDecimal redpacketPrice);

    RedPacket build();
}
