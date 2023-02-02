public class Encapsulation{
  public static void main(String[] args) {
      Account accObj = new Account("PIC16B", "Pp892AjkSS&$7fh##xnak009AAnsbnj@##$aj");
      System.out.println(accObj.username);
      // System.out.println(accObj.password);
      System.out.println(accObj.getPassword());
      // accObj.password = "newPassword";
      accObj.setPassword("newPasswprd");
      accObj.username = "new";
    }
}

class Account {
    public String username; 
    private String password; //notice the private here

    Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    public final String getPassword() {
      return this.password;
    }
  
    public void setPassword(String newPassword) {
      this.password = newPassword;
    }
}



