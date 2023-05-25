package rikkei.academy.services;

import java.util.List;

public interface IDictionaryService {
    List<String> findByName(String name);
}
