import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
    private static final int AMOUNT_OF_DEALS = 5;
    private static final List<Homestead> deal = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите цену за кв.м");
            int price = scanner.nextInt();
            generateDeal();
            for (int i = 0 ;i<deal.size(); i++){
                if (deal.get(i).getPrice() >= price ){
                    System.out.println(deal.get(i) + "честная сделка");
                }
            }
        }
    }

    public static void generateDeal() {
        for (int i = 0; i < AMOUNT_OF_DEALS; i++) {
            double length = 4 + Math.random() * 8;
            double width = 5 + Math.random() * 8;
            int price = 3 + (int) (Math.random() * 100);
            deal.add(new Homestead(length,width,price));
        }
    }
}
