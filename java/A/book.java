package A;
public class book {
    String name;
    String isbn;
    float price;
    String published_date;

    public book() {
    }

    public book(String n, String i, float p, String pd) {
        name = n;
        isbn = i;
        price = p;
        published_date = pd;
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(isbn);
        System.out.println(price);
        System.out.println(published_date);
    }

    public static void main(String[] a) {
        book b = new book("Java ABC", "111-abc", 52.05f, "12th Jan 2023");
        b.printDetails();
    }
}
