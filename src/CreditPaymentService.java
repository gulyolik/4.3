public class CreditPaymentService {
    public double calculate(double credit, double percent, double months) {
        double oneMonth = percent / 12 / 100;
        double y = 1 + oneMonth;
        double coefficient = Math.pow(y, months) * oneMonth / (Math.pow(y, months) - 1);
        double result = credit * coefficient;
        return (int) result;
    }

}
