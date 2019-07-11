public class Person {
    private String name;
    private String myMessage;
    public Person(String name, String message){
        this.name=name;
        this.myMessage=message;
    }
    public void messageLimit(mobile phone){
        if(myMessage.length()>phone.getLimitLength()){
            System.out.println("<"+phone.getId()+">Message cannot be sent");
            System.out.println(phone.getLimitLength());
        }
        else System.out.println(phone.getGreeting(myMessage));

    }

}
