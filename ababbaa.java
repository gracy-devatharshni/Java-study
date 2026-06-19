
// str = abbaaaabbaa ,l=4 ---{abba}{aaab}{baa} op : 3
public class ababbaa {
    public static void main(String[] args) {
        String str = "abbaaaabbaa";
        int l = 4;
        int count = 0,max = 0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(i%l==0){
                max= count>max? count:max;
                count=0;
            }
            if(ch=='a'){
                count++;
            }
        }
        max = count>max? count:max;
        System.out.println(max);
    }
}
