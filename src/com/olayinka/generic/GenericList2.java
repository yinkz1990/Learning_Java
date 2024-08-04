package com.olayinka.generic;

import java.util.Arrays;
import java.util.Iterator;

public class GenericList2 <T> implements Iterable<T>{
    private T[] user = (T[]) new Object[10];
    private int count;

    public void addUser(T users){
        user[count++] =  users;
    }

    public T getUser(int index){
      return user[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new listIterator(this);
    }


    private class listIterator implements Iterator<T>{
    private GenericList2<T> list;
    private  int index;

    public listIterator(GenericList2<T> list){
        this.list = list;
    }
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.user[index++];
        }
    }
}
