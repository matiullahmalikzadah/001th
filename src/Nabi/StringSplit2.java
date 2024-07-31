package Nabi;

public class StringSplit2 {
    public static void main(String[] args) {
        String D="I love Afghnaistan and also I miss my country";
        String [] splittedSub= D.split("");
        System.out.println(splittedSub.length);

        for (int i=0; i<splittedSub.length;i++){
            System.out.println(splittedSub[i]);
        }
    }
}
