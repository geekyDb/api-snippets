// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.sync.v1.service.SyncStream;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static final String SERVICE_SID = "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    SyncStream stream = SyncStream.creator(SERVICE_SID).setUniqueName("MyStream").create();

    System.out.println(stream.getSid());
  }
}