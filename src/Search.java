public class Search {


    public static int search(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        int begin = 0;
        int end = nums.length - 1;
        int medium = 0;
        int index = 0;
        //用二分法找到target的下标
        while (true) {
            if(end - begin <= 1){
                if(nums[begin] == target){
                    index = begin;
                    break;
                }
                if(nums[end] == target){
                    index = end;
                    break;
                }
                return 0;
            }
            medium = (end - begin) / 2 + begin;
            if(target > nums[medium])
                begin = medium;
            else if(target < nums[medium])
                end = medium;
            else{
                index = medium;
                break;
            }
        }
        int count = 0;
        for(int i = index; i < nums.length; i++){
            if(nums[i] == target)
                count++;
            else
                break;
        }
        for(int i = index - 1; i >= 0; i--){
            if(nums[i] == target)
                count++;
            else
                break;
        }
        return count;
    }


    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        System.out.println(search(nums, target));
    }
}
