public class Main {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println(salaryCalculator.salaryMultiplier(4));
        System.out.println(salaryCalculator.salaryMultiplier(5));
        System.out.println(salaryCalculator.salaryMultiplier(6));
        System.out.println();
        System.out.println(salaryCalculator.bonusMultiplier(19));
        System.out.println(salaryCalculator.bonusMultiplier(20));
        System.out.println(salaryCalculator.bonusMultiplier(21));
        System.out.println(salaryCalculator.bonusForProductsSold(5));
        System.out.println("Hello world!");
    }
}