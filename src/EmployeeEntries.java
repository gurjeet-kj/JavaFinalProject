import java.util.ArrayList;
public class EmployeeEntries {
        static EmployeeEntries empObj = null;
        ArrayList<Employee> empArrList;
        Double totalSalary=0.0;
        private EmployeeEntries()
        {
            empArrList = new ArrayList<>();
        }
        public static EmployeeEntries getObj()
        {
            if(empObj == null)
                empObj = new EmployeeEntries();
            return empObj;
        }
        public void addIntoList(Employee temp)
        {
            empArrList.add(temp);
            totalSalary+=temp.calcEarnings();
        }
        public void  displayList()
        {
            for(Employee e : this.empArrList)
            {
                System.out.print(e.printData());
                System.out.println("\n-----------------------------");
            }
            System.out.print("TOTAL PAYROLL: "+totalSalary+" Canadian Dollars");
        }



    }
