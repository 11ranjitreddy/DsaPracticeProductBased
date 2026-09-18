//package BinaryTree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class ConstructingBinaryTree {
//    public static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data=data;
//        }
//    }
//    static Node buildTree(int a[]){
//        if(a.length==0 ||a[0]==-1)
//            return null;
//
//        Node root=new Node(a[0]);
//
//        Queue<Node> q=new LinkedList<>();
//        q.add(root);
//
//        Node current=q.poll();
//        int i=1;
//        if(i<a.length && a[i]!=-1){
//
//        }
//
//
//    }
//    public static void main(String args[]){
//        int a[]={1,2,3,4,5,-1,6};
//
//        Node root=buildTree(a);
//        inorder(root);
//    }
//}
