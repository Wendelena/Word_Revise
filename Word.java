public class Word{
	public final String name;
	public final String pron;
	public final String mean;
	public final String expre;//can be extended to array
	public int proficiency;
	public final Word synonym;//can be extended to array
	public Word(String n,String p,String m,String e){
		name=n;pron=p;mean=m;expre=e;proficiency=-1;
	}
	public boolean updateProfic(int wrongCount){//true if proficiency==5
	}
}