class print{
    public static  void main(String[] args){
            book a = new book("bahubali","akhil",900);
            System.out.println(a.getTitle());
            System.out.println(a.getAuthor());
            System.out.println(a.getPages());
    }
}
class book{
String title;
String author;
int pages;
public book(){
}
public book(String title,String author,int pages){
    this.title=title;
    this.author=author;
    this.pages=pages;
}
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public int getPages(){
    return pages;
}
}
