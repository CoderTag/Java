// Diff b/w interface and abstract. As Java doesn't support multiple inheritance but a class can inherit from multiple
// Interface. In abstract class you can have abstract and normal method. But in Interface you only have abstract method
// in Interface no need to define public abstract with method. By default all methods are abstract
// you can use the reference of an interface but can not instantiate an Inerface. i.e can not create obj of interface
// you use implemet with interface instead of extends

interface Writer2
{
	void write();
}

class Pen2 implements Writer2
{
	public void write() 
	{
		System.out.println("I m in Pen");
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

public class InterfaceDemo {

	public static void main(String[] args) {
		Writer2 p = new Pen2();
		Writer2 pe = new Pencil2();
		DoDo d = new DoDo();
		d.DoSomething(pe);
		d.DoSomething(p);
	}

}