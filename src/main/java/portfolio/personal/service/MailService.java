package portfolio.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import portfolio.personal.model.Message;
import  org.springframework.mail.SimpleMailMessage;
import  org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendMessage(Message message){
        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo("okwuosaemmanuel211@gmail.com");
        email.setSubject(message.getSubject());
        email.setText("From: " + message.getName() + " | " + message.getEmail() + "\n\n" + message.getMessage());
        email.setReplyTo(message.getEmail());
        mailSender.send((email));

    }
}
