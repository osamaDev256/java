package Queue;

public class ArrayQueue <E>{
	 private E[] data;
	    private int f=0;
	    private int sz=0;
	    
	    public ArrayQueue(){
	        this(10);
	    }
	    public ArrayQueue(int capacity)
	    {data=(E[]) new Object[capacity];}
	    public int size(){return sz;}
	    public boolean isEmpty(){return sz==0;}
	    public void enqueue(E e){
	        if(sz==data.length){System.out.println("Queue is full");
	        return;}
	        int avail=(f+sz)%data.length;
	        data[avail]=e;
	        sz++;
	        }
	    public E first(){
	        if(isEmpty())return null;
	        return data[f];}
	    
	    public E dequeue(){
	        if(isEmpty()) return null;
	        E answer=data[f];
	        data[f]=null;
	        f=(f+1)%data.length;
	        sz--;
	        return answer;}
	    
	    public static void rev_queue(ArrayQueue<Integer>qu)
	    {
		    ArrayStack<Integer>temp=new ArrayStack();
		    
		    while(!qu.isEmpty())
		    temp.push(qu.dequeue());
		    
		    while(!temp.isEmpty())
		    qu.enqueue(temp.pop());
	    
	    }
	        
	    public static void main(String[] args) {
			System.out.println("aaa");
		}
	       
}
