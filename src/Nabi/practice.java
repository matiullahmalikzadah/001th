package Nabi;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.Style;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;

public class practice {
    public static void main(String[] args) {

    int[] number={3,4,5,6,7,8,9};
    int smallest=number[0];
    int large=0;
    int large2= 0;

    for (int i=0; i<number.length; i++) {
        int element = number[i];
        if (element > large) {
            large2 = large;
            large = element;

        } else if (element>large2 && element!=large) {

        }
        if (element<smallest){
            smallest=element;
        }
        System.out.println("Smallest"+smallest);
    }


    }}






