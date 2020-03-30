package oops;

public class VideoStore {
	String name;
	public VideoStore() {
		
	}
	public VideoStore(String name) {
	this.name=name;

	}
	static int j=0;
	 static String[] Video=new String[4];
	int rating[]= new int[Video.length];
	 boolean checkout[]= new boolean[Video.length];
	 void addvideo(String name)
	{	
		Video[j]=name;
		j++;
		System.out.println("The Video "+name+" added successfully.");
	}
	void doCheckout(String name)
	{
		for(int i=0;i<Video.length;i++)
			if(Video[i]==name)
				{
				System.out.println("The video "+name+" checked out successfully.");
		checkout[i]=true;}
	}
void doReturn(String name)
{
	for(int i=0;i<Video.length;i++)
		if(Video[i]==name)
			System.out.println("The video "+name+" returned successfully.");
}
void receiverating(String name,int r)
{
	for(int i=0;i<Video.length;i++)
		if(Video[i]==name)
		{
			rating[i]=r;
		}
	System.exit(0);
}
void listinventory()
{
	for(int i=0;i<Video.length;i++)
	{
		System.out.println(Video[i]+"\t\t\t"+checkout[i]+"\t\t"+rating[i]);
		if(i==4)
			break;
	}
}


}
