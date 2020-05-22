package ru.ishchenko.task20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather implements Serializable {

    private String weather_state_name;
    private double min_temp;
    private double max_temp;
    private String applicable_date;


    public Weather() {
    }

    public String getApplicable_date() {
        return applicable_date;
    }

    public String getWeather_state_name() {
        return weather_state_name;
    }

    public double getMin_temp() {
        return min_temp;
    }

    public double getMax_temp() {
        return max_temp;
    }
}
