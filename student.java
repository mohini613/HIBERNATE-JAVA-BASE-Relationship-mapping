package com.RelationshipMapping1to1UNI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity

public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private  String sName;
	
	private  String addrs;
	
	
	@OneToOne  //means student can have teacher data but teacher canneot have student data that is unidirectional
	private teacher t;


	
	
	public int getSid() {
		return sid;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getAddrs() {
		return addrs;
	}


	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}


	


	public void setSName(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setTeacher(teacher t2) {
		// TODO Auto-generated method stub
		
	}
	@Override
    public String toString() {
        return "student [sid=" + sid + 
               ", sName='" + sName + '\'' + 
               ", addrs='" + addrs + '\'' + 
               (t != null ? ", teacher={tid=" + t.getTid() + 
                             ", tName='" + t.gettName() + 
                             "', subject='" + t.getSubject() + "'}" : "") + 
               "]";
	
	}


	public void setsid(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
