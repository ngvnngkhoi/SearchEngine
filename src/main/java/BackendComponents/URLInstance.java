public class URLInstance {
    private String Query;
    private URLInstance PrevURL;
    private URLInstance NextURL;
    private String Header;

    public URLInstance(String Query, URLInstance PrevURL, String Header) {
        this.Query = Query;
        this.PrevURL = PrevURL;
        this.Header = Header;
    }

    public String getQuery() {
        return Query;
    }

    public URLInstance getPrevURL() {
        return PrevURL;
    }

    public URLInstance getNextURL() {
        return NextURL;
    }

    public String getHeader() {
        return Header;
    }

    public void setQuery(String query) {
        this.Query = query;
    }

    public void setNextURL(URLInstance nextURL) {
        this.NextURL = nextURL;
    }

}