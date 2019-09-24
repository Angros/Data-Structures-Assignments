/*
 * FileMergingApp.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * This is a source file with an application that asks the names of three text files and 
 * invoke the merge method to generate the third file from the first two.
 */

package applications;

import java.io.*;
import java.util.Scanner;
import sorting.FileProcessing;


public class FileMergingApp {

	public static void main(String[] args)throws IOException {
		System.out.println("Starting to read Files...");
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the name of the List 1: ");
		File fileGirls = new File(kb.nextLine()); //File 1 for merging
		if(!fileGirls.exists()){
			System.out.println("The File does not exists");
			System.exit(0);
		}
		System.out.println("Enter the name of the List 2: ");
		File fileBoys = new File(kb.nextLine()); //File 2 for Merging
		if(!fileBoys.exists()){
			System.out.println("The file 2 does not exists");
			System.exit(0);
		}
		Scanner scanGirls = new Scanner(fileGirls);
		Scanner scanBoys = new Scanner(fileBoys);
		System.out.println("Enter the name of the Merged List: ");
		String printer = kb.nextLine();
		PrintWriter fileSorted = new PrintWriter(printer); //Sorted File of File 1 & File 2

		FileProcessing.merge(scanGirls, scanBoys, fileSorted);
		fileSorted.close();
		scanGirls.close();
		scanBoys.close();

		System.out.println("Now showing sorted File...");
		File names = new File(printer); //Sorted File to pass to Scanner
		Scanner sorted = new Scanner(names);
		while(sorted.hasNext())
			System.out.println(sorted.next()); //Displays Sorted File
		sorted.close();

		kb.close();
		System.out.println("End of FileMergingApp");
		System.exit(0);



	}

}
