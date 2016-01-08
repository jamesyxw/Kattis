/**
 * Solution to Kattis problem: speedlimit
 * 
 * @author james wang
 *
 */
public class SpeedLimit {
	
	private Kattio io = new Kattio(System.in);
	
	public static void main(String[] args){
		new SpeedLimit();
	}
	
	public SpeedLimit(){
		handleInput();
	}
	
	private void handleInput(){
		int count = io.getInt();
		
		while(count != -1){
			int miles = 0;
			int prevTime = 0;
			for(int i = 0; i<count; i++){
				int speed = io.getInt();
				int curTime = io.getInt();
				int hours = curTime - prevTime;
				miles += speed * hours;	
				prevTime = curTime;
				
			}
			System.out.println(miles +" miles");
			
			count = io.getInt();
		}
	}
	
	

}
