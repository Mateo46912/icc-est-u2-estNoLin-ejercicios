package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    private Node root;

    public Depth(Node root) {
        this.root = null;
    }

    public Depth() {

    }

    public int maxDepthEnv() {
        int resultado = maxDepth(root);
        return resultado;
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int recorridoLeft = maxDepth(root.getLeft());
        int recorridoRight = maxDepth(root.getRight());
        return Math.max(recorridoLeft, recorridoRight) + 1;
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
