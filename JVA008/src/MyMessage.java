import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by red2 on 19.05.2016.
 */

public class MyMessage {
   public static void main(String[] args){
       System.out.println("MyMessage ");
   }
}

class Message implements Serializable{
    int id;
    Date date;
    String content;

    public Message(int id, Date date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }
}


interface MessageStore{
    void persist(Message message);
    void persist(Collection<Message> list);
}

class SerializationMessageStore  implements MessageStore{

    @Override
    public void persist(Message message) {

    }

    @Override
    public void persist(Collection<Message> list) {

    }
}


