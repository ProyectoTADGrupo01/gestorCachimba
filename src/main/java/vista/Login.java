/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Fran13
 */
@Theme("mytheme")
@Widgetset("vista.MyAppWidgetset")
public class Login extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        HorizontalLayout form = new HorizontalLayout();
        setContent(form);
        form.setMargin(true);

        Button b = new Button("Enviar");
        b.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                getUI().getPage().setLocation("/principalTrabajador");
            }
        });

    }

    @WebServlet(urlPatterns = "/login/*", name = "LoginServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = Login.class, productionMode = false)
    public static class LoginServlet extends VaadinServlet {
    }

}
