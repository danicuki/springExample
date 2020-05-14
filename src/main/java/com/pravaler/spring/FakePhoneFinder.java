package com.pravaler.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FakePhoneFinder implements PhoneFinder {

  @Autowired
  private FileSystemRegistry fileSystemRegistry;

  public void setFileSystemRegistry(FileSystemRegistry fileSystemRegistry) {
    this.fileSystemRegistry = fileSystemRegistry;
  }

  public FakePhoneFinder() {
  }

  public List<Phone> findAll() {
    List<Phone> list = new ArrayList<Phone>();
    list.add(new Phone("PRAVALER", "12344456", "SP"));
    list.add(new Phone("PRAVALER", "6789", "RJ"));
    list.add(new Phone("PRAVALER", "10111213", "MG"));
    return list;
  }

}