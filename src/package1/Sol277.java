package package1;

/* The knows API is defined in the parent class Relation.
boolean knows(int a, int b); */

public class Sol277 extends Relation {
	public int findCelebrity(int n) {
	  
	  int candidate = 0;
	  for(int i = 1; i < n; i++){
	      if(knows(candidate, i)){
	          candidate = i;
	      }
	  }
	  for(int i = 0; i < n; i++){
	      if(candidate != i && (!knows(i, candidate) || knows(candidate, i)))
	          return -1;
	  }
	  return candidate;
	}
}
