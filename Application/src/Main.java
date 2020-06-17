import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        File fp = new File("C:/Users/Kristina Baleva/test.txt");
        BufferedReader reader = null;
        Map<String,Integer> map = new HashMap<>();
        String st;
        Integer counter;
        try {
            reader = new BufferedReader(new FileReader(fp));
            while ((st = reader.readLine()) != null) {
                if(!map.containsKey(st)) {
                    counter = 1;
                    map.put(st, counter);
                }else {
                    Integer value = map.get(st);
                    counter = value + 1;
                    map.put(st,counter);
                }
            }
            System.out.println(map);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
