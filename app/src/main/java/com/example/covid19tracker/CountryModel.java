package com.example.covid19tracker;

public class CountryModel {
    private String flag,country,todayCases,cases,deaths,todayDeaths,recovered,critical,active;

    public CountryModel() {
    }

    public CountryModel(String flag, String country, String todayCases, String cases, String deaths, String todayDeaths, String recovered, String critical, String active) {
        this.flag = flag;
        this.country = country;
        this.todayCases = todayCases;
        this.cases = cases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.recovered = recovered;
        this.critical = critical;
        this.active = active;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
