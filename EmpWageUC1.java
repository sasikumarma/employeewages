public class EmpWageUC1 {
    public static final int IS_FULl_TIME = 1;
        public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage");
        double empCheck = Math.floor(Math.random() *10) %2;
        if (empCheck == IS_FULl_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");

    }
}
