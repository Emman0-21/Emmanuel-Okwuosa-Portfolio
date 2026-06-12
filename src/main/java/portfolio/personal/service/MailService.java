package portfolio.personal.service;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.stereotype.Service;
import portfolio.personal.model.Message;

import java.io.IOException;

@Service
public class MailService {

    private final String apiKey = System.getenv("SENDGRID_API_KEY");

    public void sendMessage(Message message) throws IOException {
        Email from = new Email("okwuosaemmanuel211@gmail.com");
        Email to = new Email("okwuosaemmanuel211@gmail.com");
        String subject = message.getSubject();
        Content content = new Content("text/plain",
                "From: " + message.getName() +
                        "\nEmail: " + message.getEmail() +
                        "\n\n" + message.getMessage());

        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(apiKey);
        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());

        Response response = sg.api(request);
        System.out.println("SendGrid status: " + response.getStatusCode());
    }
}