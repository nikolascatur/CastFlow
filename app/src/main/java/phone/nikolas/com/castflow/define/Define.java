package phone.nikolas.com.castflow.define;

/**
 * Created by Pleret on 8/5/2017.
 */

public interface Define {

    public static final int SHIFTING = 8;
    public static final int OPERATION_MULTIPLE = 1<<SHIFTING; // x
    public static final int OPERATION_DEVIDE = 2<<SHIFTING; // /
    public static final int OPERATION_MIN = 3<<SHIFTING; // -
    public static final int OPERATION_ADD = 4<<SHIFTING; // +
    public static final int OPERATION_DOT = 5<<SHIFTING; // .
    public static final int OPERATION_EQUALS = 6<<SHIFTING; // =
}
