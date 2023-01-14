public class Course {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Albus Doumbldoor", 1, 5000);
        employees[1] = new Employee("Minerva MacGonnagol", 1, 4500);
        employees[2] = new Employee("Severus Snape", 2, 4000);
        employees[3] = new Employee("Sivilla Trelonee", 2, 2000);
        employees[4] = new Employee("Harry Potter ", 3, 500);
        employees[5] = new Employee("Hermione Granger", 3, 400);
        employees[6] = new Employee("Ronald Weaslie", 4, 300);
        employees[7] = new Employee("Nevil Longbottom", 4, 10);
        employees[8] = new Employee("Draco Malfoy", 5, 200);
        employees[9] = new Employee("Geenie Weeslie", 5, 1000);

        printFullNameAllEmployees();

        printAllEmployee();
        getAndCalculateSalarySum();
        getAndCalculateSalarySum();
        getEmployeeMaxSalary();
        getEmployeeMinSalary();


    }

    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }

    }

    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {


                sum = sum + employees[i].getSalary();
            }

        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {

                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
                index = i;
                break;
            }

        }
        if (minSalaryEmployee == null) return null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmployee = employees[i];

                }
            }

        }
        return minSalaryEmployee;

    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {

                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                index = i;
                break;
            }

        }
        if (maxSalaryEmployee == null) return null;
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];

                }
            }

        }
        return maxSalaryEmployee;
    }

    public static double getAndCalculateAverageSalary() {
        double sumAllEmployeesSalary = getAndCalculateSalarySum();
        if (employees.length != 0) {
            return  sumAllEmployeesSalary / employees.length;

        } else {
            return 0;
        }
    }

    public static void printFullNameAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullNam());
            }

        }
    }
}











