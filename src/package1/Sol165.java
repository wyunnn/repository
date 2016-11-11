package package1;

public class Sol165 {
    public int compareVersion(String version1, String version2) {
        String [] s1 = version1.split("\\.");
        String [] s2 = version2.split("\\.");
        
        int m = Math.min(s1.length, s2.length);
        
        for(int i = 0; i < m; i++){
            if (Integer.parseInt(s1[i]) > Integer.parseInt(s2[i]))    return 1;
            else if (Integer.parseInt(s1[i]) < Integer.parseInt(s2[i]))   return -1;
        }
        
        if(s1.length > m){
            for (int i = m; i < s1.length; i++)
                if(Integer.parseInt(s1[i]) != 0)    return 1;
            return 0;
        }
        else if(s2.length > m){
            for (int i = m; i < s2.length; i++)
                if(Integer.parseInt(s2[i]) != 0)    return -1;
            return 0;
        }
        else
            return 0;
    }
}
