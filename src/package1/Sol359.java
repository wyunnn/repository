package package1;

import java.util.*;

public class Sol359 {
    private Map<String, Integer> ok = new HashMap<>();

    /** Initialize your data structure here. */
    public Sol359() {
        
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
    	if(ok.containsKey(message)){
    		if(timestamp < ok.get(message)){
    			return false;
    		}
    	}
        ok.put(message, timestamp + 10);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */