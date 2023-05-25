package rikkei.academy.services;

public class Services {
    private static Services instance;
    private final IDictionaryService dictionaryService = new DictionaryServiceIMPL();

    public Services() {

    }

    public static Services getInstance() {
        if (instance == null) instance = new Services();
        return instance;
    }

    public IDictionaryService getDictionaryService() {
        return dictionaryService;
    }
}
