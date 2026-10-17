package lk.rasheeda.oodp.practical;

import java.util.HashMap;
import java.util.Map;

public class Request {

    private String url;

    private Map<String, String> parameters;


    public Request(String url) {
        this.url = url;
        this.parameters = new HashMap<>();

    }

    public String getUrl() {
        return url;
    }

    public void addParameter(String name, String value) {
        parameters.put(name, value);
    }

    public String getParameter(String name) {
        return parameters.get(name);
    }

    public boolean hasParameter(String name) {
        return parameters.containsKey(name);
    }

}
