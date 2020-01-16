package pkg5syou;

class Book implements Comparable<Book>
{
    String title;
    int price;

    Book(String title, int price)
    {
        this.title = title;
        this.price = price;
    }

    public int compareTo(Book b)
    {
        return this.price - b.price;
    }
}