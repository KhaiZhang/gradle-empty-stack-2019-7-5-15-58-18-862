public class iPhoneRobot {
    private String  name;
    private iPhone iPhone;

    public iPhoneRobot(String name, iPhone iPhone) {
        this.name = name;
        this.iPhone = iPhone;
    }

    public void useMobile(String inputMessage){
        iPhone.call(inputMessage);
    }
}
