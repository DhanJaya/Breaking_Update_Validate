package com.range;

import com.google.common.collect.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangesTest {

    @Test
    public void testRange(){
        Ranges ranges = new Ranges();
        String expected = "[1..10]";
        Assertions.assertEquals(expected, ranges.getRange( Range.closed(1, 10)));
    }
}
