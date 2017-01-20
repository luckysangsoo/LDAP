package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {
	public static void main(String[] args) {
		String file_path="E:\\install.ini";
		
		try {
			File infile = new File(file_path);
			if (infile.exists()) {
				System.out.println("input file : " + file_path);
				BufferedReader br = new BufferedReader(new FileReader(infile));
				String line = null;
				
				while((line = br.readLine()) != null ){
					// 파일 한줄을 읽어온다
					line = line.trim();
					String[] arr = line.split("\t");
					for( String i : arr){
						System.out.println(i);
					}
					if(arr.length == 2){
					}
				}
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
