package Glava_4.Task_4_4_9;
import static Glava_4.Task_4_4_9.Main.BANNED_SUBSTANCE;
import static Glava_4.Task_4_4_9.Main.WEAPONS;


public class Inspector implements MailService {
    @Override
    public SendAble processMail(SendAble mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();
            if (content.indexOf("stones instead of ") == 0) {
                throw new StolenPackageException();
            } else if (content.equals(WEAPONS) || content.equals(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
