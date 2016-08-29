
public class StuffedRhombus2 {
	public static void main(String[] args)  {
		int n = 3;
         
        for(int i = 0; i < n - 1; i++) 
        { 
            for(int x = i + 1; x < n; x++) 
            { 
                System.out.print(" "); 
            } 
            for(int y = 0; y < (i + 1) * 2 - 1; y++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        
        
        
        
        for(int i = 0; i < n; i++) 
        { 
            for(int x = 0; x < i; x++) 
            { 
                System.out.print(" "); 
            } 
            for(int y = i; y < 2 * n - i - 1; y++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        
        
        
        
	}
	

}
