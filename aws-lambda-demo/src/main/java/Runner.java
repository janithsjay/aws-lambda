import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;
public class Runner implements RequestHandler<String, String> {

    public final static Logger LOGGER = Logger.getLogger(Runner.class);

    @Override
    public String handleRequest(String s, Context context) {
        LOGGER.info("Lambda invoked..................");
        return null;
    }
}
