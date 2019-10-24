class OrderedList extends AbstractList {
    int[] list;
    int size;
    int capacity;

    OrderedList() {
        super();
    }

    public void add(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] <= item) {
                insertAt(item, i);
            }
        }
    }

    // public void resize() {
    // this.list = java.util.Arrays.copyOf(this.list, capacity * 2);
    // capacity = capacity * 2;
    // }

    public void insertAt(int item, int index) {
        for (int i = size - 1; i > index; i--) {
            list[i + 1] = list[i];
        }
        list[index] = item;

    }

    public int indexOf(int item) {
        return binarySearch(list, size, 0, item);
    }

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

}