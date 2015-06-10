public class Question{
	public final Word obj;
	public final String title;
	public final String choices[];
	public final int ans;
	public final boolean needAssure;
	public final boolean isNameTitle;
	public Question(String t,String c[],Word o,int a,boolean n,boolean i){
		title=t;choices=c;obj=o;ans=a;needAssure=n;isNameTitle=i;
	}
}