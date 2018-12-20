package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class GsonSingleton {

    private static final Gson INSTANCE = new GsonBuilder().setPrettyPrinting().create();

    private GsonSingleton() {
    }

    public static Gson getInstance() {
        return INSTANCE;
    }
}
