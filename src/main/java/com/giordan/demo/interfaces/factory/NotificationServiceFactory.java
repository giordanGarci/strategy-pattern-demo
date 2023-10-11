package com.giordan.demo.interfaces.factory;

import com.giordan.demo.enuns.NotificationType;
import com.giordan.demo.interfaces.NotificationService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class NotificationServiceFactory {

    private Map<NotificationType, NotificationService> strategies = new HashMap<>();

    public NotificationServiceFactory(Set<NotificationService> strategySet){
        createStrategy(strategySet);
    }

    public NotificationService findStrategy(NotificationType notificationType){
        return strategies.get(notificationType);
    }

    private void createStrategy(Set<NotificationService> strategySet){
        strategySet.forEach(strategy -> strategies.put(strategy.getStrategyName(), strategy));
    }
}
