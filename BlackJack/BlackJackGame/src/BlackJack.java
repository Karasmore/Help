import java.util.Scanner;


public class BlackJack {
    public static void basicInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vítejte v Black Jacku u pane Karase");
        System.out.println("Teď si ujasníme princip hry:");
        System.out.println("Základní princip hry je, že hráč chce mít hodnotu karet blíže 21 než bankéř, " +
                "ale přitom 21 nepřekročit. Vyhrává ten, kdo má po ukončení hry v ruce nejvyšší součet, aniž by překročil 21.");
        System.out.println("Hráč, který má v ruce součet karet větší než 21, je takzvaně  „přes“.");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Chcete začít hru pokud chcete napište 1");


    }
    public static void checkInput(int x){


        if(x==1){

        }else{
            System.out.println("Hra je ukončena, jestli chcete hrát napište 1");
            System.exit(0);

        }
    }
    public static void bet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ze začátku dostáváte 100KČ jako bonus ˘-˘");
        int gift = 100;
        System.out.println("Napište prosím svojí sázku");
        int value = sc.nextInt();

        if(value>gift){
            System.out.println("Přesáhli jste limit, napište svojí sázku prosím znovu");


        }else{
            gift = gift - value;
            System.out.println("Zbývá vám na účtě zatím " + gift + " KČ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        basicInfo();
        checkInput(sc.nextInt());


        bet();




    }
}
