import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Eric", 33);
        // Use compact single-line JSON output
        //        Gson gson = new Gson();

        // Use pretty JSON output with one attribute per line, indentations
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String personAsJson = gson.toJson(person);

        System.out.println(personAsJson);
    }
}