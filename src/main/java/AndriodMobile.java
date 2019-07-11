public class AndriodMobile extends Mobile{
    public AndriodMobile(String name, String color, String brand, int limited) {
        super(name, color, brand, limited);
    }

    @Override
    public void call(String inputMessage) {
        if(inputMessage.length()>this.getLimited()){
            System.out.println("<Andriod>Message cannot be sent");
        }else {
            System.out.println("<Andriod>Message: [" + inputMessage + "]");
        }

    }
}
