package cn.coderon.zhongrong3_0.service.impl;

import cn.coderon.zhongrong3_0.bean.Channel;
import cn.coderon.zhongrong3_0.dao.ChannelMapper;
import cn.coderon.zhongrong3_0.service.ChannelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Resource
    private ChannelMapper channelMapper;
    @Override
    public List<Channel> getChannel(Integer companyId) {
        return channelMapper.getChannel(companyId);
    }

    @Override
    public int addChannel(Channel channel) {
        channel.setCreateTime(new Date());
        channel.setUpdateTime(new Date());
        channel.setStatus(1);
        return channelMapper.insertSelective(channel);
    }
}
