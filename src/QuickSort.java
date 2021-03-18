import java.util.Arrays;

public class QuickSort{

    public static void quickSort(int[] arr, int start, int end){
        if(start >= end)
            return;
        int temp = sort(arr, start, end);
        quickSort(arr, start, temp);
        quickSort(arr, temp + 1, end);
    }

    public static int sort(int[] arr, int start, int end){
        //选一个基准
        int temp = arr[start];
        while(start < end){
            //从右遍历，找到第一个比temp小的
            while(temp <= arr[end] && start < end){
                end--;
            }
            if(start < end){
                arr[start] = arr[end];
                start++;
            }
            while(temp >= arr[start] && start < end){
                start++;
            }
            if(start < end){
                arr[end] = arr[start];
                end--;
            }
        }
        arr[start] = temp;
        return start;
    }

    public static void main(String[] args){
        int[] arr = {6, 2, 7, 3, 8 ,9};
        quickSort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}