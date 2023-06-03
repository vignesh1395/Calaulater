package com.ty.sample;

public class Calculater {
	public  static void add(int a,int b)
	{
		System.out.println("add =" +(a+b));
	}
	public  static void sub(int c,int d)
	{
		System.out.println("sub =" +(c-d));
	}
	public  static void div(int a,int b)
	{
		System.out.println("div =" +a/b);
	}

	public static void main(String[] args) {
		add(10,20);
		sub(10,20);
		div(5,2);
		

	}

}
