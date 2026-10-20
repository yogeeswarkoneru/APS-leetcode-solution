class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int capacity;
    private int count;

    public MyCircularQueue(int k) {
        capacity = k;
        data = new int[k];
        head = 0;
        tail = -1;
        count = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        tail = (tail + 1) % capacity;
        data[tail] = value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        count--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[head];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[tail];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == capacity;
    }
}