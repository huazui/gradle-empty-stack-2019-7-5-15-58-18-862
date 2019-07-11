public class AndroidMobile extends mobile {
    private String name;
    private String color;
    private String brand;
    private String id="Android";
    private  int limiLength;
    public AndroidMobile(String name,String color,String brand,int limi){
        this.name=name;
        this.color=color;
        this.brand=brand;
        this.limiLength=limi;
    }
    public String getGreeting(String message){
        return "<Android>Message"+message;
    }

    @Override
    public int getLimitLength() {
        return this.limiLength;
    }

    public String getId() {
        return id;
    }

    public void printMessage(){
        System.out.println(this.getName());
        System.out.println(super.getColor());
        System.out.println(super.getBrand());

    }
}
