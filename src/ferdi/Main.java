package ferdi;

import java.util.*;


public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int data = scan.nextInt();

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


        levelOrder(root);

    }
}


