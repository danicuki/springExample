package com.pravaler.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {

  private final String company;
  private final String number;
  private final String cityCode;

  public Phone(String company, String number, String cityCode) {
    this.company = company;
    this.number = number;
    this.cityCode = cityCode;
  }

  public Map<String, Integer> getPeople() {
    Map<String, Integer> list = new HashMap<String, Integer>();
    list.put("Daniel", 1);
    list.put("Fabio", 2);
    return list;
  }

  public String getCountry() {
    return "Brasil";
  }

  public String getCityCode() {
    return cityCode;
  }

  public String getCompany() {
    return company;
  }

  public String getNumber() {
    return number;
  }
}