package com.nw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Procedures {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int proId;
		private String proName;
		private String proSpeciality;
		private String proInstruments;
		
		public Procedures() {
			
		}
		public Procedures(String proName, String proSpeciality, String proInstruments) {
			super();
			this.proName = proName;
			this.proSpeciality = proSpeciality;
			this.proInstruments = proInstruments;
		}
		
		public Procedures(int proId, String proName, String proSpeciality, String proInstruments) {
			super();
			this.proId = proId;
			this.proName = proName;
			this.proSpeciality = proSpeciality;
			this.proInstruments = proInstruments;
		}
		
		public int getProId() {
			return proId;
		}
		public void setProId(int proId) {
			this.proId = proId;
		}
		public String getProName() {
			return proName;
		}
		public void setProName(String proName) {
			this.proName = proName;
		}
		public String getProSpeciality() {
			return proSpeciality;
		}
		public void setProSpeciality(String proSpeciality) {
			this.proSpeciality = proSpeciality;
		}
		public String getProInstruments() {
			return proInstruments;
		}
		public void setProInstruments(String proInstruments) {
			this.proInstruments = proInstruments;
		}

}
