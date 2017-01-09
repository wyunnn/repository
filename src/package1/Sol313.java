package package1;

public class Sol313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
        int [] superUglyNumber = new int[n];
        int [] idxPrimes = new int[primes.length];
        superUglyNumber[0] = 1;
        
        for(int i = 0; i < primes.length; i++){
            idxPrimes[i] = 0;
        }
        
        for(int i = 1; i < n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < primes.length; j++){
                min = Math.min(min, superUglyNumber[idxPrimes[j]] * primes[j]);
            }
            System.out.println(min);
            superUglyNumber[i] = min;
            
            for(int j = 0; j < primes.length; j++){
                if(min == superUglyNumber[idxPrimes[j]] * primes[j]){
                    idxPrimes[j]++;
                }
            }
        }
        
        return superUglyNumber[n-1];
        
    }
}