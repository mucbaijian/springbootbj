package com.java.baijian.springtestTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计划任务执行类
 * Created by baijian on 16-9-3.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormate = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.printf("每隔五秒执行：" + dateFormate.format(new Date()));
    }

    @Scheduled(cron = "10 24 23 ? * *")
    public void fixTimeExcution() {
        System.out.printf("指定时间：" + dateFormate.format(new Date()) + "执行！");
    }
}


