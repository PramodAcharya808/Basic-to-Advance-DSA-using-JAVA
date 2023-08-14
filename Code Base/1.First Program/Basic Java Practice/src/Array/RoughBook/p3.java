package Array.RoughBook;

import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
        String[] str = {"Pramod", "Anil", "Rajshekar", "Vinay", "Darshan", "Charu", "Chandana"};
        Bubble(str);
        System.out.println(Arrays.toString(str));
    }

    public static void Bubble(String[] str){
        for(int i=0; i<=str.length-1; i++){
            for(int j=1; j<=str.length-i-1; j++){
                if (str[j].compareTo(str[j-1])<0){
                    String temp = str[j-1];
                    str[j] = str[j-1];
                    str[j-1]=temp;
                }
            }
        }
    }
}
