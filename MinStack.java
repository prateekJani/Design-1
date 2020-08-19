public class MinStack {
    int arr[];
    int top1;
    
    public MinStack() {
        arr = new int[214748364];
        top1 = -1;
    }
        
    public void push(int x) {
        top1++;
        arr[top1]=x;
    }
        
    public void pop() {
        arr[top1] = 0;
        top1--;
    }
        
    public int top() {
        return arr[top1];
    }
        
    public int getMin() {
        int minValue = arr[0]; 
        for(int i=1;i<top1+1;i++){ 
          if(arr[i] < minValue){ 
            minValue = arr[i]; 
          } 
        } 
        return minValue; 
    }

    public static void main(String args[]){
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        System.out.println(minStack.getMin()); // return 2
        minStack.push(1);
        System.out.println(minStack.getMin()); // return 1
        minStack.pop();
        System.out.println(minStack.getMin()); // return 2
    }

}