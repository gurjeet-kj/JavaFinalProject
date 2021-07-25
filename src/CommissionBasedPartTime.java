public class CommissionBasedPartTime extends PartTime {


    private int commission;


    public CommissionBasedPartTime(int commission, int rate, float hours, String name, int age , gender gen , Vehicle vehicle) {
        super(rate, hours, name, age, gen , vehicle);
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public float calcEarnings()
    {
        return ((float)this.getCommission()/100*(this.getHours()*this.getRate()))+(this.getHours()*this.getRate());
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
        {
            temp += "\nEmployee has no Vehicle Registered";
        }
        temp+="\nEmployee is PartTime / Commissioned"+"\n - Rate : "+this.getRate()+"\n - Hours : "+this.getHours()+"\n - Commission : "+this.getCommission()+"\n - Earnings : "+this.calcEarnings()+"( "+((float)this.getHours()*this.getRate())+" + "+this.getCommission()+"% of "+((float)this.getHours()*this.getRate())+")";
        return temp;
    }



}
