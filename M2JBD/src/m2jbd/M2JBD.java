/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2jbd;


public class M2JBD {
        
   
    public static void main(String[] args) 
    {
        String name;
        int pi = 100;
        int abs, wrkday, late,sss,ph,tax, grpay, mon,latededuct;
        int loan, totd, netpay; 
        float dw, ann = 0, ad;
        
        System.out.println("Jomari Basila Divinagracia");
        System.out.println("Machine Problem 2\n ");
        System.out.print("JBD Inc.\n");
        System.out.print("Pay Roll\n");
      
        
        System.out.print("\nName : ");
        name= TextIO.getlnString(); 
        
        System.out.print("Working days : ");
        wrkday= TextIO.getlnInt();
        
        
        System.out.print("Monthly Salaries : ");
        mon= TextIO.getlnInt();
        
        
        System.out.print("Annual Salaries : ");
        ann = (float) ((mon)*12);
        System.out.println(ann);
        
        System.out.print("Daily Wages: ");
        dw = (float) ((ann)/313);
        System.out.println(dw);
        
        System.out.print("Absences : ");
        abs= TextIO.getlnInt();
        
        System.out.print("Lates : ");
        late= TextIO.getlnInt();
        
        System.out.print("Late Deduction : ");
        latededuct = (int) (float) (late * ((( mon / wrkday ) / 8 ) / 60 ) );
        System.out.println(latededuct);
        
        System.out.print("Absences Deduction : ");
        ad = (float)(dw*abs);
        System.out.println(ad);
        
        
        System.out.print("Gross Pay : ");
        grpay = mon/2;
        System.out.println(grpay);
        
        System.out.print("Deduction\n");
        System.out.print("SSS : ");
        sss = mon;
        if (mon <= 10000)
        {
            sss= 1400;
        } else if (mon > 10000 && mon <= 20000)
        {
            sss= 2600;
        } else if (mon > 20000)
            sss= 3200;
        System.out.println(sss);
        
        System.out.print("Pag-ibig : ");
        System.out.println(pi);
        
        System.out.print("PhilHealth : ");
        ph = (int) mon;
        if (mon >= 10000 && mon<= 79999)
        {
            ph = (int)(mon*0.04);
        } else if (mon >= 80000)
        {
            ph= 3200;
        }
        System.out.println(ph);
        
                
                
                
        System.out.print("Tax : ");
        tax =  (int) ann;
        if (ann <= 250000)
        {
            tax = 0;
            
        } else if (ann >=250001 && ann <= 400000)
        {
            tax = (int) (((ann-250001)*0.20)/12);
            
        } else if (ann>= 400001 && ann <= 800000)
        {
            tax = (int) (((ann-400000)*0.25)/12);
            
        } else if (ann >= 800001 && ann <= 2000000)
        {
            tax = (int) (((ann-800000)*0.30)/12);
            
        } else if (ann >=2000001 && ann <= 4000000)
        {
            tax = (int) (((ann-2000000)*0.32)/12);
        } else if (ann >= 8000001)
        {
            tax = (int) (((ann-8000000)*0.35)/12);
        }
        System.out.println(tax);
        
        
        System.out.print("Loan: ");
        loan = mon;
        if (mon >= 10000 && mon <= 20000)
        {
            loan= (int) mon/50;
           
        } else if (mon >= 30000 && mon <= 40000)
        {
            loan = (int) mon/17;
        } else if (mon >= 50000 && mon <= 100000)
        {
            loan = (int) mon/10;
        }
        System.out.println(loan);
        
        System.out.print("Total Deduction: ");
        totd= (int) (abs+late+sss+pi+ph+loan+tax);
        System.out.println(totd);
        
        System.out.print("Net Pay: ");
        netpay = (int) (mon-totd);
        System.out.println(netpay);
        
    }
    
}
