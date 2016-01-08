/**
 * Solution for Kattis problem-id: carrots
 * https://open.kattis.com/problems/carrots
 *
 * Author: James Wang
 */

public class Carrots {
	
	private Kattio io = new Kattio(System.in);
	
	public static void main(String[] args){
		new Carrots();
	}
	
	public Carrots(){
		int numContestant = io.getInt();
		int numProblems = io.getInt();
		
		//The number of carrots is equal to the number of problems. 
		System.out.println(numProblems);
		
		//Must close io
		io.close();
	}
	
	
}
