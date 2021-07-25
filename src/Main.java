public class Main {

    public static void main(String[] args) {

        FullTime fulltime = new FullTime(2000, 500,"Gurjeet KJ", 30, gender.FEMALE ,new Car("Camry","Toyota" , "CA 003", 150));
        Intern intern = new Intern("Lambton School","Jivesh Makkar", 20, gender.MALE , null);
        CommissionBasedPartTime commisionparttime = new CommissionBasedPartTime(20, 30, 10, "Janakiram Gupta", 27 , gender.MALE ,new MotorCycle("Honda Unicorn","Honda" , "CA 002", 162) );
        FixedBasedPartTime fixedparttime = new FixedBasedPartTime(1000, 30, 10,"Akhil Madhishety", 27 , gender.MALE ,new Car("Bentayga S","Bentley" , "CA 001", 180) );

        EmployeeEntries  singleton = EmployeeEntries.getObj();
        singleton.addIntoList(fulltime);
        singleton.addIntoList(intern);
        singleton.addIntoList(commisionparttime);
        singleton.addIntoList(fixedparttime);

        singleton.displayList();

    }

}

