/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partD;

/**
 *
 * @author Yee
 */
public class LinkedQueue<T> implements QueueInterface<T>, java.io.Serializable {

    private Node lastNode; //references last node in queue
    private int n;
    public LinkedQueue() {
        lastNode = null;
        n=0;
    }

    public void enqueue(T newEntry) {

        Node newNode = new Node(newEntry);

        if (lastNode == null) {
            lastNode = newNode;
            lastNode.setNextNode(lastNode);
           
        } else {

            if (lastNode.getNextNode() == null) {
                lastNode.setNextNode(newNode);
                newNode.setNextNode(lastNode);
            } else {
                newNode.setNextNode(lastNode.getNextNode());
                lastNode.setNextNode(newNode);
            }
        }

        lastNode = newNode;
        n++;
    }

    public T dequeue() {
        T entry;

        if (isEmpty()) { 
            return null;
        } else
        if (lastNode.getNextNode().equals(lastNode)) {
            entry = lastNode.getData();
            lastNode.setData(null); 
            lastNode.next = null; 
            n--;
            return entry;
            
        } else {

            Node nodeToRemove = lastNode.getNextNode();
            Node newFirstNode = lastNode.getNextNode().getNextNode();

            entry = nodeToRemove.getData();
            nodeToRemove.next = null; 

            lastNode.next = newFirstNode;
            n--;
            return entry;
            
        }
        
    }

    public T getFront() {
        T front = null;

        if (!isEmpty()) {
            front = lastNode.getNextNode().getData();
        }

        return front;
    }

    public boolean isEmpty() {
        // Returns true if this queue is empty; otherwise, returns false.
        boolean result = false;
        if (lastNode == null || lastNode.next == null) {
            result = true;;
        }

        return result;
    }

    public void clear() {
        lastNode = null;
    }

    @Override
    public int length() {
        return n;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Node implements java.io.Serializable {

        private T data; 
        private Node next;

        private Node() {
            data = null;
            next = null;
        }

        private T getData() {
            return data;
        }

        private Node(T dataPortion) {
            data = dataPortion;
            next = null;
        }

        private Node(Node nextNode) {
            data = null;
            next = nextNode;
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }

        private void setData(T entry) {
            data = entry;
        }

        private Node getNextNode() {
            return next;
        }

        private void setNextNode(Node entry) {
            next = entry;
        }

    }
}
