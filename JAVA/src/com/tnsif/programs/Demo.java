package com.tnsif.programs;

public class Demo {
public static void main(String[] args) {
	String[] name={"B","h","a","g","y","a","l","a","k","s","h","m","i"};
	String num="";
	int count=len(name);
	for(String i:name) {
		if(i=="a" ||i=="e"||  i=="i"||i=="o"||i=="u") {
			num+=i+"";
			count=count+1;
		}
		else {
			count+=1;
			System.out.println(count);
		}
	}
	System.out.println(num);

}

private static int len(String[] name) {
	// TODO Auto-generated method stub
	return 0;
}
}
