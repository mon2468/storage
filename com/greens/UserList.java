package com.greens;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	public static <EmpDetails> void main(String[] args) {
		List<EmpDetails> l=new ArrayList();
		EmpDetails e=new EmpDetails();
		e.SetEmpId("787");
		e.SetEmpName("Deepan ");
		e.SetEmpPhno(7904468373l);
		 EmpDetails e2=new EmpDetails();
		 e2.SetEmpId(567);
		 e2.SetEmpName("Monster");
		 e2.SetEmpPhno(6374748817l);
		 l.add(e);
		 l.add(e2);
		 System.out.println(l);
		 for( int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getEmpId()); 
			System.out.println(l.get(i).getEmpName());
			System.out.println(l.get(i).getEmpPhno());
			
			
		 }
		 foreach(EmpDetails x:l){
			 System.out.println(x.getEmpId());
			 System.out.println(x.getEmpName());
			 System.out.println(x.getEmpPhno());
			 
		 }
		
		
		
	}

}
