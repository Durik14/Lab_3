package Lab_3;

public class NewGamePC {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void success(GamePC a) {
        if(a.getNumberEmployees()<=4 && a.getNumberSales() >=3 && a.getNumberSales()<7){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary()  + " + 4500 грн" + " грн" + ANSI_GREEN);}

        else if(a.getNumberEmployees()<= 4 && a.getNumberSales() >=7 && a.getNumberSales() <10){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary()  + " + 8000 грн" + " грн" + ANSI_GREEN);}

        else if(a.getNumberEmployees()<= 4 && a.getNumberSales() ==10){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary() + " + 12000 грн" + " грн" + ANSI_GREEN);}

        else if(a.getNumberEmployees()<= 4 && a.getNumberSales() > 10){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary()  + " * 2.5 грн" + " грн" + ANSI_GREEN);}

        else{
            System.out.println(ANSI_RESET + "Зарплата без премій: "+ a.getSalary() + " грн" + ANSI_RED);}
    }

}
