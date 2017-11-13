/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    var i;
    for(i = 0; i < nums.length; i++){
        if(nums[i] === target){
            return i;
        }
        else if (nums[i] < target){
            continue;
        }
        else{ //target < nums[i]
            return i;
        }
    }
    return i;
};
