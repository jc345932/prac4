import java.util.Scanner;

/**
 * Created by jc345932 on 17/08/17.
 */
public class CondoSales {
    public static void main(String[] args){
        int choice;
        int price;
        String result;
        final int Park_PR = 150000,
                Golf_PR = 170000,
                Lake_PR = 210000;
        final String Park_Str = "Park view",
                Golf_Str = "Golf course view",
                Lake_Str = "Lake view",
                Invalid_Str = "Invalid Code";
        Scanner selection = new Scanner(System.in);
        System.out.println("Type what view you need: ");
        System.out.println("(1)"+Park_Str);
        System.out.println("(2)"+Golf_Str);
        System.out.println("(3)"+Lake_Str);
        System.out.println("Enter 1, 2, or 3");
        choice = selection.nextInt();
        if (choice == 1){
            price = Park_PR;
            result = Park_Str;
        }
        else
            if (choice == 2){
            price = Golf_PR;
            result = Golf_Str;
            }
            else
                if (choice ==3){
                price = Lake_PR;
                result =Lake_Str;
                }else{
                    result = Invalid_Str;
                    price = 0;
                }
        System.out.println("You selected " + result + " $" + price);
    }
}
