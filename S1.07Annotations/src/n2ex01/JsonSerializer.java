package n2ex01;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;


public class JsonSerializer {
	
    public static void serialize(Object obj) throws IOException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
               
        Gson gson = new Gson();
        String json = gson.toJson(obj);

        JsonSerialize annotation = clazz.getAnnotation(JsonSerialize.class);
        String directory = annotation.directory();

        try (FileWriter file = new FileWriter(directory + "/" + clazz.getSimpleName() + ".json")) {
            file.write(json);
            System.out.println("Object serialized at: " + directory);
        }
    }
}
