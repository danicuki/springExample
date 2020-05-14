package com.pravaler.spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhoneLister {

  // public PhoneLister(PhoneFinder finder) {
  // this.finder = finder;
  // }

  public List<Phone> phonesOwnedByCompany(String arg) {
    List<Phone> allPhones = finder.findAll();
    for (Phone phone : new ArrayList<Phone>(allPhones)) {
      if (!phone.getCompany().equals(arg))
        allPhones.remove(phone);
    }
    return allPhones;
  }

  @Autowired
  private PhoneFinder finder;

  // public void setFinder(PhoneFinder finder) {
  // this.finder = finder;
  // }

}