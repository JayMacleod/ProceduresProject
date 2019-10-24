package com.nw.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instruments {

		@Id
		private int insId;
		private String insName;
		
		public int getInsId() {
			return insId;
		}
		public void setInsId(int insId) {
			this.insId = insId;
		}
		public String getInsName() {
			return insName;
		}
		public void setInsName(String insName) {
			this.insName = insName;
		}

}