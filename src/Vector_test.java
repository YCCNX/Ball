
public class Vector_test
{

	public static void main(String[] args)
	{
		Vector a = new Vector();
		a.x = 3;
		a.y = 4;
		Vector b = new Vector(5, 7);
		Vector c;
		c = a.add(b);
		System.out.println(c.x + " " + c.y);

		Vector d;
		d = a.sub(b);
		System.out.println(d.x + " " + d.y);

		Vector e;
		e = a.mul(5);
		System.out.println(e.x + " " + e.y);
		
		System.out.println(a.dot(b));
		System.out.println(a.size());
		System.out.println(a.unit());

	}

}
