package cn.coderon.zhongrong3_0.service;

import cn.coderon.zhongrong3_0.bean.Channel;

import java.util.List;

public interface ChannelService {
    List<Channel> getChannel(Integer companyId);

    int addChannel(Channel channel);
}
