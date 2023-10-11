package com.giordan.demo.interfaces;

import com.giordan.demo.enuns.NotificationType;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService extends StrategyBase<NotificationType> {
    NotificationType sendNotification();
}
