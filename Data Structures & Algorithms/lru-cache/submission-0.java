class LRUCache {

    class Node{
        int val;
        int key;
        Node next;
        Node prev;

        Node(int key, int val){
            this.val = val;
            this.key = key;
        }
    }

    //map holds the key and the Node;
    Map<Integer,Node> nodeMap = new HashMap<>();
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;  
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;    
    }
    

    public int get(int key) {
        ///first we need to check if its in the map
        if(!nodeMap.containsKey(key)){
            return -1;
        }
        //otherwise lets access that Node and move it to MRU by unlinking
        Node node = nodeMap.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        
        //after unlinking move it to the end
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;

        return node.val;

    }
    
    public void put(int key, int value) {
        ///when inserting we must check for three things
        /// if the capacity is full we remove from LRU and map and insert

        if(nodeMap.containsKey(key)){
            Node leavingNode = nodeMap.get(key);
            leavingNode.prev.next = leavingNode.next;
            leavingNode.next.prev = leavingNode.prev;     

            //once we unlink lets change the value of the node
            leavingNode.val = value;

            //now move that node to the mru 
            leavingNode.prev = tail.prev;
            leavingNode.next = tail;
            tail.prev.next = leavingNode;
            tail.prev = leavingNode;  

        }else{
            //we can insert new node at the end
            Node newNode = new Node(key, value);
            nodeMap.put(key, newNode);    

            newNode.prev = tail.prev;
            newNode.next = tail;
            tail.prev.next = newNode;
            tail.prev = newNode;

        }

        //check if that newNode insert went over capacity
        //remove the LRU
        if(nodeMap.size() > capacity){
            Node removingNode = nodeMap.get(head.next.key);
            //evict from the cache
            nodeMap.remove(removingNode.key);
            removingNode.prev.next = removingNode.next;
            removingNode.next.prev = removingNode.prev;

        }
    


        
    }
}
