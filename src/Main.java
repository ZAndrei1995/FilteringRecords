public class Main {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee("John","Johnson","Manager","2016 12 31");
        Employee secEmployee = new Employee("Tou","Xiong","Software Engineer","2016 10 05");
        Employee thirdEmployee = new Employee("Michaela","Michaelson","District Manager","2015 12 19");
        Employee forthEmployee = new Employee("Jake","Jacobson","Programmer"," ");
        Employee fifthEmployee = new Employee("Jacquelyn","Jackson","DBA"," ") ;
        Employee sixEmployee = new Employee("Sally","Weber","Web Developer","2015 12 18") ;

        DataBase dataBase = new DataBase() ;

        dataBase.addEmployeeInDataBase(firstEmployee);
        dataBase.addEmployeeInDataBase(secEmployee) ;
        dataBase.addEmployeeInDataBase(thirdEmployee) ;
        dataBase.addEmployeeInDataBase(forthEmployee) ;
        dataBase.addEmployeeInDataBase(fifthEmployee) ;
        dataBase.addEmployeeInDataBase(sixEmployee) ;
        dataBase.printDataBase();

        System.out.println("Results : ");
        dataBase.searchStringInData("Jac") ;

        System.out.println("Results founded by position: ");
        dataBase.searchStringByPosition("district manager");

    }
}
