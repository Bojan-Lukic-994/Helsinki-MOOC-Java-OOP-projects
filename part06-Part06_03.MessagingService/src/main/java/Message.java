/*
The exercise template comes with a pre-defined Message class that can be used to create objects representing messages. 
Each message has a sender and some content.

Implement the MessagingService class. The class must have a parameterless constructor and contain a list of Message objects. 
After that, add the following two methods to the class:
- public void add(Message message) - adds a message passed as a parameter to the messaging service 
as long as the message content is at most 280 characters long.
- public ArrayList<Message> getMessages() - returns the messages added to the messaging service.
*/
import java.util.Objects;

public class Message {

    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return this.sender + ": " + this.content;
    }

    // created using the "insert code" feature of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

}
