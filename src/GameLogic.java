
import java.util.Scanner;

public class GameLogic {

    public void hello(){
        char choose;
        System.out.print("Hello! You want to play the game? Entered (y/n): ");
        Scanner scan = new Scanner(System.in);
        choose = scan.next().charAt(0);

        if (choose == 'y'){
            System.out.println("Game started!!!");
        }else{
            System.out.println("Have nice day. Good Bye :(");
            System.exit(0);
        }
    }

    //public void nameHero() {

    //    String n;
     //   System.out.println("Entered name you Hero: ");
     //   Scanner scan = new Scanner(System.in);
     //   n = scan.nextLine();
     //   System.out.println("You hero name: " + n);

    //}

    public void choose(){

        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        System.out.println("Please, choose you hero:  ");
        System.out.println("1. " + hero.getPaladin());
        System.out.println("2. " + hero.getBarbarian());
        System.out.println("3. " + hero.getDwarf());
        System.out.println("4. " + enemy.getTroll());
        System.out.println("5. " + enemy.getOrk());
        int choose;
        System.out.print("Select the number of your future hero: ");
        Scanner scan = new Scanner(System.in);
        choose = scan.nextInt();
       String n;
        System.out.println("Entered name you Hero: ");
        Scanner scan1 = new Scanner(System.in);
        n = scan1.nextLine();

        switch (choose){
            case 1:
                System.out.println("Congratulations, you have chosen: " + hero.getPaladin() + " He is name  " + n + "!");
                break;
            case 2:
                System.out.println("Congratulations, you have chosen: " + hero.getBarbarian() + " He is name  " + n + "!");
                break;
            case 3:
                System.out.println("Congratulations, you have chosen: " + hero.getDwarf() + " He is name  " + n + "!");
                break;
            case 4:
                System.out.println("Congratulations, you have chosen Enemy: " + enemy.getTroll() + " He is name  " + n + "!");
                break;
            case 5:
                System.out.println("Congratulations, you have chosen Enemy: " + enemy.getOrk() + " He is name  " + n + "!");
                break;
            default:
                System.out.println("Error");


        }
    }
}
