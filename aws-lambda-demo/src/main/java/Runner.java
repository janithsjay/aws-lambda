import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

public class Runner implements RequestHandler<SQSEvent, Void> {

    @Override
    public Void handleRequest(SQSEvent sqsEvent, Context context) {

        final LambdaLogger logger=context.getLogger();
        logger.log("Lambda invoked.......");
        // log execution details
        logger.log("ENVIRONMENT VARIABLES: " + System.getenv());
        logger.log("CONTEXT: " + context);
        // process event
        logger.log("EVENT: " + sqsEvent);
        logger.log("==================================================");

        for(SQSMessage msg : sqsEvent.getRecords()){
            logger.log(msg.getBody());
        }

        return null;
    }
}
