import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuiller entrer le nombre des Employer :");
        int employeeNumber = clavier.nextInt();
        clavier.nextLine();
        double salairePlusBas = 200 , salairePlusGrand = 100;
        

        Map<String, Double> Employers = new HashMap<>();

        
        for (int i = 1; i <= employeeNumber; i++) {
            System.out.print("Nom:");
            String nom = clavier.nextLine();
            System.out.print("Salaire :");
            double salaire = clavier.nextDouble();
      
            Employers.put(nom, salaire);
            clavier.nextLine();
        }
       
          for (String key : Employers.keySet()) {
                    if (Employers.get(key)  <= salairePlusBas) {
                       salairePlusBas =Employers.get(key) ;
                        
                    } else if (Employers.get(key) >= salairePlusGrand){
                        salairePlusGrand = Employers.get(key);

                    }
            
            }

        //Displaying Selection to user
        System.out.print("Choisisez une option : " + "\n" + "1. Plus Grand" + "\n" + "2.Plus Petit " + "\n");
       
        int option = clavier.nextInt();
        clavier.nextLine();
        switch (option) {
            case 1:
                 for (String key : Employers.keySet()) {
                    if (Employers.get(key)  == salairePlusBas) {
                        System.out.println("L'employer ayant un plus bas Salaire ");
                        System.out.println("Key: " + key + ", Value: " + Employers.get(key));
                        
                    } 
            
                }
                
            break;
            case 2 :
                for (String key : Employers.keySet()) {
                    System.out.println("L'employer ayant un plus Grand  Salaire ");
                    if (Employers.get(key)  == salairePlusGrand) {
                        System.out.println("Key: " + key + ", Value: " + Employers.get(key));
                        continue;
                    } 
            
                }
            break;
        
            default:
                break;
        }
       

        
    }
}
