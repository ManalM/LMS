package com.example.books.lms;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public  class headeritem implements List<headeritem> {

    public  String title;
    public  int image_titel;

    public headeritem(String title, int image_titel) {
        this.title = title;
        this.image_titel = image_titel;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<headeritem> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(headeritem headeritem) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends headeritem> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends headeritem> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public headeritem get(int index) {
        return null;
    }

    @Override
    public headeritem set(int index, headeritem element) {
        return null;
    }

    @Override
    public void add(int index, headeritem element) {

    }

    @Override
    public headeritem remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<headeritem> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<headeritem> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<headeritem> subList(int fromIndex, int toIndex) {
        return null;
    }
}
