import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {

    static Queue<Integer> A, B;
    public MedianFinder() {
        A = new PriorityQueue<>(); // 小顶堆，保存较大的一半
        B = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆，保存较小的一半
    }
    public static void addNum(int num) {
        if(A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }
    public static double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }

    public static void main(String[] args){
        MedianFinder obj = new MedianFinder();
        addNum(1);
        addNum(3);
        addNum(4);
        addNum(5);
        System.out.println(findMedian());
    }
}
