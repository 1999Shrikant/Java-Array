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

  public void Odd()
  {
    int End1=arr1.length-1;
    int End2=arr2.length-1;
    
    if((arr1.length<=0)&&(arr2.length<=0))
    {
      System.out.println("Both arrays are empty");
      return;
    }
    
    if(arr1.length<=0)
    {
      System.out.println("First array is empty");
    }
    else
    {
      i=0;
      System.out.println("Odd numbers in first array");
      while(i<=End1)
      {
        if(arr1[i]==arr1[End1])
        {
          break;
        }

        if(arr1[i]%2!=0)
        {
          System.out.print(" "+arr1[i]);
        }

        if(arr1[End1]%2!=0)
        {
          System.out.print(" "+arr1[End1]);
        }
        i++;
        End1--;
      }
      System.out.println();
    }
    
    if(arr2.length<=0)
    {
      System.out.println("Second array is empty");
    }
    else
    {
      i=0;
      System.out.println("Odd numbersin second array");
      while(i<=End2)
      {
        if(arr2[i]==arr2[End2])
        {
          break;
        }

        if(arr2[i]%2!=0)
        {
          System.out.print(" "+arr2[i]);
        }

        if(arr2[End2]%2!=0)
        {
          System.out.print(" "+arr2[End2]);
        }
        i++;
        End2--;
      }
      System.out.println();
    }
  } 
}


class program3
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
    obj.Odd();
  }
}

