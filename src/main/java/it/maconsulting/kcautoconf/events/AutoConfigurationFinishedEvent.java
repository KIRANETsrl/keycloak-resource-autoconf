package it.maconsulting.kcautoconf.events;

import org.springframework.context.ApplicationEvent;

public class AutoConfigurationFinishedEvent extends ApplicationEvent {
    private String message;

    public AutoConfigurationFinishedEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}