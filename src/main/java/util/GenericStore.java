package util;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericStore<T> {


    public abstract T add(T value);

    public abstract void delete(T value);

    public abstract void update(T value);

    public abstract List<T> getAll();

    public abstract T getById(int id);

    public abstract String getFilePath();

    protected abstract List<T> getListFromJson(Gson gson, Reader reader);



    protected final void writeJson() {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(getFilePath()) , "UTF-8")){
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Gson gson = GsonSingleton.getInstance();
            gson.toJson(getAll(), writer);
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    protected List<T> readJson(){
        try(Reader reader = new InputStreamReader(new FileInputStream(getFilePath()), "UTF-8")){
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Gson gson = GsonSingleton.getInstance();
            return getListFromJson( gson, reader );
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
            return new ArrayList<>();
        }
    }


}