import java.util.Scanner;




//  creating the password class with all the method it needs to be able to let the user create safe passwords and then also safe them inside 
public class password {

    private boolean wantsToCreatePassword = false;

    public static void main(String[] args) {
       
        
    }
    private String password;

    public password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
// creating method to then call the password function if the user clicks on the button 
    public void createThePassword() {
        // setting the user input to the variable UserInput
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Create Random Crypted Password ?");
        String userResponse = UserInput.nextLine();
        this.wantsToCreatePassword = userResponse.equalsIgnoreCase("yes");
        // condition if the boolean is true
        if(wantsToCreatePassword == true){
            //hash 
           
          


        }

        
    
    }
}




