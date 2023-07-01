public class Book {
    protected String name;
    protected String author_first_name;
    protected String author_last_name;
    protected int year_of_publish;
    protected String publish_name;
    protected String genre;
    protected int pages_quantity;

    public Book(String name, String author_first_name, String author_last_name, int year_of_publish, String publish_name, String genre, int pages_quantity) {
        this.name = name;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.year_of_publish = year_of_publish;
        this.publish_name = publish_name;
        this.genre = genre;
        this.pages_quantity = pages_quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public int getYear_of_publish() {
        return year_of_publish;
    }

    public void setYear_of_publish(int year_of_publish) {
        this.year_of_publish = year_of_publish;
    }

    public String getPublish_name() {
        return publish_name;
    }

    public void setPublish_name(String publish_name) {
        this.publish_name = publish_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages_quantity() {
        return pages_quantity;
    }

    public void setPages_quantity(int pages_quantity) {
        this.pages_quantity = pages_quantity;
    }

}
