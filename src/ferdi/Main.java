package ferdi;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

class Difference {
private int[] elements;
public int maximumDifference;

    public Difference(int[] elements, int maximumDifference) {
        this.elements = elements;
        this.maximumDifference = maximumDifference;
    }

    void computeDifference(){
        int max = elements[0];
        int min = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        maximumDifference = max - min;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Difference d = new Difference(a, 0);
        d.computeDifference();
        System.out.println(d.maximumDifference);


        }
}

