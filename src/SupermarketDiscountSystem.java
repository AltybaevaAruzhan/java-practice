import java.util.Scanner;
public class SupermarketDiscountSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 3 items: ");
        int price1 = scanner.nextInt();
        int price2 = scanner.nextInt();
        int price3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Do you have a discount card(yes/no): ");
        String card = scanner.nextLine();
        int total = price1+price2+price3;
        if(card.equals("yes")){
            int dicount = total/10;
            int finalPrice = total-total/10;
            System.out.printf("Total: %d₸\n", total);
            System.out.printf("Discount: %d₸\n", dicount);
            System.out.printf("Final: %d₸\n", finalPrice);
        } else if(card.equals("no")){
            System.out.printf("You didn't have a discount card. Total: %d₸\n", total);

        }
    }
}
