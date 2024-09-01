package com.RelationshipMapping1to1UNI;


	import javax.persistence.Entity;
	import javax.persistence.Id;



	@Entity
	
	public class teacher {

		@Id
		private int tid;
		
		private  String tName;
		
		private  String subject;
		
		
		
	
		public int getTid() {
			return tid;
		}

		public void setTid(int tid) {
			this.tid = tid;
		}

		public String gettName() {
			return tName;
		}

		public void settName(String tName) {
			this.tName = tName;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		@Override
		public String toString(){
	        return "Teacher [tid=" + tid + ", tName=" + tName + ", subject=" + subject + "]";
		}
		
		
		
		}
		


