package my.study;

/**
 * Created by red2 on 16.05.2016.
 */
public class myAnotation {
    int ret;
    int count;
    public static void main(String[] args){
        myAnotation anotation = new myAnotation(10);

    }
    public myAnotation(int count) {
        this.count = count;
        System.out.println(count);
    }

    @Override
    public String toString() {
        return "myAnotation{" +
                "ret=" + ret +
                ", count=" + count +
                '}';
    }
}

@interface Ingect{

}
