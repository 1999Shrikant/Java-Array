import java.util.*;

class ArrayX
{
  public int arr1[],arr2[],i=0;

  public ArrayX(int Size1, int Size2)
  {
    arr1= new int[Size1];
    arr2= new int[Size2];
  }

  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter elements of first array:");
    for(i=0;i<arr1.length;i++)
    {
      arr1[i]= sobj.nextInt();
    }

    System.out.println("Enter elements of second array:");
    for(i=0;i<arr2.length;i++)
    {
      arr2[i]= sobj.nextInt();
    }

  }
  public void Display()
  {
    System.out.println("Display first array");
    i=0;
    while(i<arr1.length)
    {
      System.out.print(" "+arr1[i]);
      i++;
    }
    System.out.println("");

    System.out.println("Display Second array");
    i=0;
    while(i<arr2.length)
    {
      System.out.print(" "+arr2[i]);
      i++;
    }
    System.out.println();
  }
}

class program1
{
  public static void main(String [] args)
  {
    Scanner sobj = new Scanner(System.in);
    int Size1=0,Size2=0;

    System.out.println("Enter size of first array:");
    Size1 =  sobj.nextInt();

    System.out.println("Enter size of second array:");
    Size2 =  sobj.nextInt();

    ArrayX obj = new ArrayX(Size1,Size2);

    obj.Accept();
    obj.Display();
  }
}