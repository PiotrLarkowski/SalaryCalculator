public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped>=5?0.85:1;
    }
}