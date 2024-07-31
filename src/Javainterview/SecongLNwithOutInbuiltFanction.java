package Javainterview;

public class SecongLNwithOutInbuiltFanction {
    public static void main(String[] args) {

        int[] number={22,33,44,55,66,77,88,89};
        int smallest =number[0];
        int Biggest=0;
        int Largest=0;

        for (int i=0; i<number.length; i++){
            int b=number[i];
            if (b>Biggest){
                Largest=Biggest;
                Biggest=b;
            } else if (b>Largest && b!=Largest) {
                Largest=b;

            }
              if (b<smallest){
                  smallest=b;
              }

        }
        System.out.println("Smallest" +"is number = " +smallest);
        System.out.println("Biggest"+Biggest);
        System.out.println("Secong largest"+ Largest);

    }
}
