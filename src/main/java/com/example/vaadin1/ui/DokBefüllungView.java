package com.example.vaadin1.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class DokBefüllungView extends VerticalLayout {
    public DokBefüllungView() {
       Button button= new Button("click me");
       button.addClickListener(new Button.ClickListener() {
           @Override
           public void buttonClick(Button.ClickEvent clickEvent) {
               button.setCaption("haha");
           }
       });
        addComponent(button);
        ComboBox<String> box = new ComboBox<>();
        addComponent(new Label("deko"));
    }
}
