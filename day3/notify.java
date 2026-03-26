class Notification
{
    String name;
    String message;
    Notification(String name,String message)
    {
        this.name=name;
        this.message=message;
    }
    void send()
    {
        System.out.println("Sending Notification from parent class");
    }
}
class EmailNotification extends Notification {
    EmailNotification(String name,String message)
    {
        super(name, message);
    }
    void send()
    {
        System.out.println("Sending email to "+name);
        System.out.println("Meassage: "+message);
    }
    void changeReceiverEmail()
    {
        System.out.println("Hello");
    }
}
class SMSNotification extends Notification
{
    SMSNotification(String name,String message)
    {
        super(name, message);
    }
    void send()
    {
        System.out.println("Sending SMS to: "+name);
        System.out.println("Message: "+message);
    }
}
public class notify {
    public static void main(String[] args) {
        Notification n;
        n = new EmailNotification("kamal","hello");
        n.send();
        n= new SMSNotification("Nathan","Hi");
        n.send();
        EmailNotification e = new EmailNotification("Kamala","Hello");
        e.changeReceiverEmail();
    }
}
