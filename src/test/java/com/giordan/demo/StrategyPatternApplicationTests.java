package com.giordan.demo;

import com.giordan.demo.enuns.NotificationType;
import com.giordan.demo.interfaces.NotificationService;
import com.giordan.demo.interfaces.factory.NotificationServiceFactory;
import com.giordan.demo.services.EmailNotificationService;
import com.giordan.demo.services.WhatsAppNotificationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyPatternApplicationTests {

	@Autowired
	private NotificationServiceFactory notificationServiceFactory;

	@Test
	public void sendNotificationTeste() {
		sendNotification(NotificationType.INSTAGRAM);
	}

	private void sendNotification(NotificationType notificationType){
		notificationServiceFactory.findStrategy(notificationType).sendNotification();
	}

}
