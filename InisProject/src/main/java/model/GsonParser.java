package model;

import com.google.gson.Gson;

public class GsonParser {
    private static final Gson GSON = new Gson();

    public static String toJson(Object object) {
        return GSON.toJson(object);
    }

    public static Object fromJson(String json, Class c) {
        return GSON.fromJson(json, c);
    }
}
