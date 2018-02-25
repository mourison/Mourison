package gr.mourison.wunderground.services;

import gr.mourison.wunderground.domain.ResponsePojo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTempate;

    public ApiServiceImpl(RestTemplate restTempate) {
        this.restTempate = restTempate;
    }

    @Override
    public ResponsePojo getResponse() {

        ResponsePojo responsePojo = restTempate.getForObject("http://api.wunderground.com/api/e93fc0260f62dcc2/history_20171030/q/NY/New_York.json",ResponsePojo.class);
        System.out.println(responsePojo.getHistory().getDate());
        return responsePojo;
    }
}
