public class Main {
    public static void main(String[] args) {
        int[] sales = {1, 12, 13, 62, 17, 13};
        SalesManager salesManager1 = new SalesManager(sales);
        System.out.println(salesManager1.max());
    }
}
