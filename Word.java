import java.util.*;
public class Word{
	public final String name;
	public final String pron;
	public final String mean;
	public final String expre;//can be extended to array
	public final String synonym;//can be extended to array
	public final Date nextDate;
	public int proficiency;
	public int phase;
	public int wrongCount;
	public Word(String n,String p,String m,String e,String s,Date nd,int pr){
		name=n;pron=p;mean=m;expre=e;synonym=s;nextDate=nd;proficiency=pr;
		phase=wrongCount=0;
	}
	public void Correct() {phase++;}
	public void Incorrect() {wrongCount++;}
}