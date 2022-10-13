public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        service.calculate (1000000,  9.99, 12);
        double payment = service.calculate(1000000,  9.99, 12) ;
        System.out.println ("При сумме кредита в 1000.000 рублей сроком на 1 год ежемесячный аннуитетный платёж составит:  " + payment);

        service.calculate(1000000, 9.99, 24);
        payment = service.calculate(1000000, 9.99, 24);
        System.out.println("При сумме кредита в 1000.000 рублей сроком на 2 года ежемесячный аннуитетный платёж составит: " + payment);

        service.calculate(1000000, 9.99, 36);
        payment = service.calculate(1000000, 9.99, 36);
        System.out.println("При сумме кредита в 1000.000 рублей сроком на 3 года ежемесячный аннуитетный платёж составит: " + payment);
    }
}