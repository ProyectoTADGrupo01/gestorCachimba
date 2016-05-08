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
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Fran13
 */
@Theme("mytheme")
@Widgetset("vista.MyAppWidgetset")
public class principalTrabajador extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout hl = new HorizontalLayout();
        setContent(hl);
        
        Label lb = new Label("HOla Mario");
        
        hl.addComponent(lb);
    }

    @WebServlet(urlPatterns = "/principalTrabajador/*", name = "principalTrabajadorServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = principalTrabajador.class, productionMode = false)
    public static class principalTrabajadorServlet extends VaadinServlet {
    }
}
