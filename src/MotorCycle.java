public class MotorCycle extends Vehicle {
    private String motomodelnumber;

    public MotorCycle(String motomodelnumber,String make, String plate, int mileage) {
        super(make, plate, mileage);
        this.motomodelnumber = motomodelnumber;
    }

    public String getMotomodelnumber() {
        return motomodelnumber;
    }

    public void setMotomodelnumber(String motomodelnumber) {
        this.motomodelnumber = motomodelnumber;
    }

    @Override
    public String printData() {

        return "\nEmployee has a MotorCycle"+"\n - Make : "+this.getMake()+"\n - Plate : "+this.getPlate()+"\n - Motorcycle Model : "+this.getMotomodelnumber()+"\n";
    }




}
