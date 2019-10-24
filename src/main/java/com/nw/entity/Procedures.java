package com.nw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

//changes to database
@Entity
@NamedQueries(value= {
		@NamedQuery(
			name="Procedures.findInstruments",
			query="Select proInstruments from Procedures p where p.proId=?1"
			),
})

public class Procedures {
		
		//states which is primary key
		@Id
		@GeneratedValue
		private int proId;
		private String proName;
		private String proSpeciality;
		private String proInstruments;
		
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
		
		@Override
		public String toString() {
			return "Procedures [proId=" + proId + ", proName=" + proName + ", proSpeciality=" + proSpeciality
					+ ", proInstruments=" + proInstruments + "]";
		}

}
