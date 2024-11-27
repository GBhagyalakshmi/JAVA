package com.comman.array;

import java.util.HashSet;

public class Commanarray {

	public static void main(String[] args) {

		int arr1[][] = { 
				{ 1, 2, 1 },
				{ 9, 7, 2 },
				{ 7, 6, 4 } };
		int arr2[][] = { 
				{ 2, 6, 8, 6 }, 
				{ 0, 1, 3, 9, 7 }, 
				{ 7, 2, 0 },
				{ 8, 3 } };
		HashSet<Integer>Commanarray=new HashSet<>();
		System.out.println("Common elements:");


		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					for (int k2 = 0; k2 < arr2[k].length; k2++) {
						if((arr1[i][j]==arr2[k][k2])) {
							Commanarray.add(arr1[i][j]);
						}


					}
				}

			}

		}

		System.out.println (Commanarray);

	}

}
