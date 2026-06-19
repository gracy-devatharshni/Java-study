//Hello world -->H-1,e-1,l-3,o-2,w-1,r-1,d-1
import java.util.*;
public class charcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                if(str.charAt(i)==' '){
                    continue;
                }
                map.put(str.charAt(i),1);
            }
        }

        System.out.println(map);

        for(Character i:map.keySet()){
            System.out.println(i +" - "+ map.get(i));
        }

    }
}
