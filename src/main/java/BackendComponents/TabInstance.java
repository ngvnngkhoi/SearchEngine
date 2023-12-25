import javafx.scene.control.Tab;

public class TabInstance {
    private String Header;
    private URLInstance CurrentURL;
    private int TabID;

    public TabInstance(URLInstance CurrentURL, int TabID) {
        if (CurrentURL == null || CurrentURL.getHeader() == null) {
            this.Header = "New Tab";
        } else {
            this.Header = CurrentURL.getHeader();
        }
        
        this.CurrentURL = CurrentURL;
        this.TabID = TabID;
    }

    public String getHeader() {
        return Header;
    }

    public URLInstance getCurrentURL() {
        return CurrentURL;
    }

    public int getTabID() {
        return TabID;
    }

    public void setHeader(String header) {
        Header = header;
    }

    public void setCurrentURL(URLInstance currentURL) {
        CurrentURL = currentURL;
    }

    public Tab getTab() {
        Tab tab = new Tab(this.Header);
        tab.setId("Tab#" + Integer.toString(this.TabID));
        return tab;
    }
}