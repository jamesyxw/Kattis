package kattis_java;

/**
 * Solution for Kattis problem-id: carrots
 * https://open.kattis.com/problems/carrots
 *
 * Author: James Wang
 */

public class Carrot {
	
	private Kattio io = new Kattio(System.in);
	
	public static void main(String[] args){
		new Carrot();
	}
	
	public Carrot(){
		int numContestant = io.getInt();
		int numProblems = io.getInt();
		
		//The number of carrots is equal to the number of problems. 
		System.out.println(numProblems);
		
		//Must close io
		io.close();
	}
	
	
}
