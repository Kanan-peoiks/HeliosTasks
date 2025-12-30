package ferdi;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static int height(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        scan.nextLine();
        int[] arr = new int[n];
        int left = 0;
        int right = arr.length-1;

        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }


        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = arr[i];
            if (root == null) {
                root = new Node(data);
                continue;
            }

            Node current = root;
            while (true) {
                if (data <= current.data) {
                    if (current.left == null) {
                        current.left = new Node(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = new Node(data);
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }

    System.out.println(height(root));

    }
}


