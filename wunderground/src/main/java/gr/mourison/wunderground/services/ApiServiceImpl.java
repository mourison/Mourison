package gr.mourison.wunderground.services;

import gr.mourison.wunderground.domain.FinalResponse;
import gr.mourison.wunderground.domain.ResponsePojo;
import gr.mourison.wunderground.tools.WriteExcelFile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTempate;

    public ApiServiceImpl(RestTemplate restTempate) {
        this.restTempate = restTempate;
    }

    @Override
    public ResponsePojo getResponse(String date) {

        ResponsePojo responsePojo = restTempate.getForObject("http://api.wunderground.com/api/e93fc0260f62dcc2/history_"+date+"/q/NY/New_York.json",ResponsePojo.class);
        String maxhumidity = "Max percentage humidity = " + responsePojo.getHistory().getDailysummary().get(0).getMaxhumidity().toString();
        String maxtempm = "Max Temp in C =" + responsePojo.getHistory().getDailysummary().get(0).getMaxtempm().toString();
        String mintempm = "Min Temp in C = " + responsePojo.getHistory().getDailysummary().get(0).getMintempm().toString();
        String precipm = "Precipitation in mm = " + responsePojo.getHistory().getDailysummary().get(0).getPrecipm().toString();
        String path="../fileExcel.xslx";
        FinalResponse finalResponse = new FinalResponse(maxhumidity,maxtempm,mintempm,precipm);
        List<FinalResponse> responseList = new ArrayList<>();
        responseList.add(finalResponse);
        WriteExcelFile.writeStudentsListToExcel(responseList,"../ExcelFile.xsls");
        return responsePojo;
    }
}
