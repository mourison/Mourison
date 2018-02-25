
package gr.mourison.wunderground.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class History implements Serializable
{

    private Date date;
    private Utcdate utcdate;
    private List<Observation> observations = null;
    private List<Dailysummary> dailysummary = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5139544488999959797L;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utcdate getUtcdate() {
        return utcdate;
    }

    public void setUtcdate(Utcdate utcdate) {
        this.utcdate = utcdate;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    public List<Dailysummary> getDailysummary() {
        return dailysummary;
    }

    public void setDailysummary(List<Dailysummary> dailysummary) {
        this.dailysummary = dailysummary;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
