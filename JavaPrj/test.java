import java.util.Scanner;
class Book {
    private String title;
    private int price;
    private int year;
    private String author;
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private Book(String title, int price, int year, String author, String name, int birthYear, int birthMonth, int birthDay) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }
    // public String getTitle() {
    //     return title;
    // }
    // public int getPrice() {
    //     return price;
    // }
    // public int getYear() {
    //     return year;
    // }
    // public String getAuthor() {
    //     return author;
    // }
    // public String getName() {
    //     return name;
    // }
    // public int getBirth() {
    //     return birthDay + birthMonth + birthYear;
    // }
    // public int getBirthYear() {
    //     return birthYear;
    // }
    // public int getBirthMonth() {
    //     if (birthMonth < 1 || birthMonth > 12) {
    //         return 0;
    //     } else {
    //         return birthMonth;
    //     }
    // }
    // public int getBirthDay() {
    //     if (birthDay < 1 || birthDay > 31) {
    //         return 0;
    //     } else {
    //         return birthDay;
    //     }
    // }
    public static Book createBook(String title, int price, int year, String author, String name, int birthYear, int birthMonth, int birthDay) {
        return new Book(title, price, year, author, name, birthYear, birthMonth, birthDay);
    }

    public void ShowBook() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println("Author: " + name + " " + birthYear + " " + birthMonth + " " + birthDay);
    }
    public void IsItSameYear(Book book) {
        if (this.year == book.year) {
            System.out.println("The books are in the same year");
        } else {
            System.out.println("The books are not in the same year");
        }
    }
    public void SaleOff(int x) {
        x = this.price / 100 * x;
        this.price = this.price - x;
        System.out.println("The price is " + this.price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        int price = sc.nextInt();
        System.out.println("Enter the year of the book: ");
        int year = sc.nextInt();
        System.out.println("Enter the name of the author: ");
        String name = sc.nextLine();
        System.out.println("Enter the birth year of the author: ");
        int birthYear = sc.nextInt();
        System.out.println("Enter the birth month of the author: ");
        int birthMonth = sc.nextInt();
        System.out.println("Enter the birth day of the author: ");
        int birthDay = sc.nextInt();
        Book book = Book.createBook(title, price, year, author, name, birthYear, birthMonth, birthDay);
        book.ShowBook();
        book.SaleOff(10);
    }
}
