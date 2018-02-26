package gr.mourison.wunderground.domain;

public class FinalResponse {
    private String maxhumidity;
    private String maxtempm;
    private String mintempm;
    private String precipm;

    public FinalResponse(String maxhumidity, String maxtempm, String mintempm, String precipm) {
        this.maxhumidity = maxhumidity;
        this.maxtempm = maxtempm;
        this.mintempm = mintempm;
        this.precipm = precipm;
    }

    public String getMaxhumidity() {
        return maxhumidity;
    }

    public String getMaxtempm() {
        return maxtempm;
    }

    public String getMintempm() {
        return mintempm;
    }

    public String getPrecipm() {
        return precipm;
    }

    public void setMaxhumidity(String maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    public void setMaxtempm(String maxtempm) {
        this.maxtempm = maxtempm;
    }

    public void setMintempm(String mintempm) {
        this.mintempm = mintempm;
    }

    public void setPrecipm(String precipm) {
        this.precipm = precipm;
    }
}
