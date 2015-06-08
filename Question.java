public class Question{
	public final Word obj;
	public final String title;
	public final String choices[];
	public final int ans;
	public final boolean needAssure;
	public final boolean isSpellTest;
	public Question(String t,String c[],int a,boolean n,boolean i){
		title=t;choices=c;ans=a;needAssure=n;isSpellTest=i;
	}
}