package com.giordan.demo.services;

import com.giordan.demo.enuns.NotificationType;
import com.giordan.demo.interfaces.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppNotificationService implements NotificationService {
    @Override
    public NotificationType sendNotification(){
        System.out.println("Sending WhatsApp notification...");
        return NotificationType.WHATSAPP;
    }

    @Override
    public NotificationType getStrategyName() {
        return NotificationType.WHATSAPP;
    }
}
