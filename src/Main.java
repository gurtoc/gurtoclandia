import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Story story = new Story();
        Hero shadya = new Hero();
        Rat rat = new Rat(10, 0, "Szczurek", 1);

        story.begginingOfStory();
        Creature goblin = new Creature(50, 20, "Piętaszek");

        System.out.println("Podaj swe imie bohaterze!");
        Scanner scanner = new Scanner(System.in);
        shadya.setName(scanner.next());
        System.out.println("Witaj " + shadya.getName() + " podaj swoją energię życiową");
        shadya.setHealth(scanner.nextInt());
        System.out.println("podaj swoją energię duchową");
        shadya.setMana(scanner.nextInt());
        System.out.println("podaj swoją siłę ataku");
        shadya.setAttackPower(scanner.nextInt());
        scanner.close();

        System.out.println("A więc " + shadya.getName() + " twoje życia to " + shadya.getHealth() + " twoja mana to: " + shadya.getMana() + " a siła ataku to: " + shadya.getAttackPower());
        System.out.println();

        story.quest1();
        System.out.println();


        if (shadya.WeakAttack() > rat.getHealth()) {
            System.out.println(shadya.getName() + " zabiła szczura w spiżarni jednym ciosem");
        } else {
            System.out.println("Za słąby atak - szczur przeżył");
            double hpAfterAttack = rat.getHealth() - shadya.WeakAttack();
            double hpHeroAfterAttack = shadya.getHealth() - rat.getAttack();
            System.out.println("Szczur ma: " + hpAfterAttack + " hp");
            do {
                Thread.sleep(1000);
                hpAfterAttack = hpAfterAttack - shadya.WeakAttack();

                 hpHeroAfterAttack = hpHeroAfterAttack - rat.getAttack();
                System.out.println(rat.getName() + " kontratakuje! " + shadya.getName() + " ma " + hpHeroAfterAttack + " hp");

                System.out.println(shadya.getName() + " ponawia atak! Szczur ma: " + hpAfterAttack + " hp");
                System.out.println();
//                if (hpAfterAttack>hpHeroAfterAttack){
//                    System.out.println("Szczur wygrał");
//                }else{
//                    System.out.println("shadya wygrała");
//                }

            } while ( hpHeroAfterAttack>=0 && hpAfterAttack>=0);

                System.out.println("szczur nie żyje!");

        }

//        if (shadya.WeakAttack() > rat.getHealth()) {
//            System.out.println(shadya.getName() + " zabiła szczura w spiżarni jednym ciosem");
//        } else {
//            for (int i = 0; i < rat.getHealth(); i++) {
//                int hpAfterAttack = rat.getHealth() - shadya.getAttackPower();
//                if (hpAfterAttack <= 0) {
//                    System.out.println("Szczur is dead");
//                } else {
//                    System.out.println("szczurowi pozostało punktów życia: " + hpAfterAttack);
//                }
//                ;
//            }
//        }


    }
}
