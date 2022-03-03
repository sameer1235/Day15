package Day15;

public class Student {

		private Integer Rollno;
		private String Name;
		private Double Percentage;
		private String Email;
		
		public Student(Integer Rollno, String Name, Double Percentage, String Email) {
			this.Rollno = Rollno;
			this.Name = Name;
			this.Percentage = Percentage;
			this.Email = Email;
			}
		public void setRollno(Integer Rollno) {
			this.Rollno = Rollno;
		}
		public void setName(String Name) {
			this.Name = Name;
		}
		public void setPercentage(Double Percentage) {
			this.Percentage = Percentage;
		}
		public void setEmail(String Email) {
			this.Email = Email;
		}
		public Integer getRollno() {
			return Rollno;
		}
		public String getName() {
			return Name;
		}
		public Double getPercentage() {
			return Percentage;
		}
		public String getEmail() {
			return Email;
		}
		
		public String toString() {
			return "Student (Rollno="+ Rollno +", Name="+ Name +", "
					+ "Percentage="+ Percentage +", Email="+ Email +") " ;
	}

}
