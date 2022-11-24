import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SpeSkillTest();
    }

    public static void SpeSkillTest(){


        NarcissisticNumber narcissisticNumber = new NarcissisticNumber();
        NarcissisticNumber.X x = (a, l)->{
            int s=0;for(byte c:a.getBytes())s+=Math.pow(c-48,l);
            return a.equals(""+s);
        };

        ParityOutlier parityOutlier = new ParityOutlier();

        NeedleInTheHaystack needleInTheHaystack = new NeedleInTheHaystack();

        System.out.println("Soal 1 ");
        System.out.println("_______________");
        System.out.println("nrcsNumber 1 : "+x.n("153",3));
        System.out.println("nrcsNumber 2 : "+x.n("111",3));
        System.out.println("_______________");
        System.out.println("Soal 2 ");
        System.out.println("_______________");
        System.out.println("parity 1 : "+parityOutlier.find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));
        System.out.println("parity 2 : "+parityOutlier.find(new int[]{160, 3, 1719, 19, 11, 13, -21}));
        System.out.println("_______________");
        System.out.println("Soal 3 ");
        System.out.println("_______________");
        System.out.println(needleInTheHaystack.findNeedle(new String[]{"red", "blue", "yellow", "black", "grey"},"blue"));


    }





}