public class FixedBasedPartTime  extends PartTime {
    private int fixedamount;

    public FixedBasedPartTime(int fixedamount,int rate, float hours , String name, int age, gender gen ,Vehicle vehicle) {
        super( rate,  hours ,  name,  age, gen , vehicle);
        this.fixedamount = fixedamount;
    }

    public int getFixedamount() {
        return fixedamount;
    }

    public void setFixedamount(int fixedamount) {
        this.fixedamount = fixedamount;
    }

    public float calcEarnings()
    {
        return this.getFixedamount()+((float)this.getHours()*this.getRate());
    }



    @Override
    public String printData() {
        String temp = "Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nGender : "+this.getGen();

        if(this.getVehicle() != null)
        {
            if(this.getVehicle() instanceof Car)
                temp+= ((Car)this.getVehicle()).printData();
            else
                temp+= ((MotorCycle)this.getVehicle()).printData();
        }
        else
            temp += "\nEmployee has no Vehicle Registered";

        temp+="\nEmployee is PartTime / FixedBased "+"\n - Rate : "+this.getRate()+"\n - Hours : "+this.getHours()+"\n - Fixed amount : "+this.getFixedamount()+"\n - Earnings : "+this.calcEarnings()+"( "+((float)this.getHours()*this.getRate())+" + "+this.getFixedamount()+")";
        return temp;


    }
}
