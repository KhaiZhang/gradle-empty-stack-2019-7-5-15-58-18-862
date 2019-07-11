public class iPhone extends Mobile{

    public iPhone(String name, String color, String brand, int limited) {
        super(name, color, brand, limited);
    }

    @Override
    public void call(String inputMessage) {
        if(inputMessage.length()>this.getLimited()){
            System.out.println("<iPhone>Message cannot be sent");
        }else {
            System.out.println("<iPhone>Message: [" + inputMessage + "]");
        }
    }
}
