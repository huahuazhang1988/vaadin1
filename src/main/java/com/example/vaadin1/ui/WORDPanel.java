package com.example.vaadin1.ui;

import com.vaadin.ui.*;

public class WORDPanel extends AbsoluteLayout {
    public WORDPanel() {
        Label vorhabenLable = new Label("Vorhaben");
        vorhabenLable.setWidth("50px");
        addComponent(vorhabenLable, "left: 100px; top: 20px;");
        TextField vorhabenField = new TextField();
        //vorhabenField.setWidth("100px");
        addComponent(vorhabenField, "left: 200px; top: 20px;");
        Button lesen = new Button("Lesen");
        lesen.setWidth("100px");
        addComponent(lesen, "left: 320px; top: 20px;");

        Label vorgang = new Label("vorgang");
        vorgang.setWidth("50px");
        addComponent(vorgang, "left: 100px; top: 80px;");
        ComboBox<Object> vorgangCombobox = new ComboBox<>();
        addComponent(vorgangCombobox, "left: 200px; top: 80px;");

        Label aufgaben = new Label("Alle Aufgabe");
        aufgaben.setWidth("100px");
        addComponent(aufgaben, "left: 100px; top: 140px;");
        ComboBox<Object> aufgabenCombobox = new ComboBox<>();
        addComponent(aufgabenCombobox, "left: 200px; top: 140px;");

        Label aufgabeId = new Label("Aufgabe_Id");
        aufgabeId.setWidth("100px");
        addComponent(aufgabeId, "left: 100px; top: 260px;");
        TextField aufgabeIdField = new TextField();
        addComponent(aufgabeIdField, "left: 200px; top: 260px;");
        TextField vorgangId = new TextField();
        vorgangId.setWidth("50px");
        vorgangId.setVisible(true);
        addComponent(vorgangId, "left: 400px; top: 260px;");


        Label active_aufgaben = new Label("Active Aufgaben");
        addComponent(active_aufgaben, "left: 80px; top: 200px;");
        TextField active_aufgabenField = new TextField();
        addComponent(active_aufgabenField, "left: 200px; top: 200px;");


        Label vorlage = new Label("Vorlage");
        aufgabeId.setWidth("50px");
        addComponent(vorlage, "left: 100px; top: 320px;");
        TextField vorlageField = new TextField();
        vorhabenField.setWidth("100px");
        addComponent(vorlageField, "left: 200px; top: 320px;");
        Button durchsuchen = new Button("Durchsuchen");
        addComponent(durchsuchen, "left: 400px; top: 320px;");

        Button erstellen = new Button("Erstellen");
        erstellen.setWidth("200px");
        addComponent(erstellen, "left: 200px; top: 380px;");


    }
}
