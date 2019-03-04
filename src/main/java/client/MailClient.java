package client;

import com.epam.web.soap.*;

import java.util.List;

public class MailClient {
    public static void main(String[] args) {
        MailWebServiceImplService mailService = new MailWebServiceImplService();
        MailWebService mail = mailService.getMailWebServiceImplPort();

        mail.getLetterBySubject("ob");
    }

}
