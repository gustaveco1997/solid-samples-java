package srp.exemplo1;

public class EmailService implements EmaiServicelInterface {
    @Override
    public void sendEmail(EmailInfo emailInfo) {
        try {
            // serviço de email aqui

            System.out.println("EMail Sent Successfully!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
