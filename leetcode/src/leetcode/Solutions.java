package leetcode;

import java.util.*;

public class Solutions {

	public int numUniqueEmails(String[] emails) {
		Set<String> resSet = new HashSet<String>();
		for(String email: emails) {
			int i = email.indexOf("@");
			String domainName = email.substring(i+1, email.length());
			String localName = email.substring(0,i);
			localName = localName.substring(0, email.indexOf("+"));
			localName = localName.replace(".","");
			resSet.add(localName+domainName);
		} 
		return resSet.size();
	}

	 public String toLowerCase(String str) {
	    String res = "";
	    for(char c: str.toCharArray()) {
	    	res += (c>='A'&& c<='Z' ? (char) (c+'a'-'A'): c);
	    }
		 return res;
	    }

	 public int repeatedNTimes(int[] A) {
		 int res = 0;
	      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	      for(int a:A) {
	    	  if(map.containsKey(a)) {
	    		  map.put(a, map.get(a)+1);
	    	  } else {
	    		  map.put(a, 1);
	    	  }
	      }
	      
	      for(int i: map.keySet()) {
	    	  if(map.get(i)==A.length/2) {
	    		  res = i;
	    	  }
	      }
		 return res;
	    }
	 
	 public void finalPrice(List<Integer> prices) {
		 /* index, value, discount*/
		 Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
		 
		 for(int i =0;i<prices.size();i++) {
			 Map<Integer, Integer> m = new HashMap<>();	
			 List<Integer> dup = prices.subList(i, prices.size());

			 int x = findMin(dup);
			 if(x<prices.get(i)) {
				 m.put(prices.get(i), prices.get(i)-x);
			 }
			 else {
				 m.put(prices.get(i), 0);
			 }
			 
			 map.put(i, m);
		 }
		 int sum = 0;
		 String temp = "";
		 for(int key : map.keySet()) {
			 Map<Integer, Integer> m = map.get(key);
			 for(int k: m.keySet()) {
				 sum+=m.get(k);
				 if(m.get(k)==0) {
					 temp+=key+" ";
					 sum+=k;
				 }
			 }
		 }
		 
		 System.out.println(sum);
		 System.out.println(temp);
		 
	 }
	 
	 public static Integer findMin(List<Integer> list) 
	    { 
	  
	        // check list is empty or not 
	        if (list == null || list.size() == 0) { 
	            return Integer.MAX_VALUE; 
	        } 
	  
	        // create a new list to avoid modification  
	        // in the original list 
	        List<Integer> sortedlist = new ArrayList<>(list); 
	  
	        // sort list in natural order 
	        Collections.sort(sortedlist); 
	  
	        // first element in the sorted list 
	        // would be minimum 
	        return sortedlist.get(0); 
	    } 
	  
	 

}
