package Singleton;

import java.util.Arrays;
import java.util.List;

public class EarlyExample1 {

    public static void main(String[] args) {
        GetEmployeeNameWithIdNumber instance = GetEmployeeNameWithIdNumber.getGetEmployeeNameWithIdNumber();

        String employeeName = instance.getEmployeeName(2);
        System.out.println(employeeName);
    }

}

class GetEmployeeNameWithIdNumber{
    private static GetEmployeeNameWithIdNumber getEmployeeNameWithIdNumber=new GetEmployeeNameWithIdNumber();
    public static GetEmployeeNameWithIdNumber getGetEmployeeNameWithIdNumber() {
        return getEmployeeNameWithIdNumber;
    }

    private String employeeName;

    private static List<String> employeeList = Arrays.asList("ahmet","mehmet","selim");

    private GetEmployeeNameWithIdNumber() {
    }

    public String getEmployeeName(int id){
        if(id >3 || id == 0){
            return "please enter the number less than 3 and greater than 0";
        }
        switch (id){
            case 1 -> {return employeeList.get(0);}
            case 2 -> {return employeeList.get(1);}
            default ->{return employeeList.get(3);}
        }
    }
}
