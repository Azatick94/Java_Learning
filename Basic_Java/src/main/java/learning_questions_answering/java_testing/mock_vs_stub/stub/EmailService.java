package learning_questions_answering.java_testing.mock_vs_stub.stub;

public class EmailService {

    private final EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public String sendEmail(String toAddress, String subject, String body) {
        return this.emailSender.send(toAddress, subject, body);
    }
}
