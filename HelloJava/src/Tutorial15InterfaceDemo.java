/*
 * Difference b/w interface and abstract. As Java doesn't support multiple inheritance but a class can inherit from multiple Interfaces. 
 * In abstract class you can have abstract declared and normal method defined. In Interface you only have abstract method declared.
 * You can not define a normal/concrete method. In Interface no need to mention "public abstract" with method while declaring. 
 * By default all methods are abstract. Can use the reference of an interface but can not instantiate an Interface. 
 * i.e can not create obj of an interface.  Use implements with interface instead of extends.
 * 
 * From Java 1.8 onward we can define method in Interface. We will discuss this later.
 */


interface Writer2
{
	void write();
}

class Pen2 implements Writer2
{
	public void write() 
	{
		System.out.println("I m in Pen1");
	}
}

class Pencil2 implements Writer2
{
	public void write() 
	{
		System.out.println("I m in Pencil");
	}
}

class DoDo
{
	public void DoSomething(Writer2 p)
	{
		p.write();
	}
}

public class Tutorial15InterfaceDemo {

	public static void main(String[] args) {
		Writer2 p = new Pen2();
		Writer2 pe = new Pencil2();
		DoDo d = new DoDo();
		d.DoSomething(pe);
		d.DoSomething(p);
	}

}