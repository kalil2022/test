public class RegistrationUtil {
   boolean validateUserInput(String username, String password,String confirmPassword){
       if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
           return false;
       }
       if(!password.equals(confirmPassword)){
           return false;
       }
      else return true;

   }
}
