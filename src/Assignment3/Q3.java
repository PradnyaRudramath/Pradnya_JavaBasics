package Assignment3;

//print 1D integer array with index position
public class Q3 {
    static void main(String[] args) {
        int[] marks={85,92,67,78,55,98};

        for(int i=0;i<marks.length;i++){
            System.out.println("Index "+ i +": "+marks[i]);
        }
        System.out.println("Total Elements: "+ marks.length);
    }
}
