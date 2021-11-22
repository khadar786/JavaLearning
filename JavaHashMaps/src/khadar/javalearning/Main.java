package khadar.javalearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> newusers = new HashMap<>();
        newusers.put("id","256");

        HashMap users=new HashMap();
        users.put("user_id",25);
        users.put("name","khadar basha");
        users.put("email","khadarsayyad@gmail.com");
        users.put("mobile","9505437866");

        /*users.remove("mobile");
        System.out.println(users.get("name"));
        System.out.println(users.entrySet());*/

        Iterator iterator = users.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println("Key :"+pair.getKey()+" Value :"+pair.getValue());
        }

    }
}
