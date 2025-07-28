// Question-1
class Employee {
    public static void main(String args[]) {
        double BasicSalary = 12000.0;
        double HRA = 0.15 * BasicSalary;
        double DA = 1.1 * BasicSalary;
        double PF = 0.12 * BasicSalary;
        double GrossSalary = BasicSalary + HRA + DA;
        double NetSalary = GrossSalary - PF;
        System.out.println("Basic Salary : " + BasicSalary);
        System.out.println("HRA : " + HRA);
        System.out.println("DA : " + DA);
        System.out.println("PF : " + PF);
        System.out.println("GrossSalary : " + GrossSalary);
        System.out.println("NetSalary : " + NetSalary);
    }
}
