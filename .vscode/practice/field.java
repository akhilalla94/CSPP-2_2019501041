public class field{
    public static void main(String[] args) {
        Book b = new Book();
        b.title="Hemanth";
        b.author="Akhil";
        System.out.println(b.title);
        System.out.println(b.author);
    }
}
class Book{
    Book(){
    
    }
    String  title;
    String author;
}
