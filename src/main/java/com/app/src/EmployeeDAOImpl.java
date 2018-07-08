package com.app.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.app.dto.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {
	
	
public static void main(String p[]){
	String str="10100001";
	char[] strArray= str.toCharArray();
	Map<Integer, String> tes=new HashMap<Integer, String>();
	int increment=0;
	int k=0;
	for(int i=strArray.length-1;i>=0;	i--){
		System.out.println(Integer.parseInt(strArray[i]+""));
		increment++;
		if(Integer.parseInt(strArray[i]+"")==1){
			k=i+1;
			tes.put(k, strArray[i]+"");
		}
		
	}
	
	Set<Integer> set = tes.keySet();
	Set<Integer> set1 = new HashSet(Arrays.asList(set));
	System.out.println(Arrays.asList(set1)); 
	
	
	for (Iterator iterator = set.iterator(); iterator.hasNext();) {
		int obj= (Integer) iterator.next();
		System.out.println(obj + tes.get( obj ) );
		
	}
	
}
	public void insertEmp(Employee e) {
	}
	
	

}
