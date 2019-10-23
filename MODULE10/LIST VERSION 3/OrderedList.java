/**
 * 
 */

public class OrderedList extends AbstractList {
    /*
     * The add method does what the name suggests.
     * Add an int item to the list.
     * The assumption is to store the item at the end of the list
     * What is the end of the list?
     * Is it the same as the end of the array?
     * Think about how you can use the size variable to add item
     * to the list.
     * 
     * The method returns void (nothing)
     */
    public void add(int item) {
        //Inserts the specified element at the end of the list.
        // TODO
        // Your code goes here....
        if(size==0){
            list[size]=item;
        }else{
            for(int j=0;j<size;j++){
                if(item<=list[j]){
                    insertAt(item,j);
                    break;
                }
            }
        }
        size++;
        if(size==capacity){
            resize();
        }
    }

    private void insertAt(int item, int j) {
    }

    @Override
    public void resize() {
        // TODO Auto-generated method stub

    }

    @Override
    public int indexOf(int item) {
        // TODO Auto-generated method stub
        return 0;
    }
}
    
    