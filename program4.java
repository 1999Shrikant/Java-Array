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

  public int[] Concat()
  {
    int brr[];
    int Size = arr1.length+arr2.length,j=0;

    brr = new int[Size];
    
    for(i=0;i<arr1.length;i++,j++)
    {
      brr[j] = arr1[i];
    }

    for(i=0;i<arr2.length;i++,j++)
    {
      brr[j] = arr2[i];
    }

    return brr;
  } 
}


class program4
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
    int iRet[]=obj.Concat();
    System.out.println(Arrays.toString(iRet));
  }
}

