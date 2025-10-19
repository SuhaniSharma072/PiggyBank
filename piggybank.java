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
        boolean running=true;
        double balance=0;


        //find way to keep it going//
        while (running) {
            System.out.println("\t\t\t--OPTIONS--");
            System.out.println("1) Add money");
            System.out.println("2) Withdraw money");
            System.out.println("3) Check balance");
            System.out.println("4) Exit");
            
            System.out.println("\t\t\tBalance: "+"$"+balance);
            System.out.print("\nWhat action would you like to perform? ");
            int action=kb.nextInt();

            if(action==1){
                System.out.print("Enter amount to deposit:");
                double deposit=kb.nextDouble();
                balance+=deposit;
                System.out.println("\t\t\tBalance: "+"$"+balance);
            
            }else if(action==2){
                System.out.print("Enter amount to withdraw:");
                double withdrawal=kb.nextDouble();
                balance-=withdrawal;
                System.out.println("\t\t\tBalance: "+"$"+balance);
            }else if(action==3){
                System.out.println("Here is your current balance: "+"$"+balance);
            }else if(action==4){
                System.out.println("Thanks for visiting! Have a nice day!");
                running=false;
            }

            //System.out.print("\nWhat action would you like to perform?");
        }
        
        kb.close();
        

    }


}

  