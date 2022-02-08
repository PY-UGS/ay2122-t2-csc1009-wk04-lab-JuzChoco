public class Wk4Q2Instance {
    
    public static void main(String[] args){

        Wk4Q2Class stack = new Wk4Q2Class();

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
        

        while (!stack.empty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
