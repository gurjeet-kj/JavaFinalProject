
public class FullTime extends Employee {
    private int salary;
    private int bonus;




    public FullTime(int salary, int bonus,String name, int age, gender gen, Vehicle vehicle) {
        super(name,age, gen ,vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calcEarnings() {

        return this.getSalary()+this.getBonus();
    }



    @Override
    public String printData() {
        String temp ="Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nGender : "+this.getGen();
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
        temp+="Employee is Full time"+"\n - Bonus : "+this.getBonus()+"\n - Salary : "+this.getSalary()+"\n - Earnings : "+ this.calcEarnings();


        return temp;
    }


}
