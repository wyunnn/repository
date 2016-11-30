package package1;


public class MovingAverage {
    int[] data;
    int cur_size;
    int pointer;
    double sum;
    double avg;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.cur_size = 0;
        this.sum = 0;
        this.data = new int [size];
    }
    
    public double next(int val) {
        if(cur_size < data.length){
            sum += val;
            avg = sum / (++cur_size);
            
        }
        else{
            if(pointer > data.length - 1)     
                pointer -= data.length;
            
            sum = sum - data[pointer] + val;
            avg = sum / data.length;
        }
        
        data[pointer] = val;
        pointer++;
        
        return avg;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */