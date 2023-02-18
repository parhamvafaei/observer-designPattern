import java.util.ArrayList;
import java.util.List;
//using observer designed pattern , the concept is to notify the specific classes just when the base class update  
public class Center {

    private String message;
    private List<Robot> channels = new ArrayList<>();

    public void addObserver(Robot robot) {
        this.channels.add(robot);
    }

    public void removeObserver(Robot robot) {
        this.channels.remove(robot);
    }

    public void setMessage(String message) {
        this.message = message;
        for (Robot robot : this.channels) {
            robot.update(this.message);

        }
    }
}