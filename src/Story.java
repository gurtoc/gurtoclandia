public class Story {
    Hero hero = new Hero();

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

    public void quest1(){
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


}
