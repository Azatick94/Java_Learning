package learning_questions_answering.java_testing.mock_vs_stub.stub;

public class EmailSenderStub implements EmailSender {
    @Override
    public String send(String toAddress, String subject, String body) {
        return "stub email";
    }
}
