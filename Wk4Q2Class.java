public class Wk4Q2Class {
    
    private int elements[];
    private int size;

    public Wk4Q2Class(){  //StackOfIntegers() method
        this.elements = new int[16];
        this.size = -1;
    }

    public Wk4Q2Class(int capacity){ //StackOfIntegers() method
        this.elements = new int[capacity]; 
        this.size = -1;
    }

    public boolean empty(){
        return this.size == -1; 
    }

    public int peek(){
        return this.elements[size]; // Element at the top
    }

    public void push(int value){
        this.size = this.size + 1; //Increment index by 1
        this.elements[size] = value; //Add the new value into the new allocated index
    }

    public int pop(){
        int poppedElement = this.elements[size];
        this.size = this.size - 1; //Decrement index by 1
        return poppedElement;
    }

    public int getSize(){
        return (this.size + 1); 
    }
}
