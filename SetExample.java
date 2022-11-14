package com.te.javabasics;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
	  public static void main(String[] args) {
		    HashSet<Integer> cars = new HashSet<Integer>();
		    cars.add(1);
		    cars.add(2);
		    cars.add(3);
		    cars.add(4);
		    cars.add(1);
		    System.out.println("using HashSet"+cars);
		    
		    ArrayList<Integer> car = new ArrayList<Integer>();
		    car.add(1);
		    car.add(2);
		    car.add(3);
		    car.add(4);
		    car.add(1);
		    System.out.println("using ArrayList"+car);
		    
		    TreeSet<Integer> ca = new TreeSet<Integer>();
		    ca.add(1);
		    ca.add(2);
		    ca.add(3);
		    ca.add(4);
		    ca.add(1);
		    System.out.println("using Treeset"+ca);
		    
		    
		  }
		}



