public class EmpWageUC4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        int IS_FULl_TIME=1;
        int wagePerHour=20;
        int fullDayHour=8;
        int partTimeHour=4;

        int isPresent=(int)
        Math.floor(Math.random() * 3);
        switch (isPresent) {
            case 0:
                System.out.println("Employee is present");
                System.out.println("Employee Daily Wage=" + fullDayHour * wagePerHour);
                break;

            case 1:
                System.out.println("Employee Working per part time");
                System.out.println("Employee part time wage" + partTimeHour * wagePerHour);
                break;

            case 2:
                System.out.println("Employee is absent");
                System.out.println("Employee Wage=0");
                break;
        }

    }
}
