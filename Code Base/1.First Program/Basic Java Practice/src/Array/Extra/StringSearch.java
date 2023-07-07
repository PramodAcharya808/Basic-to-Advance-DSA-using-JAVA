package Array.Extra;

public class StringSearch {
    public static void main(String[] args) {
        String name = "PRAMOD";
        char key = 'P';
        System.out.println(Search(name,key));
    }

    static boolean Search(String str, char key){
        for(int i=0 ; i<str.length(); i++)
        {
            if(key == str.charAt(i))
                return true;
        }
        return false;
    }
}
