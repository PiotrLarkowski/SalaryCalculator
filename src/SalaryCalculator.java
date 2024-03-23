public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped>=5?0.85:1;
    }
    public int bonusMultiplier(int productsSold) {
        return productsSold>=20?13:10;
    }
    public double bonusForProductsSold(int productsSold) {
        return productsSold<=20?productsSold*10:productsSold*13;
    }
}