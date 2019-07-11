public class iPhone extends mobile {
    private String id="iPhone";
    private String name;
    private String color;
    private String brand;
    private int limitLength;
    public iPhone(String name,String color,String brand,int limi){
        super.setName(name);
        this.name=name;
        this.color=color;
        this.brand=brand;
        this.limitLength=limi;
    }
    public String getGreeting(String message){
        return "<iPhone>Message:"+message;
    }

    @Override
    public int getLimitLength() {
        return limitLength;
    }

    public String getId() {
        return this.id;
    }

    public void printMessage(){
        System.out.println(this.getName());
        System.out.println(super.getColor());
        System.out.println(super.getBrand());

    }
}
