package com.github.mikan;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI
@Title("Hello World!")
public class HelloWorld extends UI {
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout content = new VerticalLayout();
        setContent(content);
        content.addComponent(new Label("Hello World!"));
        content.addComponent(new Button("すごーい!", click -> Notification.show("たーのしー!")));
    }
}
