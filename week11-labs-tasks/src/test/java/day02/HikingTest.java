package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
    Hiking hiking=new Hiking();
    Double[] heights1 = {0.0,-3.0,5.0,10.0,-20.0,-10.0};
    Double[] heights2 = {0.0,3.0,-5.0,-10.0,20.0,10.0};
    Double[] heights3 = {0.0,-3.0,-5.0,-10.0,-20.0,-100.0};
    Double[] heights4 = {0.0,3.0,5.0,10.0,20.0,100.0};


    @Test
    void test() {
        assertEquals(23.0, hiking.getPlusElevation(Arrays.asList(heights1)));
        assertEquals(33.0, hiking.getPlusElevation(Arrays.asList(heights2)));
        assertEquals(0.0, hiking.getPlusElevation(Arrays.asList(heights3)));
        assertEquals(100.0, hiking.getPlusElevation(Arrays.asList(heights4)));
    }

}