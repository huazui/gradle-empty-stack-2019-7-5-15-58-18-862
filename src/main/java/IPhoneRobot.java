public class IPhoneRobot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getPhone(mobile phone){
        if(phone.getId()=="iPhone"){
            System.out.println("Phone can be used");
        }
        else System.out.println("Phone cannot be used");
    }
}
