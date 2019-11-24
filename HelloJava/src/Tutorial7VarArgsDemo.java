class Add
{
	public int add(int ... n)
	{
		int sum=0;
		for(int i:n)
		{
			sum += i;
		}
		return sum;
	}
}
public class Tutorial7VarArgsDemo {

	public static void main(String[] args) {
		Add obj = new Add();
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1,2,3,4,5,6,7,8,9,10));
	}

}
