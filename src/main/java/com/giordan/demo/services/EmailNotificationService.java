package com.giordan.demo.services;

import com.giordan.demo.enuns.NotificationType;
import com.giordan.demo.interfaces.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
   @Override
    public NotificationType sendNotification(){
        System.out.println("Sending email notification...");
        return NotificationType.EMAIL;
    }

    @Override
    public NotificationType getStrategyName() {
        return NotificationType.EMAIL;
    }
}
