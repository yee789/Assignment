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
public interface QueueInterface<T> {
    public void enqueue(T newElement);
        public T dequeue();
        public T getFront();
        public boolean isEmpty();
        public void clear();
       public int length();

}
