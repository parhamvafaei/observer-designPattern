import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BigRobot implements Robot {

    private String message;

    SimpleThread thread = new SimpleThread();

    @Override
    public void  update(Object o) {
        this.setMessage(message);
        System.out.println(message);
    thread.start();
    }
}
