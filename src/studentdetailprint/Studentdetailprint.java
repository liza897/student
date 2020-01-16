/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetailprint;

/**
 *user interaction , store in array and then print student list
 * @author hp
 */
public class Studentdetailprint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student();
        s1.name ="liza";
        s1.sid=234;
        System.out.println(s1.name + " " +s1.sid);
     
    }
    
}
