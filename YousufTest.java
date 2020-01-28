package src;

import org.junit.Test;

import static org.junit.Assert.*;

public class YousufTest {

//This below method will test expected and actual output
    @Test
    public void longestWordWithLength() {

        String s = Yousuf.LongestWordWithLength("The cow jumped over the moon");
        assertEquals("jumped", s);
        assertEquals(6, s.length());

    }


}