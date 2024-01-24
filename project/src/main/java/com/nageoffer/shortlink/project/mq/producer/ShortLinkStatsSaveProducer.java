package com.nageoffer.shortlink.project.mq.producer;

import com.nageoffer.shortlink.project.common.constant.LinkRocketMQConstant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 短链接监控状态保存消息队列生产者
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ShortLinkStatsSaveProducer {

    private final RocketMQTemplate rocketMQTemplate;


    public SendResult sendMsg(Map<String, String> producerMap) {
        return rocketMQTemplate.syncSend(LinkRocketMQConstant.SHORT_LINK_STATS_STREAM_TOPIC_KEY, MessageBuilder.withPayload(producerMap).build());
    }
}
