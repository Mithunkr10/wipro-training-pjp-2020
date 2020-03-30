import java.util.Scanner;

class Video {
String videoname;
boolean checkout;
int rating;
Scanner in=new Scanner(System.in);
public Video(String name)
{	
	videoname=name;
}

public String getname()
{	VideoStore vs=new VideoStore();
	vs.addvideo(videoname);
	return videoname;
}
public void docheckout()
{
  VideoStore vs=new VideoStore(videoname);
  vs.doCheckout(videoname);
}
public void doreturn()
{
	  VideoStore vs=new VideoStore(videoname);
	  vs.doReturn(videoname);
}
public void recieverating(int r)
{
	rating=r;
	VideoStore vs=new VideoStore(videoname);
	  vs.receiverating(videoname, rating);
	
}
public boolean getcheckout(boolean c)
{
	checkout=c;
	return checkout;
}


}
