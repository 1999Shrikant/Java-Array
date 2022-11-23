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
    if(arr1.length<=0)
    {
      System.out.println("Invalid Size of First Array");
    }
    
    else
    {
      System.out.println("Enter elements of first array:");
      for(i=0;i<arr1.length;i++)
      {
        arr1[i]= sobj.nextInt();
      }
    }
    
    if(arr2.length<=0)
    {
      System.out.println("Invalid Size of Second Array");
    }
    else
    {
      System.out.println("Enter elements of second array:");
      for(i=0;i<arr2.length;i++)
      {
        arr2[i]= sobj.nextInt();
      }
    }
  }

  public void SumArray()
  {
    int Sum1=0,Sum2=0;
    
    i=0;
    while(i<arr1.length)
    {
      Sum1=Sum1+arr1[i];
      i++;
    }
    
    i=0;
    while(i<arr2.length)
    {
      Sum2=Sum2+arr2[i];
      i++;
    }

    System.out.println("Sum of first array:"+Sum1);
    System.out.println("Sum of second array:"+Sum2);
  }
}


class program5
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
    obj.SumArray();
  }
}

