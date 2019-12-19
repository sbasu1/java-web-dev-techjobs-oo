package org.launchcode.techjobs_oo;

public abstract class EntityId {
     int id;
     static int nextId = 1;
      String value;// Getters and Setters:

     public int getId() {
          return id;
     }

     public String getValue() {
          return value;
     }

     public void setValue(String value) {
          this.value = value;
     }
}
