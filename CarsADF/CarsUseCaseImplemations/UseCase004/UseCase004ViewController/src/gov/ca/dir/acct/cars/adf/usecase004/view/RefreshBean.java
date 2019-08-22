package gov.ca.dir.acct.cars.adf.usecase004.view;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class RefreshBean {
    private RichTable toRefresh;

    public RefreshBean() {
    }

    public void doRefresh(ReturnEvent returnEvent) {
        AdfFacesContext ctx = AdfFacesContext.getCurrentInstance();
        ctx.addPartialTarget(getToRefresh());
    }

    public void setToRefresh(RichTable toRefresh) {
        this.toRefresh = toRefresh;
    }

    public RichTable getToRefresh() {
        return toRefresh;
    }
}
