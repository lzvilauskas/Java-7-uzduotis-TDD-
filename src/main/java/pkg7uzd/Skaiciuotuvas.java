/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7uzd;

/**
 *
 * @author PC
 */
public class Skaiciuotuvas 
{
    
    public static int skaiciuoti(String veiksmas, Number skaicius1, Number skaicius2)
    {
        int ats = 0;
        
        if(null != veiksmas)
        switch (veiksmas) {
            case "sudeti":
                ats = skaicius1.intValue() + skaicius2.intValue();
                break;
            case "atimti":
                ats = skaicius1.intValue() - skaicius2.intValue();
                break;
            case "dalinti":
                ats = skaicius1.intValue() / skaicius2.intValue();
                break;
            case "dauginti":
                ats = skaicius1.intValue() * skaicius2.intValue();
                break;
            default:
                break;
        }
        return ats;
    }
    
    public static int skaiciuoti(char veiksmas, Number skaicius1, Number skaicius2)
    {
        int ats = 0;
        
        if(veiksmas != 0)
        switch (veiksmas) {
            case '+':
                ats = skaicius1.intValue() + skaicius2.intValue();
                break;
            case '-':
                ats = skaicius1.intValue() - skaicius2.intValue();
                break;
            case '/':
                ats = skaicius1.intValue() / skaicius2.intValue();
                break;
            case '*':
                ats = skaicius1.intValue() * skaicius2.intValue();
                break;
            default:
                break;
        }
        return ats;
    }
    
}