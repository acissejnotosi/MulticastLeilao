/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicastpeer;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Jessica
 */
public class MulticastPeer {
 public static void main(String args[]){ 
		// args give message contents and destination multicast group (e.g. "228.5.6.7")
		
                
                      
                 WritingThread wt = new WritingThread();
                 //System.out.print("ola");
                 ReadingThread rt = new ReadingThread();
                // System.out.print("ola");
                 
                 new Thread(wt).start();
                 new Thread(rt).start();
                        
               
	}	
}