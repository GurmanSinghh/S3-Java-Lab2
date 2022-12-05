package exercise1;

import java.util.*;
class QuestionBank{
    // function to display questions and return answer key as array for them
    public int[] simulateQuestion(){
        int b[]=new int[]{2,2,3,4,2};// answer key
        System.out.println("Question1: Java uses a programming unit called ________ to define a group of related objects.\n 1.Object \n 2.Class \n 3.Method \n 4.Package\n");
        System.out.println("Question2: Which keyword is used to define class in Java?\n 1.public \n 2.class \n 3.Class \n 4.new \n");
        System.out.println("Question3: An object is an instance of?\n 1.program \n 2.method \n 3.class \n 4.variables \n");
        System.out.println("Question4: In the Java programming language, you define an enum type by using the ______ keyword.\n 1.num \n 2.static \n 3.public \n 4.enum \n");
        System.out.println("Question5: Who invented Java? \n 1.Bill Gates \n 2.James Gosling \n 3.Elon Musk \n 4.Mark Zukcerberg \n ");

        return b;
    }
    
    // function to check if answer given by user is correct or wrong and count total correct and incorrect answers 
    public void checkAnswer(int a[],int b[]){
        boolean fl=false;
        int c=0,ic=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){// incorrect answer
                System.out.println(generateMessage(false)+" Correct option: "+b[i]);
                ic++;
            }
            else// correct answer
            {
                System.out.println(generateMessage(true));
                c++;
            }
        }
        // percentage of correct answers
        float p=(float)c/a.length*100;
        System.out.println("Correct answers: "+c+", Incorrect answers: "+ic+", Percentage of correct answers: "+p);
    }
    
    // function to generate random message when answer is wrong or correct 
    public String generateMessage(boolean f){
        Random rand=new Random();
        if(f==true){// if answer is correct
            switch(rand.nextInt(4)){
            case 0:
                return "\n WOOOAH!  Excellent! \n";
                
            case 1:
                return "\n You got it right, Congrats! \n";
               
            case 2:
                return "\n Keep up the good work! \n";
                
            case 3:
                return "\n You are just phenomenal \n";

            }
            
        }
        else{// if answer is wrong
            switch(rand.nextInt(4))
            {
            case 0:
                return "\n Ooops!. Please try again \n";
               
            case 1:
                return "\n Wrong.Its okay! Give it another shot. \n";
               
            case 2:
                return "\n Dont give up practice makes you perfect \n";
              
            case 3:
                return " \n No. Keep trying, you learn from mistakes \n";

            
                    
            }
        }
        return "";
    }
    // function to take answers from user
    public void inputAnswer(){
        int b[]=simulateQuestion();// answer key
        int a[]=new int[b.length];// stores answers given by user
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter 1-4 option as your answer for question:");
        for(int i=0;i<b.length;i++){
            System.out.print("Enter answer for question "+(i+1)+": ");
            a[i]=s.nextInt();
        }
        checkAnswer(a,b);
    }
}
