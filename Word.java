public class Word{
	public final String name;
	public final String pron;
	public final String mean;
	public final String expre;//can be extended to array
	public int proficiency;
	public int phase;
	public int wrongCount;
	public final String synonym;//can be extended to array
	public Word(String n,String p,String m,String e){
		name=n;pron=p;mean=m;expre=e;proficiency=-1;
		phase=wrongCount=0;
	}
	public void Correct() {phase++;}
	public void Incorrect() {wrongCount++;}
}