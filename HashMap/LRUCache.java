class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }    
    int size;
    int capacity;
    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        Node temp = map.get(key);
        if(temp == null){
            return -1;
        }
        int value = temp.value;
        temp.value = value;

        // Break the temp connections

        Node next = temp.next;
        Node prev = temp.prev;
        prev.next = next;
        next.prev = prev;

        // put temp node ahead of Head node

        Node hn = this.head.next;
        temp.next = hn;
        temp.prev = head;
        head.next = temp;
        hn.prev = temp;

        return value;       
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            temp.value = value;
            Node prev = temp.prev;
            Node next = temp.next;
            prev.next = next;
            next.prev = prev;

            // Put temp node ahead of Head Node at the starting

            Node hn = this.head.next;
            temp.next = hn;
            temp.prev = head;
            head.next = temp;
            hn.prev = temp;

        } else{

            if(this.size == this.capacity){
                Node lrun = tail.prev;
                Node lrunp = lrun.prev;
                tail.prev = lrunp;
                lrunp.next = tail;
                map.remove(lrun.key);
                this.size--;
            }

            Node curr = new Node(key, value);
            Node hn = this.head.next;
            curr.next = hn;
            curr.prev = head;
            head.next = curr;
            hn.prev = curr;
            map.put(key, curr);
            this.size++;
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
