package my.study;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by red2 on 19.05.2016.
 */

public class MyMessage {
   public static void main(String[] args){
       System.out.println("MyMessage ");                    // 07/Mar/2004:16:31:48

       Message message = new Message(0,new Date(Date.parse("14 Apr 2016 14:05:00 GMT")),"/twiki/bin/view/TWiki/WebTopicEditTemplate HTTP/1.1\" 200 3732");
       System.out.println(message);

       ArrayList<Message> arrayList = new ArrayList();
       arrayList.add(new Message(1,new Date(Date.parse("1 Jun 2015 14:05:00 GMT")),"The first content line"));
       arrayList.add(new Message(2,new Date(Date.parse("10 Jun 2015 14:05:00 GMT")),"The second content line"));
       arrayList.add(new Message(3,new Date(Date.parse("20 Jun 2015 14:05:00 GMT")),"The third content line"));
       arrayList.add(message);

       try{
           SerializationMessageStore serializationMessageStore = new SerializationMessageStore(new FileOutputStream("files"+File.separator+"ObjectSerialize.dat"));
           serializationMessageStore.persist(message);

           serializationMessageStore.persist(arrayList);
           serializationMessageStore.close();

       } catch (IOException e) {
           e.printStackTrace();
       }
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

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}


interface MessageStore{
    void persist(Message message) throws IOException;
    void persist(Collection<Message> list) throws IOException;
}

class SerializationMessageStore  implements MessageStore{
    OutputStream outputStream;
    SerializationMessageStore(OutputStream outStream) {
        outputStream = outStream;
    }

    @Override
    public void persist(Message message) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(outputStream));
        objectOutputStream.writeObject(message);
        objectOutputStream.flush();

    }

    @Override
    public void persist(Collection<Message> list) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(outputStream));
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
    }
    public void close() throws IOException {
        if ((outputStream != null))
           outputStream.close();
    }
}

class CustomMessageStore  implements MessageStore{

    @Override
    public void persist(Message message) {
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(outputStream));
//        objectOutputStream.writeObject(message);
//        objectOutputStream.flush();
    }

    @Override
    public void persist(Collection<Message> list) {

    }
}

