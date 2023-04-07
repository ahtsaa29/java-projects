package a;

public class P1 {
    public String name;
    protected String phone;
    private String email;
    String address; // default

    public P1() {
    }

}

class M1 extends P1 {
    // public M1() {

    // }
    // String name, String email, String phone, String address
    public M1() {
        name = "aastha";
        email = "sfdfee";
        phone = "12434";
        address = "wefdfdf";

    }
}
