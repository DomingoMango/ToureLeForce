package com.example.myapplication;

import android.util.Log;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public void BFS()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll()

            Node Node = queue.poll();
            Log.i("log",Node.data+"");

            //Mete en cola el izquierdo
            if (Node.left != null) {
                queue.add(Node.left);
            }

            //Mete en cola el derecho
            if (Node.right != null) {
                queue.add(Node.right);
            }
        }
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;

        //Se recorre hacia el izquierdo
        printInorder(node.left);


        Log.i("log",node.data+"");

        //se recorre al derecho
        printInorder(node.right);
    }
    public void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);


        Log.i("log",node.data+"");
    }
    void printPreorder(Node node)
    {
        if (node == null)
            return;


        Log.i("log",node.data+"");

        //Se recorre hacia la izquierda
        printPreorder(node.left);

        //se recorre a la derecha
        printPreorder(node.right);
    }
}

