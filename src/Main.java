import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*Дана Map map, написать метод, который вернет мапу, такую, что если в исходной map
        есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b
        в качестве значения. Если нет, ничего не менять
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}

Дан список имен, где некоторые имена повторяются. Написать метод,который по имени вернет
количество вхождений этого имени в список.
Пример: nameToNumberOccurence(List list, String name)
Vasia -> 3*/

    }
    public Map<String,String> aOrB(Map<String,String>map){
        String sum=map.get("a")+map.get("b");
        if (map.containsKey("a")&& map.containsKey("b")){
            map.put("ab",sum);

        }return map;
    }

   /* public static Map<String,String> trueFalse(String[]strings){
        Map<String,String>map1=new HashMap<>();
String value;
        for (String s:strings){
           String key=map1.get(s);

           for (int i=0;i<strings.length;i++){


           }
        }
    }*/
}