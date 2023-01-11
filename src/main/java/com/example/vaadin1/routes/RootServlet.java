package com.example.vaadin1.routes;

import com.example.vaadin1.ui.DokumentBefuellungUi;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*",name = "DokumentBefuellung",asyncSupported = true)
@VaadinServletConfiguration(ui= DokumentBefuellungUi.class,productionMode = false)
public class RootServlet extends VaadinServlet {
}
