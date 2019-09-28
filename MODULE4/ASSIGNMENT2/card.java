final class Menu {
    private Menu() {

}
    public static  void main(final String[] args) {
            Card c1 = new Card();
             c1.setTitle("bahubali");
             c1.setAuthor("rajamouli");
             c1.setSubject("emotional");
            Card c2 = new Card();
             c2.setTitle("Life of pie");
             c2.setAuthor("gosling");
             c2.setSubject("love story");
            Card c3 = new Card();
             c3.setTitle("avatar");
             c3.setAuthor("james cameron");
             c3.setSubject("Sciente fiction");
            Cardcatalog a = new Cardcatalog();
            a.addACard(c1);
            a.addACard(c2);
            a.addACard(c3);
            a.printcatalog();
    }
}
//  System.out.println(c1.getTitle());
// System.out.println(c1.getAuthor());
// System.out.println(c1.getSubject());
//
//
class Card {
/**.
* title is used for declaring a title of book.
*/
String title;
/**.
 * author is used for declaring a author of book.
*/
String author;
/**.
* subject is used for declaring a subject of book.
*/
String subject;
// Card(String title,String author,String subject){
//     this.title=title;
//     this.author=author;
//     this.subject=subject;
// }
public String getTitle() {
    return this.title;
}
public String getAuthor() {
    return this.author;
}
public String getSubject() {
    return this.subject;
}
public void setTitle(final String t) {
    this.title = t;
}
public void setAuthor(final String a) {
    this.author = a;
}
public void setSubject(final String s) {
    this.subject = s;
}
public String toString() {
    return title + ", " + author + "," + subject;
}
}
class Cardcatalog {
    /**.
     * count is used for declaring count of books.
     */
    private int count = 0;
    /**.
     * card array is used for declaring a array of cards.
     */
    private Card[] cardArray;
    /**.
     * ten is used for array number.
     */
    private final int ten = 10;
    Cardcatalog() {
        cardArray = new Card[ten];
    }
    public void addACard(final Card c) {
    this.cardArray[this.count] = c;
    this.count += 1;
}
public Card getAtitle(final String title) {
    for (int i = 0; i < this.count; i++) {
        if (this.cardArray[i].title.equals(title)) {
            return this.cardArray[i];
        }
    }
    return null;
}
public Card[] getAnAuthor(final String author) {
    int c = 0;
    Card[] array = new Card[count];
    for (int i = 0; i < this.count; i++) {
        if (this.cardArray[i].author.equals(author)) {
            array[c] = this.cardArray[i];
            c += 1;
        }
    }
    return array;
}
public Card[] getSubject(final String subject) {
    int c = 0;
    Card[] array = new Card[count];
    for (int i = 0; i < this.count; i++) {
        if (this.cardArray[i].subject.equals(subject)) {
            array[c] = this.cardArray[i];
            c += 1;
        }
    }
    return array;
}
public void removeATitle(final String title) {
    for (int i = 0; i < count; i++) {
        if (this.cardArray[i].title.equals(title)) {
            this.cardArray[i] = null;
        }
    }
}
public void printcatalog() {
    for (int i = 0; i < this.count; i++) {
        if (this.cardArray[i] != null) {
            System.out.println(cardArray[i]);
        }
    }
}
}
