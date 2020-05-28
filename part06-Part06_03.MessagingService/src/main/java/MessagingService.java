/*
The exercise template comes with a pre-defined Message class that can be used to create objects representing messages. 
Each message has a sender and some content.

Implement the MessagingService class. The class must have a parameterless constructor and contain a list of Message objects. 
After that, add the following two methods to the class:
- public void add(Message message) - adds a message passed as a parameter to the messaging service 
as long as the message content is at most 280 characters long.
- public ArrayList<Message> getMessages() - returns the messages added to the messaging service.
 */

import java.util.ArrayList;

public class MessagingService {

    ArrayList<Message> list = new ArrayList<>();

    //constructor for class "MessagingService"
    public MessagingService() {
        this.list = new ArrayList<>();
    }

    //method that adds given message to the list if the message has 280 or less characters
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.list.add(message);
        }
    }

    //method that returns the list of messages
    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
