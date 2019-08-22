package gov.ca.dir.acct.cars.adf.usecase004.view;

import java.util.Collection;
import java.util.Collections;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.apache.myfaces.trinidad.convert.ClientConverter;

public class BooleanCheckboxConverter implements ClientConverter,
                                                 javax.faces.convert.Converter {
    public BooleanCheckboxConverter() {
        super();
    }

    public String getClientLibrarySource(FacesContext facesContext) {
        return null;
    }

    public Collection<String> getClientImportNames() {
        return Collections.emptySet();
    }

    public String getClientScript(FacesContext facesContext,
                                  UIComponent uIComponent) {
        return null;
    }

    public String getClientConversion(FacesContext facesContext,
                                      UIComponent uIComponent) {
        return null;
    }

    public Object getAsObject(FacesContext facesContext,
                              UIComponent uIComponent, String string) {
        return "true".equals(string) ? "Y" : "N";
    }

    public String getAsString(FacesContext facesContext,
                              UIComponent uIComponent, Object object) {
        return "Y".equals(object) ? "true" : "false";
    }
}
