package com.example.vaadin1.ui;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

public class Demo2 extends TabSheet {
    public Demo2() {
        //setSizeUndefined();
        this.setHeight("600");
        this.setWidth("900");

       addTab(new PDFPanel()).setCaption("pdf");
       addTab(new WORDPanel()).setCaption("word");





    }
}
