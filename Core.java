public class Core{
	private final Database base;
	public final String list_name;
	private final int numw;
	public Word[] Wordlist;
	public Core(Database a,String ln,int b) {base=a;list_name=ln;numw=b;}
	public Question getNewQ(){
		return null;
	}
	public Word[] getWordList(){
		return null;
	}
	public void Update(Word[] newlist){
	}
}