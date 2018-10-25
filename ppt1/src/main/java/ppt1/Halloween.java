package ppt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Halloween {

    /**
     * Returns the total number of student meetings that happen when students go
     * from a source to a destination. All sources are on the same street.
     * All destinations are on the same street, but different from the source street.
     * The source street and destination street are parallel to each other.
     * @param students is not null
     * @return the total number of student meetings that happen when students
     *          go from a source to a destination.
     */
    public static int bottleCount(List<SDPair> students) {
        // TODO: Implement this method
    	int count = 0;
    	if(students.size() == 1) {
    		count = 0;
    	}
    	for(int i = 0; i < students.size(); i ++) {
    		SDPair s1 = students.get(i);
    		int src1 = s1.getSrc();
    		int dst1 = s1.getDst();
    		for(int j = 0; j < students.size(); j ++) {
    			SDPair s2 = students.get(j);
    			int src2 = s2.getSrc();
    			int dst2 = s2.getDst();
    			if(src1 <= src2 && dst1 <= dst2) {
    				
    			}
    			else if(src1 >= src2 && dst1 >= dst2) {
    				
    			}
    			else {
    				count ++;
    			}
    		}
    		
    	}
        return count/2;
    }

    /**
     * Returns the index from the given list of the student that <strong>meets</strong> the maximum
     * number of other students when students go from a source to a destination.
     * All sources are on the same street. All destinations are on the same street,
     * but different from the source street. The source street and destination
     * street are parallel to each other.
     * @param students is not null
     * @return an index between 0 and students.size()-1 that represents the student
     *          that meets most other students, an in case of ties the smaller index
     *          is returned.
     */
    public static int highPoint(List<SDPair> students) {
        // TODO: Implement this method
    	
    	Map<Integer, Integer> tea = new HashMap<Integer, Integer>();
    	List<Integer> list = new ArrayList<Integer>();
    	int count = 0;
    	
    	if(students.size() == 1) {
    		count = 0;
    		tea.put(students.indexOf(students.get(0)), 0);
    	}
    	else {
    		for(int i = 0; i < students.size(); i ++) {
        		SDPair s1 = students.get(i);
        		int src1 = s1.getSrc();
        		int dst1 = s1.getDst();
        		count = 0;
        		for(int j = 0; j < students.size(); j ++) {
        			SDPair s2 = students.get(j);
        			int src2 = s2.getSrc();
        			int dst2 = s2.getDst();
        			if(src1 <= src2 && dst1 <= dst2) {
        				
        			}
        			else if(src1 >= src2 && dst1 >= dst2) {
        				
        			}
        			else {
        				count ++;
        			}
        			tea.put(students.indexOf(students.get(i)), count);
        		}
        		
        	}	
    	}
    
    	Map.Entry<Integer, Integer> maxEntry = null;
    	for (Map.Entry<Integer, Integer> entry : tea.entrySet()) {
    	  if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
    	    maxEntry = entry;
    	  }
    	}
    	
    	int maxKey = maxEntry.getKey();  
    	
    	return maxKey;
    
    }
}
