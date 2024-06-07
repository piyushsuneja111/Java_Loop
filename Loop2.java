class Loop2
{
	public static void main(String args[])
	{
		int x=1;
	for(int i=1;i<=5;i++)
	{		
		for(int j=1;j<=i;j++)
		{
		System.out.print((j%2)!=0?"1":"0");				
		}
		System.out.print("\n");
	}
	}
}
/*
1				
10
101
1010
10101



1
01
101
0101
10101