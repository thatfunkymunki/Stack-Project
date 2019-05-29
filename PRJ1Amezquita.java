/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRJ1AmezquitaR;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class PRJ1AmezquitaR {
      
    public static class GUI extends JFrame implements ActionListener{
        
        //create labels
        private JLabel expression, result;
        
        //create input and output box
        private JTextField input, output;
        
        //create button
        private JButton evaluate;
        
        //create panels
        private JPanel dataIn, button, dataOut;
        
        //variable for entered data
        private String enteredExpression;
        
        //variables for stacks
        private ArrayStack operators, operands;
                
        //this is the GUI constructor
        public GUI(){
            
            //initialize panel for the input field and textbox
            dataIn = new JPanel();
            button = new JPanel();
            dataOut = new JPanel();
                                   
            //initialze input text field and label
            expression = new JLabel("Enter Infix Expression");
            input = new JTextField("Ex. 4 + 3");
            
            //set the size of the input box
            input.setPreferredSize(new Dimension(200,20));
            
            //initialize button
            evaluate = new JButton("Evaluate");
            evaluate.setPreferredSize(new Dimension(100,30));
            
            //initialize the output text field and label
            output = new JTextField();
            result = new JLabel("Result");
            output.setEditable(false);
            
            //set the size of the output box
            output.setPreferredSize(new Dimension(200,20));
            
            //setting borders
            dataIn.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            dataIn.setLayout(new FlowLayout(FlowLayout.CENTER));
            
            //setting borders
            button.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            button.setLayout(new FlowLayout(FlowLayout.CENTER));
            
            //setting borders
            dataOut.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            dataOut.setLayout(new FlowLayout(FlowLayout.CENTER));
            
            //add label and field to the dataIn panel
            dataIn.add(expression);
            dataIn.add(input);
            
            //add button to button panel
            button.add(evaluate);
            
            //add label and output box to dataOutPanel
            dataOut.add(result);
            dataOut.add(output);
            
            //add panels to the frame
            this.add(dataIn, BorderLayout.NORTH);
            this.add(button, BorderLayout.CENTER);
            this.add(dataOut, BorderLayout.SOUTH);
            
            //add actionlistener to button
            evaluate.addActionListener(this);
      
            
        }//end GUI constructor
        
        //button click actions
        @Override
        public void actionPerformed(ActionEvent e){
            
            //tokenize input
            char[] tokens = input.getText().toCharArray();
  
            
            System.out.print(tokens[1]);
            
            
            output.setText(String.valueOf(tokens[0]));
            
            
        }// end actionPerformed
        
        
    }//end GUI class
    
    //stack interface
    public interface Stack<E> {
        public boolean isFull();
        public boolean isEmpty(); 
        public E peek() throws EmptyStackException;
        public void push(E item)throws EmptyStackException;
        public E pop()throws EmptyStackException;
    
    }//end stack
    
    //class for constructing stack
    public static class ArrayStack<E> implements Stack<E>{
        
        //variable for default size of stack
        private static int DEFAULT_SIZE = 10;
        
        //initialize array
        E elements[];
        
        //variable for how many elements are in the array
        private int numberOfElements = 0;
        
        //constructor for ArrayStack
        public ArrayStack(){
                      
           this(DEFAULT_SIZE);
                   
        }// end ArrayStack()
        
        public boolean isFull(){
            
            //place holder
            return true;
            
        }// end isFull
        public boolean isEmpty(){
            
            //place holder
            return true;
            
        }// end isEmpty
        public E peek(){
            
            //place holder
            return "test";            
            
        }// end peek
        
        //push method
        public void push(E item){
            
            
            
        }
        public E pop(){
            
            //place holder
            return "test";
            
        }// end pop
        
        
    }//end ArrayStack
    
    public static void main(String[] args) {
        
        GUI solver = new GUI();
        
        solver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        solver.setLocationRelativeTo(null);
        solver.setVisible(true);
        solver.setSize(450, 175);
        solver.setTitle("Infix Expression Evaluator");
     
    }//end main class
    
}//end PRJ1Amezquita
