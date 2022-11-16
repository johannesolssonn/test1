import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
       //Övning1
        /* int [] array1 = new int[10];
        int [] array2 = new int[10];
        Random random = new Random();
        for(int i = 0;i<10;i++){
            array1 [i] = random.nextInt(20);
        }
        for(int i = 0;i<10;i++) {
            array2[i] = random.nextInt(20);
        }
        Arrays.sort(array1);//sorterar i nummer ordning
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));*/

        //Övning3
        /*Random random = new Random();
        ArrayList<Integer> integersArrayList = new ArrayList<>();
        for (int i = 0; i<15;i++){
            int randomArray = random.nextInt(10-1)+1;// skriver in att den ska köra 1-10
            integersArrayList.add(randomArray);
        }
        System.out.println(integersArrayList);
        System.out.println(integersArrayList.contains(1));
        System.out.println(integersArrayList.contains(2));
        if(integersArrayList.indexOf(1)<integersArrayList.indexOf(2)){
            System.out.println("ettan ligger före tvåan");
        }else if (integersArrayList.indexOf(1)>integersArrayList.indexOf(2)){
            System.out.println("Tvåan ligger förre ettan");
        }else {
            System.out.println("Finns inte 1 eller 2 i array");
        }*/

               //Övning 4
               /*Random random = new Random();

                ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

                for (int i = 0; i < 10 ; i++){
                    integerArrayList.add(random.nextInt(20-1)+1);
                }

                System.out.println(integerArrayList);

                if(integerArrayList.contains(5)){
                    System.out.println("The number 5 is in the list");
                    System.out.println("The amount of number 5 in the list: " +
                            Collections.frequency(integerArrayList, 5));
                } else {
                    System.out.println("Number 5 is not in the list");
                }*/

        //Övning 5
        /*ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();

        Random random = new Random();
        for (int i = 0;i<10;i++){
            ArrayList1.add(random.nextInt((20-1)+1));
            ArrayList2.add(random.nextInt((40-21))+21);
        }
        for (int z = 0;z < 10; z++){
            ArrayList3.add(ArrayList1.get(z));
            ArrayList3.add(ArrayList2.get(z));
        }
        System.out.println(ArrayList1);
        System.out.println(ArrayList2);
        System.out.println(ArrayList3);*/
        //Övning 6

        /*ArrayList<Character> arrayListBokstaver = new ArrayList<>();
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Tenent mordicus. Plane idem, inquit, \n" +
                "et maxima quidem, qua fieri nulla maior potest. Hoc est non dividere, sed frangere. Duo Reges: \n" +
                "constructio  interrete.  Propter  nos  enim  illam,  non  propter  eam  nosmet  ipsos  diligimus. \n" +
                "Conferam tecum, quam cuique verso rem subicias; Naturales divitias dixit parabiles esse, quod \n" +
                "parvo esset natura contenta. Nulla erit controversia.";
        text = text.toLowerCase();

        for (int i = 0; i < text.length();i++){
            arrayListBokstaver.add(text.charAt(i));
        }
        int vowelscounter = 0;
       /* char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';*/

       /* for(int x = 0; x<arrayListBokstaver.size();x++){
            if ((arrayListBokstaver.get(x).equals('a')|| (arrayListBokstaver.get(x).equals('e'))
                    ||(arrayListBokstaver.get(x).equals('i')) ||(arrayListBokstaver.get(x).equals('o'))
                    || (arrayListBokstaver.get(x).equals('u')))){
            vowelscounter = vowelscounter +1;
            }

        } System.out.println("Resultat: " + vowelscounter);*/
       /*String LoremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Tenent mordicus. Plane idem, inquit, \n" +
                "et maxima quidem, qua fieri nulla maior potest. Hoc est non dividere, sed frangere. Duo Reges: \n" +
                "constructio  interrete.  Propter  nos  enim  illam,  non  propter  eam  nosmet  ipsos  diligimus. \n" +
                "Conferam tecum, quam cuique verso rem subicias; Naturales divitias dixit parabiles esse, quod \n" +
                "parvo esset natura contenta. Nulla erit controversia.";
        LoremIpsum = LoremIpsum.toLowerCase();
        String vowel = "aeiou";
        int counts = 0;
        ArrayList<Character> vowels = new ArrayList<>();
        for (int i = 0;i<vowel.length();i++){
            vowels.add(vowel.charAt(i));
        }
        for(int i = 0; i <LoremIpsum.length(); i++){
            if (vowels.contains(LoremIpsum.charAt(i)));
            counts++;
        }
        System.out.println("Number of vowels in the string LoremIpsum are: " + counts);*/

        //Övning 7
        /*ArrayList<Integer> guessGame= new ArrayList<>(10);
        for(int i=0; i<10; i++){
            guessGame.add(i);
        }
        Collections.shuffle(guessGame);
        var scan = new Scanner(System.in);

        boolean guessRight = false;
        for(int i = 0; i<3; i++){
            System.out.println("Guess eher is number five from 0 to 9 ");
            int guessing = scan.nextInt();

            if(guessGame.indexOf(5)==guessing){
                System.out.println("Won");
                guessRight = true;
                break;
            }

        }if(guessRight==false){
            System.out.println("Lost ");
        }*/



        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i<50;i++){
        Random random = new Random();
        arrayList.add(random.nextInt(3));

        }
        System.out.println(arrayList);

        int frekvenceAv0 = Collections.frequency(arrayList, 0);//skriver ut antal gånger nån av siffrorna dyker upp i arrayen
        int frekvenceAv1 = Collections.frequency(arrayList, 1);
        int frekvenceAv2 = Collections.frequency(arrayList, 2);

        System.out.println("frekvens för 0: " + frekvenceAv0 + "\nfrekvens för 1: "
                + frekvenceAv1 + "\nfrekvens för 2: " + frekvenceAv2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose number between 0-2");
        int choseNumber = scanner.nextInt();

        switch (choseNumber){
            case 0:
                if (frekvenceAv0> frekvenceAv2 && frekvenceAv0 > frekvenceAv1){
                    System.out.println("user wins a price");
                }else {
                    System.out.println("user not wins price");
                }
                break;
            case 1:
                if (frekvenceAv1>frekvenceAv2 && frekvenceAv1 > frekvenceAv0){
                    System.out.println("user wins a price");
                }else {
                    System.out.println("user not wins price");
                }
                break;
            case 2:
                if (frekvenceAv2>frekvenceAv0 && frekvenceAv2>frekvenceAv1){
                    System.out.println("user wins a price");
                }else {
                    System.out.println("user not wins price");
                }
                break;
            default:
                System.out.println("Man måste skriva 0,1,2: ");
        }
        System.out.println("frekvens för 0: " + frekvenceAv0 + "\nfrekvens för 1: "
                + frekvenceAv1 + "\nfrekvens för 2: " + frekvenceAv2);
    }
}
