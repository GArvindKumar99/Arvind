package com.te.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMap {
 
	public static void main(String[] args) {
		
	
    HashMap<Object,Integer> ca = new HashMap<Object,Integer>();

 
   System.out.println( ca.put("abc",1));
   System.out.println( ca.put("abc",2));
   System.out.println( ca.put("abc",3));
   System.out.println( ca.put("abc",4));
   System.out.println(ca.keySet());
    ca.put("xyz",2);
    ca.put("def",3);
    ca.put("hef",3);
    ca.put("kef",3);
    ca.put("lef",3);
    ca.put("fef",3);
    ca.put("yef",3);
    ca.put("aef",3);
    ca.put("xef",3);
    ca.put("mef",3);
    ca.put("aef",3);
    ca.put("nef",3);
    ca.put("pef",3);
    ca.put(0,3);
    
    Set<Entry<Object, Integer>> entrySet = ca.entrySet();
    for (Entry<Object, Integer> entry : entrySet) {
    	if(entry.getKey().equals("xyz"))
    			{
    		entry.setValue(1234);
    		
    			}
    	System.out.println(entry);
		
	}
   
    System.out.println(ca);
  }
}