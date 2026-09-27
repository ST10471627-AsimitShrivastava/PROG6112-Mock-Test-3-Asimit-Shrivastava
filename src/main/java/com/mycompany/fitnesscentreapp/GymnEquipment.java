package com.mycompany.fitnesscentreapp;

// Question 2.2 

public abstract class GymnEquipment implements IGymnEquipment {
    
    private final String equipmentName;

    private final String zone;

    private final int hoursUsed;

    // Creates iTreadmill with all required details
    public GymnEquipment(String equipmentName, String zone, int hoursUsed) {
        this.equipmentName = equipmentName;
        this.zone = zone;
        this.hoursUsed = hoursUsed;
    }
}
