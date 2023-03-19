public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long discount = service.calculate (500, true);
        System.out.println(discount);
    }

}
