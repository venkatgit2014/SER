import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;
import javax.mail.search.SubjectTerm;

public class ReadEmail {
public static void main(String[] args) throws Exception {
    // JavaMail API - Exchange server to allow IMAP access

    // mail server connection parameters
    String user = "";
    String password = "";

    // connect to my pop3 inbox
    Properties properties = new Properties();

    properties.put("mail.store.protocol", "imaps");
    //String host;
	//properties.put("mail.pop3.host", "192.168.4.101");
    //properties.put("mail.pop3.port", "110");
    //properties.put("mail.pop3.user", "venkatragavan.srinivasan");
    //properties.put("mail.pop3.timeout", "158000");
    //properties.put("mail.pop3.connectiontimeout", "158000");

    Session session = Session.getInstance(properties);
    session.setDebug(true);

    Store store = null;
    Folder inbox = null;
    store = session.getStore("imaps");
    store.connect("imap.yahoo.com", "secretescapes2014", "Venkat1234");
/*
    try {
        store = session.getStore("pop3");
        store.connect("192.168.4.101", "venkatragavan.srinivasan", "venkat");
        inbox = store.getFolder("Inbox");
        inbox.open(Folder.READ_ONLY);

        // get the list of inbox messages
        int totalMsg = inbox.getMessageCount();
        int unread = inbox.getUnreadMessageCount();
        Message[] messages = inbox.getMessages();
        Message[] msg = inbox.search(new FlagTerm(new Flags(Flag.SEEN), false));

        System.out.print("size " + messages .length);
        if (messages.length == 0) System.out.println("No messages found.");

        for (int i = 0; i < messages.length; i++) {

            // stop after listing ten messages
            if (i > 10) {
                System.exit(0);
                inbox.close(true);
                store.close();
            }

            System.out.println("Message " + (i + 1));
            System.out.println("From : " + messages[i].getFrom()[0]);
            System.out.println("Subject : " + messages[i].getSubject());
            Object content = messages[i].getContent();

            if (content instanceof String)  
                System.out.print((String)content);  
            /* text/plain = String
             * multipart" = Multipart
             * MimeMessage
             * input stream = Unknown Data Handler 
             */
/*
        }

        inbox.close(true);
        store.close();
    } catch (NoSuchProviderException e) {
        System.out.println(e.getMessage());
    } catch (MessagingException e) {
        System.out.println(e.getMessage());

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    */
}
}