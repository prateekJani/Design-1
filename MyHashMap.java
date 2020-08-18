public class MyHashMap{
    int arr[];
    public MyHashMap(){
        arr = new int[214748364];
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        if (arr[key] == 0)
            return -1;
        else
            return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }

    public static void main(String args[]) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 2);       
        hashMap.put(2, 3);         
        System.out.println(hashMap.get(1));            // returns 2
        System.out.println(hashMap.get(3));            // returns -1 (not found)
        hashMap.put(2, 4);          // update the existing value
        System.out.println(hashMap.get(2));           // returns 4 
        hashMap.remove(2);          // remove the mapping for 2
        System.out.println(hashMap.get(2));            // returns -1 (not found)

    }

}