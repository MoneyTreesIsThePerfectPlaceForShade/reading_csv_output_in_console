import java.io.*;
import java.util.*;

/**
 * @author Matthew 24.05.2022
 **/
public class FirtsSberTask {
    public static void main(String[] args) throws IOException {
        String path = "city_ru.csv"; // добавил путь
        File file = new File(path); // добавил файл
        Scanner input = new Scanner(file); // считал данные

        Map<String, String> city = new LinkedHashMap<>();

        String line = null;
        while (input.hasNextLine()){
            line = input.nextLine();
            String[] result = line.split(";");
            try {
                city.put("name", result[1]);
                city.put("region", result[2]);
                city.put("district", result[3]);
                city.put("population", result[4]);
                city.put("foundation", result[5]);
            } catch (ArrayIndexOutOfBoundsException e){
                city.put("foundation","no data");
            }
            System.out.println(city);
        }
    }
}