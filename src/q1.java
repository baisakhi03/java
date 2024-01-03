
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int x=0,y=1,n=20;
		for(int i=0;i<=n;i++)
		{
			System.out.println(s);
			s=x+y;
			x=y;
			y=s;
		}
	}
}

