package entornospgit;

/**
 *
 * @author admin
 */
public class NumRecolector {
    
    private long[] nums = new long[999];

    public final void AddNum(long _num){
        nums[nums.length - 1] = _num; 
    }
    
    final long getMax(){
        long max;
        max = nums[0];
        for(long i: nums){
            if(max < i) max = i;
        }
        return max;
    }
    final long getMin(){
        long min;
        min = nums[0];
        for(long i: nums){
            if(min > i) min = i;
        }
        return min;
    }
}
