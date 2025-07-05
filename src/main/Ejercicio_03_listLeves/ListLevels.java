package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
    private Node root;

    public ListLevels(Node root) {
        this.root = null;
    }

    public ListLevels() {

    }

    public void listLevelsEnv() {
        List<List<Node>> Levels = listLevels(root);
        for (List<Node> list : Levels) {
            System.out.println();
            for (Node nodo : list) {
                System.out.print(nodo.getValue()+" -> ");
            }
            System.out.print("null");
        }
    }

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int sizeLevels = queue.size();
            List<Node> auxList = new ArrayList<>();

            for (int i = 0; i < sizeLevels; i++) {
                Node temp = queue.poll();
                auxList.add(temp);

                if (temp.getLeft() != null) {
                    queue.add(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.add(temp.getRight());
                }
            }

            result.add(auxList);
        }

        return result;
    }

    public void printTree() {
        printTreeNode2(root, "", true);
    }

    public void printTreeNode2(Node root, String prefix, boolean isLeft) {

        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode2(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode2(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

    public void insertEnv(int value) {
        root = insert(root, value);
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            Node newNodo = insert(root.getLeft(), value);
            root.setLeft(newNodo);
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));

        }
        return root;
    }
}
