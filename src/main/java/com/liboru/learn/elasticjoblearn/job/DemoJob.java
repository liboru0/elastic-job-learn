package com.liboru.learn.elasticjoblearn.job;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoJob implements SimpleJob {
    private final Logger logger = LoggerFactory.getLogger(DemoJob.class);

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("shardingTotalCount: " + shardingContext.getShardingTotalCount());
        logger.info("shardingItem: " + shardingContext.getShardingItem());
        logger.info("shardingParameter: " + shardingContext.getShardingParameter());
    }
}
