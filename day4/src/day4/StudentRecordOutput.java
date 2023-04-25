package day4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	
	public StudentRecordOutput(String outputFile) throws IOException {
		
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile,true));
	}
	
	public void writer(Student student) throws IOException {
		dataOutput.writeBytes("name: "+student.getName()+"\n");
		dataOutput.writeBytes("gender: "+String.valueOf(student.getGender())+"\n");
		dataOutput.writeBytes("age: "+String.valueOf(student.getAge())+"\n");
		dataOutput.writeBytes("grade: "+String.valueOf(student.getGrade())+"\n");
		dataOutput.writeBytes("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	
	public static void main(String[] args) {
		
		
		String outputfile = "F:\\wileyPrac\\javaProg\\data\\studentData.txt";
		
		List<Student> listStudent = new ArrayList<>(); 
		
		listStudent.add(new Student("venkat", true, 28, 90.1f));
		listStudent.add(new Student("Anmol", true, 21, 81.5f));
		listStudent.add(new Student("Shreya", false, 18, 91.1f));
		listStudent.add(new Student("Rishav", true, 19, 95.1f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
			
			for(Student student: listStudent) {
				outputWriter.writer(student);
			}
			
			outputWriter.save();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}





