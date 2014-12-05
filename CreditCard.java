public class CreditCard 
{ 
  
  
    
 public int findType(String card)  {//to determine card type
   
    if (card.substring(0,2).equals("51") || card.substring(0,2).equals("52") || card.substring(0,2).equals("53") || card.substring(0,2).equals("54") || card.substring(0,2).equals("55")) 
      return 1;//mastercard
        else if (card.substring(0,1).equals("4")) 
          return 2;//visa card
        else if (card.substring(0,2).equals("34") || card.substring(0,2).equals("37")) 
          return 3;//amex card
        else if (card.substring(0,4).equals("6011")) 
          return 4;//discover card
        else if (card.substring(0,2).equals("36") || card.substring(0,2).equals("38") || card.substring(0,3).equals("301") || card.substring(0,3).equals("302") || card.substring(0,3).equals("303") || 
                 card.substring(0,3).equals("304") || card.substring(0,3).equals("305")) 
          return 5;//Diners Club/ Carte Blanche
else return 0;//if not one of the recognized card types
 }

  
public String verify(String num)
{
    int evens = 0;//declares ints and sets starting values
    int odds = 0;
    int total =0;
  if (num.length() >= 12 && num.length() <= 16)//sets valid card lengths 
  {
    
  for (int i= num.length()-1; i > 0; i-=2)//for even numbers (Luhn check)
  {
    int n = Integer.parseInt(num.substring(i-1, i));
    int b = n*2;
    if (b>= 10)//if number is greater than ten
    {
     b= b-10 + 1;//ten is subtracted from the number and one is added. Largest possible int is 18, so largest digit after is 9.
    }
    evens +=b;//sets new value to evens
  }
  

  for (int i= num.length(); i > 0; i-=2)//Now runs luhn check for odd numbers
  {
     int n = Integer.parseInt(num.substring(i-1, i));
     
     odds +=n;//new value is set to odds 
  }
  }
  
  total = (evens + odds);//odds and evens are added together
    if (total % 10 == 0)//final check to see if valid. Card must be a multiple of 10. 
  {   
      return "Yes";//If valid
    }
    else
      return "No";//If not valid

          
}
}
  
  
  
  

        
        
        
        