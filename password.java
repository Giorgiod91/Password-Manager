import java.util.Scanner;



//  creating the password class with all the method it needs to be able to let the user create safe passwords and then also safe them inside 
public class password {

    private boolean wantsToCreatePassword = false;


    private String password;


    

    public static void main(String[] args) {
       
        
    }
    

    // Constructor where we initialize
    public password(String password) {
        this.password = password;
    }
    // getter
    public String getPassword() {
        return password;
    }

    //setter
    public void setPassword(String password) {
        this.password = password;
    }

    //method to crypt Base64
    public static String encodeToBase64(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
      }
      
      public static String decodeFromBase64(String encodedMessage) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedMessage);
        String decodedString = new String(decodedBytes);
        return decodedString;
      }
   


    
// creating method to then call the password function if the user clicks on the button 
    public void createThePassword() {
        // setting the user input to the variable UserInput
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Create Random Crypted Password ?");
        String userResponse = UserInput.nextLine();
        this.wantsToCreatePassword = userResponse.equalsIgnoreCase("yes");


        



        // condition if the boolean is true
        if(userResponse.contains("yes")){
            //hash 
            wantsToCreatePassword = true;
           


                     
        }

        if(wantsToCreatePassword == true) {

            encodeToBase64(password);

        }

        
    
    }
}




