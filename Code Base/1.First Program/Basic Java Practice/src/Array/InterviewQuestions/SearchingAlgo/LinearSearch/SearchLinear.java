package Array.InterviewQuestions.SearchingAlgo.LinearSearch;

public class SearchLinear {
    public static void main(String[] args){
        int[] a={1,2,3,4,67,34,3,6,89,6,45,7,655};
        int key = 89;
        System.out.println(Search(a, key));

    }
    static int Search(int[] arr, int key){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
}
