package com.example.vaadin1.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
@SpringUI
public class DokumentBefuellungUi extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        this.setContent(new Demo2());
    }
}
