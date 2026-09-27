package com.mycompany.fitnesscentreapp;

public class ExerciseBike extends GymnEquipment {

    private final String equipmentName;
    private final String zone;
    private final int hoursUsed;

    // Constructor
    public ExerciseBike (String equipmentName, String zone, int hoursUsed) {
        super(equipmentName, zone, hoursUsed);

        this.equipmentName = equipmentName;
        this.zone = zone;
        this.hoursUsed = hoursUsed;
    }

    @Override
    public String getEquipmentName() {
        return equipmentName;
    }

    @Override
    public String getZone() {
        return zone;
    }

    @Override
    public int getHoursUsed() {
        return hoursUsed;
    }

    @Override
    public boolean needsService() {

        // An Exercise Bike requires service if it has been
        // used for more than 350 hours.
        if (hoursUsed > 350) {
            return true;
        }

        return false;
    }
}