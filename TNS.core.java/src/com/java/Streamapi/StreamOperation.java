package com.java.Streamapi;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamOperation {
	public static long countEmptyString(Stream<String> stream) {
		long count=0;
		count=stream.filter(x->x.isEmpty()).count();
		return count;
		
	}
	public static long showStats(Stream<Integer> stream) {
		IntSummaryStatistics stats= stream.mapToInt((x)->x).summaryStatistics();
		stats.getMax();
		stats.getMin();
		stats.getAverage();
		stats.getCount();
		System.out.println("Max= "+stats.getMax());
		System.out.println("Min= "+stats.getMin());
		System.out.println("Avg= "+stats.getAverage());
		System.out.println("Count= "+stats.getCount());
		return 0;
	}

}
