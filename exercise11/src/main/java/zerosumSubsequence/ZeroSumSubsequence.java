package zerosumSubsequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ZeroSumSubsequence {
		
    public static int getMaximumLength(List<Integer> sequence) {
		 // TODO: Implement this method
    	List<Integer> list = new ArrayList<Integer>();      
    	int n = sequence.size(); 
     
    	if(sequence.isEmpty()) {
    		return 0;
    	}
		
        for (int i = 0; i < (1<<n); i++) { 
        	List<Integer> l = new ArrayList<Integer>();
        	int count = 0;
        	int sum = 0;

            for (int j = 0; j < n; j++) {				
                if ((i & (1 << j)) > 0) {
                 	l.add(sequence.get(j));
                 } 
            }
            
            
            for(int k = 0; k < l.size(); k ++){            	
            	if(l.isEmpty()) {
            		count = 0;
            	}
            	else {
            		sum += l.get(k);
            		count ++;
            	}
            }
               
            if(sum == 0) {
            	list.add(count);
            }
                               
        } 
        
        int max = Collections.max(list);
    	return max;
    }
}