package org.example.MoshDSA.Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[5];
    private int count;

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public void add(int item){
        if (count==items.length)
            throw new IllegalStateException();
        int i;
        for (i = count - 1;i>=0;i++){
            if (items[i]>item){
                items[i+1] = items[i];
            }
            else {
                break;
            }
            items[i+1]=item;
            count++;

        }


    }

    public int remove(){
        if (isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }
}
