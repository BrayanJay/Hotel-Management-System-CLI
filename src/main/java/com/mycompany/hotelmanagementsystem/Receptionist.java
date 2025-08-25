package com.mycompany.hotelmanagementsystem;

public class Receptionist extends HotelStaff{
    private String workingShift;

    public Receptionist(String name, String surname, String workingShift){
        super(name,surname);
        this.workingShift = workingShift;
    }

    public String getWorkingShift(){
        return this.workingShift;
    }

    public void setWorkingShift(String workingShift){
        this.workingShift = workingShift;
    }

    @Override
    public String toString() {
        return super.toString() + " Receptionist - Working Shift: " + workingShift ;
    }
}
