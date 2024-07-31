package Javainterview;

import java.util.Arrays;
import java.util.Enumeration;

public class SeconlargestN {
    public static void main(String[] args) {

        int[] nu ={22,33,44,55,66,77};
        Arrays.sort(nu);

        System.out.println("Smallest"+" "+nu[0]);
        System.out.println("Biggest"+" "+nu[nu.length-4]);
        System.out.println("Second largest"+" "+nu[nu.length-5]);
    }
}
