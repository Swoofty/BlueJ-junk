
/**
 * Write a description of class MonsterRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MonsterRunner
{
    public static void main(String[] args)
    {
        bad2 bruhMan = new bad2();
        
        bruhMan.setHasCoat(false);
        bruhMan.setHasHat(true);
        bruhMan.setnumEyes(2);
        bruhMan.setnumLegs(2);
        bruhMan.setnumButtons(2);
        
        System.out.println(bruhMan.getNumLegs());
        System.out.println(bruhMan.getNumEyes());
        System.out.println(bruhMan.getNumLegs());
        bruhMan.walk();
        bruhMan.addLeg();
        bruhMan.increaseEyes(3128);
        System.out.println(bruhMan.getNumLegs());
        System.out.println(bruhMan.getNumEyes());
        System.out.println(bruhMan.getNumLegs());
        bruhMan.addMultipleLegs(69);
        System.out.println(bruhMan.getNumLegs());
        
        System.out.print(bruhMan.gethasCoat());
        
    }
}
