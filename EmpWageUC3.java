
public class EmpWageUC3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        int IS_FULl_TIME=1;
        int wagePerHour=20;
        int fullDayHour=8;
        int partTimeHour=4;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULl_TIME)
        {
            System.out.println("Employee is present");
            System.out.println("Employee Daily Wage=" + fullDayHour * wagePerHour);
        }
        else if (empCheck == 0) {
            System.out.println("Employee is absent");
        }
        else
        {
            System.out.println("Employee Working per part time");
            System.out.println("Employee part time wage" +partTimeHour*wagePerHour);
        }

    }

}
