package Data;
import java.util.*;

import model.Questions;
public class DataQuestions {
	private static List<Questions> questions = new ArrayList<Questions>();
	
	static {
		questions.add(new Questions(1,"Quelle est la capitale de la france ?", "Paris"));
		questions.add(new Questions(2,"Quelle est la capitale de la Chine ?", "Pekin"));
		questions.add(new Questions(3,"combien font 6 + 4", "10"));
		questions.add(new Questions(4,"Que faut-il pour faire des crepes ?", " farine, lait oeuf"));
		questions.add(new Questions(5,"Quelle est le monument principal de la france ?", "Tour eiffel"));
	}
	
	public void ajouterQuestions() {
		Questions q;
		q = new Questions(0, null, null);
	}
	public static Questions getRandomQuestion() {
		Random rand = new Random();
		return questions.get(rand.nextInt(questions.size()));
	}
	public static Questions GetId(int id) {
		for(Questions q : questions) {
			if(q.getId()== id) return q;
		}
		return null;
	}
	public static int count() {
		return questions.size();
	}
	
	public static List<Questions> GetAllQuestions(){
		return questions;
	}
}
