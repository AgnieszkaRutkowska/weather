package com.example.weather.models;

public class WeatherModel {

    private WeatherDetails main;
    private CloudsDetails clouds;


    public WeatherDetails getMain() {
        return main;
    }

    public void setMain(WeatherDetails main) {
        this.main = main;
    }

    public CloudsDetails getClouds() {
        return clouds;
    }

    public void setClouds(CloudsDetails clouds) {
        this.clouds = clouds;
    }

    public static class WeatherDetails {
        private double temp;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }
    }

    public static class CloudsDetails {
        private double all;

        public double getAll() {
            return all;
        }

        public void setAll(double all) {
            this.all = all;
        }
    }
}



