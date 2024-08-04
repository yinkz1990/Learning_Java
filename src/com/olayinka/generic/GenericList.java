package com.olayinka.generic;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    private T[] item = (T[]) new Object[10];
    private int count;

    public void add(T items){
        item[count++] = items;
    }

    public T getItem(int index){
        return item[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterable(this);
    }

    private class ListIterable implements Iterator{
       private GenericList<T> itemList;
       private int index;

       public ListIterable(GenericList<T> item){
           this.itemList = item;
       }
        @Override
        public boolean hasNext() {
            return (index < itemList.count);
        }

        @Override
        public Object next() {
            return itemList.item[index++];
        }
    }
}
