package a.c;

import a.*;
import a.b.*;

public class P3 {
    public String name;
    protected String phone;
    private String email;
    String address; // default

    public P3() {
    }

    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.name = "abxyz";
        p1.address = "abxssyz";
        p1.phone = "1234545";
        p1.email = "abx@yz.com";
        P2 p2 = new P2();
        p2.name = "abxyz";
        p2.address = "abxssyz";
        p2.phone = "1234545";
        p2.email = "abx@yz.com";
    }
}
