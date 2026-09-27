package com.mycompany.fitnesscentreapp;

 // Question 2.1 
 // Interface that defines the information every vehicle must provide.
 
public interface IGymnEquipment {
    String getEquipmentName();
    String getZone();
    int getHoursUsed();
    boolean needsService();
}
