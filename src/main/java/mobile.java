public class mobile {
        private String name;
        private String color;
        private String brand;
        private int limitLength;
        private String id="mobile";
        public mobile(){

    }
    public mobile(String name, String color, String brand,int limi){
            this.name=name;
            this.color=color;
            this.brand=brand;
            this.limitLength=limi;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength = limitLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getGreeting(String message){
            return ("Message:"+message);
        }

    public int getLimitLength() {
        return limitLength;
    }

    public void printMessage(){
        System.out.println(this.getName());
        System.out.println(this.getColor());
        System.out.println(this.getBrand());

    }
    }


