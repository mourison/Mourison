package gr.mourison.wunderground.services;


import gr.mourison.wunderground.domain.ResponsePojo;

public interface ApiService {

    public ResponsePojo getResponse(String date);

}
