public class Person {
    private String  name;
    private Mobile  mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void call(String inputMessage){
        mobile.call(inputMessage);
    }
}
