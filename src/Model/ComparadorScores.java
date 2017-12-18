package Model;
import java.util.Comparator;
//ggg cambio
public class ComparadorScores implements Comparator<Score>{

	public int compare(Score s1, Score s2) {
		return s1.getScore().compareTo(s2.getScore());
	}

	
}
