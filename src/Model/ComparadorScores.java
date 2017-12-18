package Model;
import java.util.Comparator;
//Probando el githubbbb no borrar esto
// 1 2 3 4
public class ComparadorScores implements Comparator<Score>{

	public int compare(Score s1, Score s2) {
		return s1.getScore().compareTo(s2.getScore());
	}

	
}
