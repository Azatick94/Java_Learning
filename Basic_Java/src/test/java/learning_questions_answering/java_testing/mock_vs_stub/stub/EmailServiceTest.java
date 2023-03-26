package learning_questions_answering.java_testing.mock_vs_stub.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {


    @Test
    void sendEmail() {

        String toAddress = "john@example.com";
        String subject = "Test Subject";
        String body = "Test Body";

        EmailService emailService = new EmailService(new EmailSenderStub());
        String result = emailService.sendEmail(toAddress, subject, body);

        assertEquals("stub email", result);

    }


}
