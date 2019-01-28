package week01.slot01;

public class TestPBStudent {

	public static void main(String[] args) {
		PBStudent student1 = new PBStudent();
		PBStudent student2 = new PBStudent();
		PBGroup group1 = new PBGroup();
		group1.groupId = "ABC01";
		group1.groupName = "Diploma Level 5 in ABC01";
		student1.studentId = "1";
		student1.name = "Jailani";
		student1.group = group1;
		student1.programme = "Diploma Level 5 in ABC";
		
		student2.studentId = "2";
		student2.name = "Rahman";
		student2.group = group1;
		student2.programme = "Diploma Level 5 in DEF";
		
		student1.goToSchool();
		student2.goToSchool();
	}
	
}
