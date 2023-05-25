package rikkei.academy.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceIMPL implements IDictionaryService {
    public static Map<String, String> hashtable = new HashMap<>();

    static {
        hashtable.put("hello", "Xin Chao");
        hashtable.put("goodbye", "Tam Biet");
        hashtable.put("sorry", "Xin Loi");
        hashtable.put("good", "Tốt");
    }

    @Override
    public List<String> findByName(String name) {
        List<String> listKey = new ArrayList<>();
        List<String> result = new ArrayList<>();
        hashtable.forEach((k, v) -> {
            listKey.add(k);
        });
        for (String value : listKey) {
            if (value.toLowerCase().contains(name.toLowerCase())) {
                result.add(hashtable.get(value));
            }
        }
        return result;
    }
}
