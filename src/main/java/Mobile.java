public class Mobile {
    private String name;
    private String color;
    private String brand;
    private int limited;

    public Mobile(String name, String color, String brand,int limited) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.limited=limited;
    }

    public int getLimited() {
        return limited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void call(String inputMessage){
        System.out.println("Message: [" + inputMessage + "]");
    }

    public void getBasicInformation(){
        System.out.println(String.format("name:[%s],color:[%s],brand:[%s]",name,color,brand));
    }
}
