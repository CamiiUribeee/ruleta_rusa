
package com.mycompany.ruletarusa;


public class Message {

    public Message() {
    }
    
    
    public int numbers (int number) throws Exception {
        if (!(number%2==0 )){
            return -1; 
        }
        
        throw new Exception("has muerto"); 
        
    }
}
