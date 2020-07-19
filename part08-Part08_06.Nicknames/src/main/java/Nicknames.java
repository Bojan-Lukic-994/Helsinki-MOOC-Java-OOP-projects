/*
In the main-method create a new HashMap<String,String> object. 
Store the names and nicknames of the following people in this hashmap so, that the name is the key and the nickname is the value. 
Use only lower case letters.
 */
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        //creates new HashMap with String key and String values
        HashMap<String, String> nicknamesList = new HashMap<>();

        //adds new items to the HashMap (names and nicknames)
        nicknamesList.put("matthew", "matt");
        nicknamesList.put("michael", "mix");
        nicknamesList.put("arthur", "artie");

        //prints out matthew's nickname
        System.out.println(nicknamesList.get("matthew"));
    }

}
