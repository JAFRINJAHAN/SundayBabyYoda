/*5.  Write a program in Java to display the multiplication table of (eight)8.*/

package com.upskill.assignment2;

public class Assignment_2_5 {

	public static void main(String[] args) {
		multipicationTable();
	}
		public static void multipicationTable() {
			
			int row = 8;
				for (int col = 1; col <= 10; col++) {
					int MultiplicationTable = row * col;
					System.out.println(row + " * " + col + " = " + MultiplicationTable );
				}
			}		
	}


