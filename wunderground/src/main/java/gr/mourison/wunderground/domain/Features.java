
package gr.mourison.wunderground.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Features implements Serializable
{

    private Integer history;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1822112186372695979L;

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
