public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditPaiment_1 = service.calculate(9.99, 12,1000000);
        System.out.println(creditPaiment_1);
        long creditPaiment_2 = service.calculate(9.99, 24,1000000);
        System.out.println(creditPaiment_2);
        long creditPaiment_3 = service.calculate(9.99, 36,1000000);
        System.out.println(creditPaiment_3);
    }
}
