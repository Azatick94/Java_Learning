package learning_questions_answering.java_jackson_json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/*
Steps to Do:
1) Create Object Mapper.
2) DeSerialize JSON to Object.
3) Serialize Object to JSON.

*/
public class JacksonTester {
    public static void main(String[] args) {

        // Jackson Object mapper
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        //map json to student
        try {
            // reading json
            Student student = mapper.readValue(jsonString, Student.class);
            System.out.println(student);
            System.out.println("---");

            // writing student to String in Json format
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
