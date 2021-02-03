package day6;
class Tree{											//......parent class
	int TreeCode;
	int Height;
	int BaseWidth;
	int amount;
	Tree(int TreeCode)
	{
		this.TreeCode=TreeCode;
	}
	void AnnualUpdate(int Height,int BaseWidth,int amount)
	{
		this.Height=Height;
		this.BaseWidth=BaseWidth;
		this.amount=amount;
		
	}
	void DisplayTree()
	{
		System.out.println("height="+this.Height);
		System.out.println("BaseWidth="+this.BaseWidth);
		System.out.println("TreeCode="+this.TreeCode);
		System.out.println("amount="+this.amount);
		
	}
	
}
class Mango extends Tree{						  //......subclass
	int NoOfMangoes;

	 public Mango(int TreeCode, int NoOfMangoes) {
		super(TreeCode);
		this.NoOfMangoes = NoOfMangoes;
	}
	 void AddMangoCount(int i)
		{
			NoOfMangoes=NoOfMangoes+i;
		}
		
	void GetMangoCount()
	{
		System.out.println("mangoes are:"+NoOfMangoes);
	}
	
}
class TreeDetails{
	//rtp
	void ShowDetails(Tree obj)
	{
		obj.DisplayTree();			//to override displaytree() from superclass
	}
	void GetUpdates(Tree obj)
	{
		obj.AnnualUpdate(0,0,0);	//to override annualupdate() from superclass
		
	}
}


public class TreeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree obj=new Mango(110,4);	//used inheritance
		Mango obj1=new Mango(0,0);	//initiated subclass object
		obj.AnnualUpdate(0,0,0);	//called superclass method
		obj.DisplayTree();			//called superclass method
		
		obj1.AddMangoCount(5);		//called subclass method
		obj1.GetMangoCount();		//called subclass method
		
		TreeDetails Obj2 = new TreeDetails();
		Obj2.GetUpdates(obj);
		Obj2.ShowDetails(obj);
	}

}
