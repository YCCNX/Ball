
public class Vector
{
	double x, y;

	public Vector()
	{
		x = 0;
		y = 0;
	}

	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x = x + v.x;
		result.y = y + v.y;
		return result;
	}

	public Vector sub(Vector v)
	{
		Vector result = new Vector();
		result.x = x - v.x;
		result.y = y - v.y;
		return result;
	}

	public Vector mul(double m)
	{
		Vector result = new Vector();
		result.x = this.x * m;
		result.y = this.y * m;
		return result;
	}

	public double dot(Vector v)
	{
		double result = this.x * v.x + this.y * v.y;
		return result;
	}

	public double size()
	{
		double result = Math.sqrt((x * x) + (y * y));
		return result;
	}

	public Vector unit()
	{
		double s = size();
		return new Vector(x / s, y / s);
	}

	public String toString()
	{
		return (x + " " + y);
	}


}
