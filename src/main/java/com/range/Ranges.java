package com.range;

import com.google.common.collect.Range;
public class Ranges {

    public static void main(String[] args) {
        Range<Integer> closed = Range.closed(1, 10);
        Range<Integer> open = Range.open(1, 10);
        Ranges ranges =  new Ranges();
        ranges.getRange(closed);
        ranges.getRange(open);
    }

    public String getRange(Range<Integer> range) {
        return range.toString();
    }
}
