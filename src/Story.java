import java.util.Scanner;

public class Story {
    Hero hero = new Hero();

    public Story(Hero hero) {
        this.hero = hero;
    }

    public void begginingOfStory() {
        try {
            System.out.println("Witaj wędrowcze w świecie rządzonym przez króla Gurtoca..."
            );
            //Thread.sleep(2000, 100);
            System.out.println("...A raczej rządzonym, gdyż nasz władca został zamordowany przez wrogą królową sąsiadującego krórestwa Shantis");
            Thread.sleep(200);
            System.out.println("Musimy pomścić naszego władce - ");
            hero.getNameofObject();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void endofbegginingOfStroy(){
//
//        System.out.println("A więc " + hero.getName() + " twoje życia to " + hero.getHealth() + " twoja mana to: " + hero.getMana() + " a siła ataku to: " + hero.getAttackPower());
//        System.out.println();
//    }

    public void quest1() {
        try {
            System.out.println("Wygląda na to że formalności mamy za sobą...");
            // Thread.sleep(2000);
            System.out.println("Twoje pierwsze zadanie, może wydawać się nie na miarę twych oczekiwań, lecz bardzo przysłużysz się królestwu...");
            //Thread.sleep(4000);
            System.out.println("...Podczas ataku, wielu z naszych żołnierz zgineło w okolicach spiżarni - skąd nastąpił atak ze strony podbliskich kanałów. Martwe ciała tworzą zarazę, a darmowe pożywienie przyciąga szczury, którą tę zarazę rozmiosą po mieście...");
            Thread.sleep(400);
            System.out.println("Zejdz do podziemi i zajmij się szczurami, aby uniknąć kolejnego problemu dla naszego królewstwa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void quest1Complete() {
        System.out.println("Dzieki ci bohaterze, uchroniłeś nasze miasto od zarazy, pozwól że ofiaruję ci ten MIECZ, w dowód mego uznania");
    }

    public void quest1Reward() {
        System.out.println("Bohaterze twoj miecz doda Ci 10pkt - które możesz rozdzielić na wszystkie swoje statystyki");
        // int points =10;

         Scanner scanner2 = new Scanner(System.in);
        System.out.println("Co chcesz zwiększyc: hp, mana, attackpower");


        String choice = scanner2.nextLine();

        switch (choice) {
            case "hp":
                hero.setHealth(hero.getHealth() + 10);
                System.out.println("Twoje życia zwiększyły sie o 10!! Masz teraz: " + hero.getHealth() + "hp");
                break;
            case "mana":
                hero.setMana(hero.getAttackPower() + 10);
                System.out.println("Twoja mana zwiększyła się o 10!! Masz teraz: "+hero.getMana()+"hp");
                break;
            case "attackpower":

                hero.setAttackPower(hero.getAttackPower() + 10);
                System.out.println("Twój attack power zwiększył się o 10!! Masz teraz: "+hero.getAttackPower()+" attack power");
                break;

        }


    }


}

