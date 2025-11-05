
interface Publication {
    void displayInfo();
}


class Book implements Publication {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", Год: " + year);
    }
}


class Magazine implements Publication {
    private String title;
    private int issueNumber;
    private int year;

    public Magazine(String title, int issueNumber, int year) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Журнал: " + title + ", Выпуск №" + issueNumber + ", Год: " + year);
    }
}


public class Main {
    public static void main(String[] args) {
        Publication pub1 = new Book("Война и мир", "Л.Н. Толстой", 1869);
        Publication pub2 = new Magazine("National Geographic", 5, 2024);
        Publication pub3 = new Magazine("А", 8, 2024);

        pub1.displayInfo();
        pub2.displayInfo();
        pub3.displayInfo();
    }
}
