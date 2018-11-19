import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Story story = new Story();
        Hero shadya = new Hero();
        Rat rat = new Rat(10,0,"Szczurek");

        story.begginingOfStory();
        Creature goblin = new Creature(50, 20, "Piętaszek");

        System.out.println("Podaj swe imie bohaterze!");
        Scanner scanner = new Scanner(System.in);
        shadya.setName(scanner.next());
        System.out.println("Witaj "+shadya.getName()+" podaj swoją energię życiową");
        shadya.setHealth(scanner.nextInt());
        System.out.println("podaj swoją energię duchową");
        shadya.setMana(scanner.nextInt());
        System.out.println("podaj swoją siłę ataku");
        shadya.setAttackPower(scanner.nextInt());
        scanner.close();

        System.out.println("A więc "+shadya.getName()+" twoje życia to "+shadya.getHealth()+" twoja mana to: "+shadya.getMana()+" a siła ataku to: "+shadya.getAttackPower());
        System.out.println();

        story.quest1();
        System.out.println();

        if (shadya.WeakAttack()>rat.getHealth()){
            System.out.println(shadya.getName()+" zabiła szczura w spiżarni jednym ciosem");
        }else
        {
            int hpAfterAttack = rat.getHealth()-shadya.getAttackPower();
            System.out.println("szczurowi pozostało punktów życia: "+hpAfterAttack);
        }




    }
}
