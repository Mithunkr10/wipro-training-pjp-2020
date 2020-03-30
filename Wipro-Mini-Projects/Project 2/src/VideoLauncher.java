import java.util.Scanner;

public class VideoLauncher {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
int c=1,ch;
		// TODO Auto-generated method stub		
		while(c!=6) {
		System.out.println("========MAIN MENU========");
		System.out.println("1.Add video\n2.Check out video\n"
				+ "3.Return video\n4.Recieve rating\n5.List Inventory\n6.Exit");
		System.out.println("Enter your choice(1...6):");
		//ch=Integer.parseInt(in.nextLine());
		ch=Integer.parseInt(args[0]);
		c=ch;
		switch(ch)
		{
		case 1: System.out.println("Enter the name of the video to add:");
				//String videoname=in.next();
				String videoname=args[1];
				Video v=new Video(videoname);
				v.getname();
				break;
		case 2: System.out.println("Enter the name of the video to checkout:");
				//videoname=in.next();
				videoname=args[1];
				v=new Video(videoname);
		 		v.docheckout();
		 		break;
		case 3: System.out.println("Enter the video name to return:");
				//videoname=in.next();
		videoname=args[1];		
		v=new Video(videoname);
				v.doreturn();
				break;
		case 4: System.out.println("Enter the video name to give rating:");
				//videoname=in.next();
		videoname=args[1];		
		v=new Video(videoname);
				System.out.println("Enter the video rating:");
				//int r=Integer.parseInt(in.nextLine());
				int r=Integer.parseInt(args[2]);
				v.recieverating(r);
				break;
		case 5: System.out.println("------------------------------------------------------");
				System.out.println("Name\t\tCheckout Status\t\tRating");
				VideoStore vs=new VideoStore();
				vs.listinventory();
				break;
		case 6:System.out.println("Exiting...");
				System.exit(0);
				break;
			default:System.out.println("Invalid input");
			break;
		
		}
		
		}		
		
		in.close();
	}


}
