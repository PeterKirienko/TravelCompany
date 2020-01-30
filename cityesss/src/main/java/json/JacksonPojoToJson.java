package json;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import cities.Cities;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonPojoToJson {
    private ObjectMapper mapper;

    public JacksonPojoToJson() {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public String createJson(Cities city) throws IOException {
        String cityJson = mapper.writeValueAsString(city);
        return cityJson;
    }

    public void saveObjectToJsonFile(Object object, String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename + ".json");
        mapper.writeValue(fileOutputStream, object);
        fileOutputStream.close();
    }



}
