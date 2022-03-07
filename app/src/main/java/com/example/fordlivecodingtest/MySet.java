package com.example.fordlivecodingtest;

public class MySet {

    public  int count;
    private int[] numbers;

    MySet() {
        count = 0;
        numbers = new int[6];  //[0,0,0,0,0,0]
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(int value) {

        if (!contains(value)) {
            numbers[count] = value;
            count = count + 1;
        }

        if (count == numbers.length) {
           int[] temp = new int[numbers.length * 2];
           for (int i = 0; i < numbers.length; i++) {
               temp[i] = numbers[i];
           }
           numbers = temp;
        }

    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }
// [5,6,7,8,0,0]


    // [5,7,8,0,0,0]

    public void remove(int value) {

        int index = indexOf(value);

        if (index == -1) {
            return;
        }

        numbers[index] = numbers[count - 1];
        // [5,8,7,8,0,0]
        numbers[count - 1] = 0;
        // [5,8,7,0,0,0]
        count = count -1;
    }

    private  int indexOf(int value) {
        int index = -1;
        for(int i = 0; i < count; i ++ ) {
            if (numbers[i] == value ) {
                index = i;
                break;
            }
        }
        return  index;
    }
}
