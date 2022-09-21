package ss11_Stack_Queue.excercise.e2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap();
        String str = "levanhieu";
        for (int i=0;i<str.length();i++){
            if (map.containsKey(String.valueOf(str.charAt(i)))){
                int count = map.get(String.valueOf(str.charAt(i)));
                count++;
                map.put(String.valueOf(str.charAt(i)),count);
            }else {
                map.put(String.valueOf(str.charAt(i)),1);
            }
        }
        System.out.println(map);
    }
}
