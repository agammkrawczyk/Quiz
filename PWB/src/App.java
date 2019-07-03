import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String q1="What is the name of subject?\n"
		+"(a)PWB\n(b)PRA\n(c)PRI\n";
			
	
	Question[]questions= {
			new Question(q1, "a")
	};
	takeTest(questions);
	}

	public static void takeTest(Question[] questions) {
		int score=0;	
		Scanner keyboarInput = new Scanner(System.in);
		for (int i=0;i<questions.length; i++) {
			System.out.println(questions[i].promt);
			String answer= keyboarInput.nextLine();
			if (answer.equals(questions[i].answer)) {
				score++;
			}
		}
	System.out.println(" You  have got " + score+"/"+questions.length);
}}
