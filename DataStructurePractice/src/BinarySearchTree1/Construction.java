package BinarySearchTree1;

import java.util.Scanner;

public class Construction {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    public static class BST{
        Node root;
        Node insert(Node root,int data){
            if(root==null)
                return  new Node(data);
            else if(root.data<data)
                root.right=insert(root.right,data);
            else
                root.left=insert(root.left,data);
            return root;

        }
        boolean search(Node root,int key){
            if(root==null)return false;
            if(root.data==key)return true;
            return (root.data>key)?search(root.left,key):search(root.right,key);
        }
        void print(Node root){
            if(root==null)
                return;
            System.out.print(root.data+" ");
            print(root.left);
            print(root.right);
        }
        Node FindMinimum(Node root){
         while (root.left!=null){
             root=root.left;
         }
         return  root;
        }
        Node FindMaximum(Node root){
            while (root.right!=null){
                root=root.right;
            }
            return  root;
        }
        Node delete(Node root,int element){
            if(root==null)return null;
            if(root.data>element)
                root.left=delete(root.left,element);
            else if(root.data<element)
                root.right=delete(root.right,element);
            else {
                if(root.left==null)return root.right;
                if(root.right==null)return root.left;

                Node succ=minNode(root.right);
                root.data=succ.data;
                root.right=delete(root.right,succ.data);

            }
           return  root;
        }
        Node minNode(Node root){
            while (root.left!=null){
                root=root.left;
            }
            return root;
        }

    }
    public static void main(String  args[]){
        BST b=new BST();

        int a[]={50,10,20,30,25,15,25,35,60,70,80,90,55,65,78,85,95};
        for(int i=0;i<a.length;i++){
            int element=a[i];
            b.root=b.insert(b.root,element);

        }
        b.print(b.root);
        System.out.println();
        System.out.println(b.search(b.root,20));

        System.out.println(b.FindMaximum(b.root).data);
        System.out.println(b.FindMinimum(b.root).data);
        b.delete(b.root,20);
        b.print(b.root);
    }
}
