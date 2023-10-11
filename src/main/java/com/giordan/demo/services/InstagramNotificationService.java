package com.giordan.demo.services;

import com.giordan.demo.enuns.NotificationType;
import com.giordan.demo.interfaces.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class InstagramNotificationService implements NotificationService {
    @Override
    public NotificationType sendNotification() {
        System.out.println("Sending Instagram notification...");
        return NotificationType.INSTAGRAM;
    }

    @Override
    public NotificationType getStrategyName() {
        return NotificationType.INSTAGRAM;
    }
}
