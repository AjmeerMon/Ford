package com.example.fordlivecodingtest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    MySet sut = new MySet();



    @Test public void isEmpty() {
        assertTrue(sut.isEmpty());
    }

    @Test public void isNonEmpty() {
        sut.add(5);
        assertFalse(sut.isEmpty());
    }


    @Test
    public void  addTwoValues() {
        sut.add(5);
        sut.add(6);
        assertEquals(sut.count , 2);
    }

    @Test
    public void  addThre4Values() {
        sut.add(5);
        sut.add(6);
        sut.add(7);
        assertEquals(sut.count , 3);
    }

    @Test
    public void  contains() {
        sut.add(5);
        sut.add(6);
        sut.add(7);

        assertTrue(sut.contains(6));
        assertFalse(sut.contains(8));
    }


    @Test
    public void remove() {
        sut.add(5);
        sut.add(6);
        sut.add(7);
        sut.add(8);

        sut.remove(6);
        assertFalse(sut.contains(6));
        assertEquals(sut.count , 3);

    }

    @Test
    public void testDuplicates() {
        sut.add(5);
        sut.add(5);
        assertEquals(sut.count , 1);
    }

    @Test
    public void testMultipleValues() {
        sut.add(5);
        sut.add(6);
        sut.add(7);
        sut.add(8);
        sut.add(9);
        sut.add(10);
        sut.add(11);
        assertEquals(sut.count , 7);
    }
}