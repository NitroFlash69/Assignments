import java.util.*;

interface Shape
{
 String str="Example Decorator";
 void conversion();
}

class Lcase implements Shape
{
    public void conversion()
    {
        System.out.println(str);
    }
}

abstract class CaseDecorator implements Shape
{
  protected Shape decoratedShape;

  public CaseDecorator(Shape decoratedShape)
  {
      this.decoratedShape = decoratedShape;
  }

  public void conversion(){   }
}

class CaseShapeDecorator extends CaseDecorator
{
   public CaseShapeDecorator(Shape decoratedShape)
   {
     super(decoratedShape);
   }

    public void conversion()
    {
      decoratedShape.conversion();
      setCase(decoratedShape);
   }

 private void setCase(Shape decoratedShape)
 {
   System.out.println("Using Decorator String in Upper Case");
   System.out.println(str.toUpperCase());

   System.out.println("Using Decorator String in Lower Case");
   System.out.println(str.toLowerCase());
   }
}

class Que2
{
   public static void main(String args[])
   {
     Shape c1 = new Lcase();

     Shape c2= new CaseShapeDecorator(new Lcase());

     System.out.println("---Original String---");
     c1.conversion();

     System.out.println("\nInside Decorator");
     c2.conversion();
   }
}
