public class CreditPaymentService {
    public double calculate(double credit, double percent, double months) {
        double oneMonth = percent / 12 / 100;
        double degree = 1 + oneMonth;
        double coefficient = Math.pow(degree, months) * oneMonth / (Math.pow(degree, months) - 1);
        double result = credit * coefficient;
        return (int) result;
    }

}
