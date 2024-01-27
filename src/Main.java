import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {

    public static void main(String args[]) {

        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

        tmap.put(6, "Warszawa");
        tmap.put(23, "Kraków");
        tmap.put(70, "Lublin");
        tmap.put(4, "Sopot");
        tmap.put(2, "Trzew");

        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }
}
