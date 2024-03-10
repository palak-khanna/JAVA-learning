import java.util.*;
import java.lang.*;

class Stack{
    public Scanner s = null;
    public int num;
    private int stck[];
    public int tos;
    
    Stack() {
        System.out.println("Enter the number of elemeNTS stack : ");
        s = new Scanner(System.in);
        num = s.nextInt();
        stck = new int[num];
        tos = -1;
        
    }

    int push(int item){
        if (this.tos == this.num - 1){
            System.out.println("Stack is full.");
            return 0;
            
        }
        else{
            this.stck[++this.tos] = item;
            return item;
            
        }
        
    }

    int pop(){
        if (this.tos == -1)  {
            System.out.println("Stack underflow.");
            return 0;}
            else {
                return this.stck[this.tos--];
            }
        }
    }

class TestStack {
    public static void main(String args[]){
        Stack mystack = new Stack();
        for (int i = 0; i < mystack.num; i++){
            System.out.print(mystack.push(i+1));
        }
        while (mystack.tos >= 0){
            System.out.print(mystack.pop());
        }
    }
}

