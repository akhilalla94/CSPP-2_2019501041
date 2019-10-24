abstract class AbstractList implements ListInterface {
    int[] list;
    int size;
    int capacity;

    AbstractList() {
        this.list = new int[10];
        this.size = 0;
        this.capacity = 10;

    }

    public abstract void add(int item);

    // public abstract void resize();
    public void resize() {
        this.list = java.util.Arrays.copyOf(this.list, capacity * 2);
        capacity = capacity * 2;
    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        if (index < size && index >= 0) { // validation
            return this.list[index];
        }
        return -1;
    }

    public abstract int indexOf(int item);

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String out = "[";
        int i;
        for (i = 0; i < this.size - 1; i++) {
            out += this.list[i] + ",";
        }
        out += this.list[i] + "]";

        return out;
    }

    public boolean contains(int item) {
        for (int i = 0; i < this.size; i++) {
            if (item == this.list[i]) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {

        if (index < size && index >= 0) {
            int i = index;

            for (int j = i + 1; j < this.size; j++) {
                this.list[j - 1] = this.list[j];
            }
            this.list[this.size] = 0;
            this.size--;
        }
    }

}