import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        String login = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if(login.equalsIgnoreCase("aruzhan")){
            boolean hasDigit = false;
            for (int i =0; i<password.length(); i++)
                if(Character.isDigit(password.charAt(i))){
                    hasDigit=true;
                    break;
                }
            if(hasDigit){
                System.out.println("Welcome, Aruzhan!");
            }else{
                System.out.println("The password doesn't contain a number!!!");
            }
        }else{
                System.out.println("The login is not Aruzhan!!!");
            }
    }
}
