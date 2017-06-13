package inova;

public class TestMain {
	
	public static void main(String[] args) {
		
		int m = 4;
		int[] N = {0,4,3,2,1};
		int idx1 = 0;
		int idx2 = 0;
		
		for(int i = 0; i < N.length; i++){
			
			idx1 = i;
			
			for(int j = 0; j < N.length; j++){
				
				idx2 = j;
				
				System.out.println( "idx1 "+ idx1 +" idx2 " +idx1 + ", " + (N[idx1] + N[idx2]));
				
				if(N[idx1] + N[idx2] == m){
					System.out.println("[Encontrado] " + idx1 + ", " + idx2);
					break;
				}
				
			}
			
			if(N[idx1] + N[idx2] == m){
				break;
			}

		}
		
		System.out.println( idx1 + ", " + idx2 + " - " + N[idx1] + ", " + N[idx2]);
		
		
		
	}

}
