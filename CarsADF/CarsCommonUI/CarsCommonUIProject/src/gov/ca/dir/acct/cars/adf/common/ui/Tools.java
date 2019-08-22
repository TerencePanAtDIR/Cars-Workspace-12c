package gov.ca.dir.acct.cars.adf.common.ui;

import java.io.IOException;

import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;

public class Tools {
    public Tools() {
        super();
    }

    public void refreshCurrentPage(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        String currentView = context.getViewRoot().getViewId();
        ViewHandler vh = context.getApplication().getViewHandler();
        UIViewRoot page = vh.createView(context, currentView);
        context.setViewRoot(page);
    }

    public void formatEmailPage(ActionEvent actionEvent) {
        try {
            ExternalContext externalContext =
                FacesContext.getCurrentInstance().getExternalContext();
            HttpServletRequest request =
                (HttpServletRequest)externalContext.getRequest();
            String url =
                request.getScheme() + "://" + request.getServerName() + ":" +
                request.getServerPort();
            String contextPath =
                externalContext.getRequestContextPath() + "/" +
                externalContext.getRequestServletPath() + "/" +
                externalContext.getRequestPathInfo();
            String actionString =
                "?org.apache.myfaces.trinidad.agent.email=true";
            externalContext.redirect(url + contextPath + actionString);
        } catch (IOException e) {
            return;
        }
    }
}
