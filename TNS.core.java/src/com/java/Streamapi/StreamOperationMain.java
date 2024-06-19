package com.java.Streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamOperationMain {
	public static void main(String args[]) {
	 List<String> strList= Arrays.asList("Mumbai","Pune","Nasik","Nagpur","","");
	 System.out.println(strList);
	 Stream<String> stream = strList.stream();
	 long result= StreamOperation.countEmptyString(stream);
	 System.out.println(result);
	 StreamOperation.showStats(stream);
	}
}