public class MaxQueue {
    //数组下标
    int end = 0;
    //数组开始下标
    int start = 0;
    //存放队列
    int[] queue = new int[20000];

    public MaxQueue() {

    }

    //返回队列最大值
    public int max_value() {
        int max = -1;
        //队列是否为空
        if(start == end){
            return -1;
        }
        for(int index = start; index != end; ++index){
            max = Math.max(max, queue[index]);
        }
        return max;
    }

    //放入一个数值
    public void push_back(int value) {
        queue[end++] = value;
    }

    //弹出队列最前面的值
    public int pop_front() {
        if (start == end) {
            return -1;
        }
        return queue[start++];
    }

}
