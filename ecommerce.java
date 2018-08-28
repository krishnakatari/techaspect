import java.util.*;
import java.lang.*;
class Main {
  static Scanner s=new Scanner(System.in);
   String details[]=new String[30];
   int price[]=new int[30];
   String category[]=new String[30];
   int no;
  //methods
   void addData()
  { String temp="";
   
    System.out.println("enter following details ");
    System.out.print("enter product name  "); temp=s.next(); temp=temp+" "; 
    System.out.print("\nenter price "); price[no]=s.nextInt();
    System.out.print("\nenter category "); category[no]=s.next();
    System.out.print("\nenter quantity "); temp+=s.next(); temp+=" "; 
    System.out.print("\nenter purchase date ");   temp+=s.next(); temp+=" "; 
    System.out.print("\nenter expiry date ");     temp+=s.next(); temp+=" "; 
    System.out.println("======================================================");
    details[no]=temp;
    no++;
    
  }
  
void listData()
  {
    
    System.out.println(" PRODUCT NAME   QUANTITY   PURCHASEDATE&EXPIRYDATE   PRICE   CATEGORY");
    for(int i=0;i<no;i++)
    {
      String temp=details[i];
      String arr[]=temp.split(" ",0);
      for(String a:arr) 
      System.out.print(a+"    ");
      System.out.print(price[i]+"   ");
      System.out.println(category[i]+"   ");
      System.out.println("___________________________________________________");
    }
    System.out.println("======================================================");

  }
  
  void filterData(int ch)
  { int lp,hp;
    String cat;    
    
    if(ch==1)
       {  System.out.print("\nenter lowest price range of product  ");
          lp=s.nextInt();
          System.out.print("\nenter highest price range of product  ");
          hp=s.nextInt();
           System.out.println(" PRODUCT NAME   QUANTITY   PURCHASEDATE&EXPIRYDATE   PRICE   CATEGORY");
          for(int i=0;i<no;i++) 
            {
              if(price[i]>=lp&&price[i]<=hp) 
                {String temp=details[i];
                 String arr[]=temp.split(" ",0);
                    for(String a:arr) 
                        System.out.print(a+"    ");
                 System.out.print(price[i]+"   ");
                 System.out.println(category[i]+"   ");
                  System.out.println("___________________________________________________");
                 }
            }
       }
       else 
       {
         System.out.print("\nenter category of product  ");
         cat=s.next();
         for(int i=0;i<no;i++) 
            {
              if(category[i].equals(cat)) 
                {String temp=details[i];
                 String arr[]=temp.split(" ",0);
                    for(String a:arr) 
                        System.out.print(a+"    ");
                 System.out.print(price[i]+"   ");
                 System.out.println(category[i]+"   ");
                  System.out.println("___________________________________________________");
                 }
            }

       }
        System.out.println("====================================================");

  }


  public static void main(String[] args) 
  {
    
    Main m=new Main();
    int i,flag=0;
    System.out.println("       ECOMMERCE APP");
    System.out.println("................................. \n it features");
    System.out.println("* user interface to add data of product");
    System.out.println("* to list all products to user");
    System.out.println("* categorize products based on price, category");
    System.out.println("................................. ....\n ");
    while(true)
    {
      System.out.print("select 1.add data 2.list all products 3.filter product data through price or category 4.exit");
      i=s.nextInt();
      switch(i)
      {
        case 1: m.addData(); break;
        case 2: m.listData(); break;
        case 3: System.out.println("select 1.filtering for price     2.filtering for category");
                int x=s.nextInt(); m.filterData(x); break;
        case 4: flag=1; break;
        default : System.out.println("please check the option and enter again");
      }
      if(flag==1) break;
    }
   
  }
}