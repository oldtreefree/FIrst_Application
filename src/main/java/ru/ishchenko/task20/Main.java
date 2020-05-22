package ru.ishchenko.task20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    private static final String URL = "https://www.metaweather.com/api/location/2122265/2020/05/22/";
    private static final String FORMAT = "Дата: %s\nСтатус погоды: %s\nМинимальная темпиратура: %s\nМаксимальная темпиратура: %s";


    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Weather[] weathers = mapper.readValue(new URL(URL), Weather[].class);
        Weather weather = weathers[0];
        System.out.println(String.format(FORMAT, weather.getApplicable_date(), weather.getWeather_state_name(), weather.getMin_temp(), weather.getMax_temp()));
    }
}
