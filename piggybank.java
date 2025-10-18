import java.util.*;

public class piggybank{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);             //PIGGY IMAGE
        System.out.println("      ^__^");
        System.out.println("     (oo)\\\\_______");
        System.out.println("     (__)\\       )\\/\\");
        System.out.println("         ||----w |");
        System.out.println("         ||     ||");
        System.out.println();
        System.out.println("        ╔═══════════════════════════════════════╗");
        System.out.println("        ║              PIGGY BANK               ║");
        System.out.println("        ╚═══════════════════════════════════════╝");


        System.out.println("\t\t\t--OPTIONS--");
        System.out.println("1) Add money");
        System.out.println("2) Withdraw money");
        System.out.println("3) Check balance");
        System.out.println("4) Exit");
        double balance=0;
        System.out.print("\nWhat action would you like to perform? ");
        int action=kb.nextInt();

        if(action==1){
            System.out.print("Enter amount to deposit:");
            
        }
        

    }

}
 