package com.example.vaadin1.ui;

import com.vaadin.server.FileResource;
import com.vaadin.ui.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PDFPanel extends AbsoluteLayout implements  Upload.Receiver {
    File file;
    Panel imagePanel;
    TextField vorlageField;
    public PDFPanel() {
        setWidth("900px");
        setHeight("600px");


        Label vorhabenLable = new Label("Vorgaben");
        addComponent(vorhabenLable, "left: 100px; top: 20px;");
        TextField vorhabenField = new TextField();
        addComponent(vorhabenField, "left: 200px; top: 20px;");

        Label vorlageLable = new Label("Vorlage");
        addComponent(vorlageLable, "left: 100px; top: 80px;");
         vorlageField = new TextField();
        addComponent(vorlageField, "left: 200px; top: 80px;");

//        Button durchsuchen = new Button("Durchsuchen");
//        addComponent(durchsuchen, "left: 400px; top: 80px;");
        Upload upload = new Upload("", this);
        upload.setButtonCaption("Durchsuchen");
        addComponent(upload, "left: 400px; top: 80px;");
//        upload.addSucceededListener(this::uploadSucceeded);
//        upload.addFailedListener(this::uploadFailed);
        upload.addSucceededListener(new Upload.SucceededListener() {
            @Override
            public void uploadSucceeded(Upload.SucceededEvent succeededEvent) {
                Notification.show("done");
                vorhabenField.setValue("");
                final FileResource imageResource = new FileResource(file);
                String name = file.getAbsolutePath();
                vorlageField.setValue(name);

            }
        });
        upload.addFailedListener(new Upload.FailedListener() {
            @Override
            public void uploadFailed(Upload.FailedEvent failedEvent) {
                Notification.show("fail");

            }
        });


        Button erstellen = new Button("Erstellen");
        addComponent(erstellen, "left: 200px; top: 150px;");
        erstellen.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {


            }
        });


    }

//    @Override
//    public void uploadFailed(Upload.FailedEvent event) {
//        Notification.show("fail");
//    }
//
//    @Override
//    public void uploadSucceeded(Upload.SucceededEvent event) {
//        Notification.show("done");
//        final FileResource imageResource = new FileResource(file);
//        String name = file.getAbsolutePath();
//        vorlageField.setValue(name);
//    }

    @Override
    public OutputStream receiveUpload(String filename, String MIMEType) {
        FileOutputStream fos = null;
      file = new File( filename);
        try {
            fos = new FileOutputStream(file);
        } catch (final java.io.FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return fos;


    }
}
