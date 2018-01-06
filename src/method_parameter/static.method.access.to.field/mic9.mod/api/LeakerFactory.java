package api;

import internal.LeakerImpl;
import internal.InternA;



public class LeakerFactory {

	public static String i = System.getProperty("hi");

    public static Leaker getInstance(){

    	if(i.contains("jo"))
    		return new LeakerImpl();
    	else
    		return new InternA(); 
    }


    public static byte[] getKey(Leaker leaker){

    		if(leaker instanceof LeakerImpl)
    			return ((LeakerImpl) leaker).key;

    		if(leaker instanceof InternA)
    			return ((InternA) leaker).key; 
            
    		return  new byte[] {9,9,9,9,9,9,9};


    }

}