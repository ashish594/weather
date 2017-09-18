package Matrimony;

	public class Customers {
		
		private String fistName;
		private String lastName;
		private String telephone;
		private String hobby;

		
		public String getFistName() {
			return fistName;
		}
		public void setFistName(String fistName) {
			this.fistName = fistName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getHobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		@Override
		public String toString() {
			return "FistName=" + fistName + ", LastName=" + lastName
					+ ", Telephone=" + telephone + ", Hobby=" + hobby;
		}

	}

