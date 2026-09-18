package BinarySearchTree1;

import java.util.Scanner;

public class ConstructingBinarySearchTree {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static class BinaryTree{
        Node root;
        Node insert(Node root,int data){
            if(root==null)return new Node(data);
            else if(data>root.data)
                root.right=insert(root.right,data);
            else
                root.left=insert(root.left,data);
            return root;
        }
        void preOrder(Node root){
            if(root==null)return;
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        Node delete(Node root,int key){
            if(root==null)return null;
            if(root.data>key)
                root.right=delete(root.right,key);
            else if(root.data<key)
                root.left=delete(root.left,key);
            else{
                if(root.left==null)return root.right;
                if(root.right==null)return root.left;
                Node Succ=root.right;
                while (Succ.left!=null){
                    Succ=Succ.left;
                }
                root.data=Succ.data;
                root.right=delete(root.right,Succ.data);
            }
            return root;
        }
    }
    public static void main(String args[]){
        BinaryTree b=new BinaryTree();
        Scanner s=new Scanner(System.in);

        while (s.hasNextInt()){
            int n=s.nextInt();
            b.root=b.insert(b.root,n);
        }
        b.preOrder(b.root);
    }
}
