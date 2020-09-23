package com.rajesh.org.test;

public class LRUCacheBinaryTreeEX {

    private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=right=null;
        }
        Node(){
            data=0;
            left=right=null;
        }
    }

    public Node add(Node node ,int data){
        Node newNode=null;
        if(data<node.data){
            newNode =new Node(data);
            newNode.right=node;
        }else if(data> node.data){
             newNode= new Node(data);
             newNode.left=node;
        }else{
            System.out.println("data exists...");
            newNode=node;
        }
        return newNode;
    }

    public int get(Node node,int data){
        Node newNode=null;
        if(data<newNode.data){
            get(node.left,data);
        }else if(data> node.data){
            get(node.right,data);
        }else if(data== node.data){
            Node left= node.left;
            Node right=node.right;
            newNode.left=left;
            newNode.right=right;
        }
        return newNode.data;
    }

}
