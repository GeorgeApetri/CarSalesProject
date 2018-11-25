package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public abstract class GenericStore<T> {

    public abstract T add(T value);

    public abstract void delete(T value);

    public abstract void update(T value);

    public abstract List<T> getAll();

    public abstract T getById(int id);

    public abstract String getFilePath();

    protected void writeJson() {
        try (Writer writer = new FileWriter(getFilePath())) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(getAll(), writer);
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

}
