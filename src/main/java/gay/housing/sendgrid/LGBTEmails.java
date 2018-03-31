package gay.housing.sendgrid;

// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java
import com.sendgrid.*;
import java.io.IOException;

public class LGBTEmails {

    public void testEmail() throws IOException {//String[] args) throws IOException {
        Email from = new Email("DO_NOT_REPLY@lgbthousing.com");
        String subject = "Please click on the link in the email to complete registration:";
        Email to = new Email("erictomlinsonwork@gmail.com");
        Content content = new Content("text/html", "<pre>Welcome to to the online community looking to find roomates you can be comfortable with at<br />an affordable price.  To complete the registration can you confirm your email by<br />clicking on the following link:<br /> <br /><br /></pre>\n" +
                "<table style=\"background-color: blue; border-color: blue; width: 60%; height: 20px; margin-left: auto; margin-right: auto;\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td style=\"text-align: center;\">\n" +
                "<h1>Click Here to Complete Registration</h1>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>");

        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid("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");
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }

}

