import java.util.ArrayList;
import java.util.List;

public class DataBase {

    protected List<Employee> employeeList = new ArrayList<>() ;

    public boolean addEmployeeInDataBase ( Employee em ) {
        boolean isAdded = false ;
        if ( em != null ) {
            employeeList.add(em) ;
            isAdded = true ;
        }
        return isAdded ;
    }

    public void searchStringInData ( String stringToSearch ) {
        for ( Employee iterator : employeeList ) {
            if ( iterator.getFirstName().contains(stringToSearch) || iterator.getLastName().contains(stringToSearch) ) {
                System.out.println(iterator);
            }
        }
    }

    public void searchStringByPosition ( String stringToSearch ) {
        for ( Employee iterator : employeeList ) {
            if ( iterator.getEmployeePosition().equalsIgnoreCase(stringToSearch) ) {
                System.out.println(iterator);
            }
        }
    }

    public void printDataBase ( ) {
        for ( Employee it : employeeList ) {
            if ( it != null ) {
                System.out.println(employeeList);
            }
        }
    }

}
