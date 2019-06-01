package Collections;

import java.util.HashMap;
import java.util.Map;

public class TelBook {
    HashMap<Integer,String> hashMap = new HashMap<>();

    public HashMap addNumber(int number,String surname)
    {
        hashMap.put(number,surname);
        return hashMap;
    }
    public void getNumber(String name)
    {
        for (Map.Entry<Integer,String> p:hashMap.entrySet())
        {
            if (p.getValue().equals(name))
            System.out.println(p.getKey() +" VALUE "+ p.getValue());
        }
    }
}
