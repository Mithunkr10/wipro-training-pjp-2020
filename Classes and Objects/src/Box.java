
public class Box {
	float width,length,depth;
	
	Box(float l,float w,float d)
	{
		this.width=w;
		this.length=l;
		this.depth=d;
	}
	float volumeofbox()
	{
		return length*width*depth;
	}

	public static void main(String[] args) {
		float l,w,d;

		 
		  l=Integer.parseInt(args[0]);
		  w=Integer.parseInt(args[1]);
		  d=Integer.parseInt(args[2]);
		 
		Box b=new Box(l,w,d);
		System.out.println(b.volumeofbox());
	}

}
