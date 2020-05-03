package Run;

import com.google.gson.Gson;

import java.util.Scanner;

public class CLI {/*
    Scanner scanner = new Scanner(System.in);

    CLI() {
        System.out.println("Already have an account?");
        switch (scanner.next()) {
            case "y":
                System.out.println("Please Enter Your UserName");
                String username = scanner.next();
                int ID = -1;
                for (int i = 0; i < Main.getPlayers().size(); i++) {
                    if (username.equals(Main.getPlayers().get(i).getUserName())) {
                        ID = i;
                        System.out.println("Welcome Back " + Main.getPlayers().get(i).getUserName() + "!");
                        System.out.println("Please Enter Your Password");
                        if (passwordHandler(ID)) {
                            System.out.println("You Logged In Succesfully");
 //                           Main.log("Player Login" , ID);
                            playerhandler(ID);
                        }
                    }
                }
                if (ID == -1) {
                    System.out.println("Couldn't Find Your UserName! Please Chek Entered UserName and Try Again.");
                    System.out.println("or if You Don't Have an Account , Create Your Account.");
                    new CLI();
                    return;
                } else {
                    break;
                }
            case "n":
                System.out.println("Welcome , I Want to Make You an Account!");
                System.out.println("Please Enter Your UserName");
                String newusername = scanner.next();
                boolean chek = true;
                for (int i = 0; i < Main.getPlayers().size(); i++) {
                    if (newusername.equals(Main.getPlayers().get(i).getUserName())) {
                        System.out.println("This UserName Has Been Taken!");
                        new CLI();
                        chek = false;
                        break;
                    }
                }
                if (chek) {
                    System.out.println("Nice!");
                    System.out.println("Please Enter Your Password");
                    System.out.println("(Password Length must be at least 8 characters)");
                    String newpassword = scanner.next();
                    while (newpassword.length() < 8) {
                        System.out.println("Your Password is not Secure!");
                        newpassword = scanner.next();
                    }
                    Main.getPlayers().add(new Player(newusername, newpassword, 50));
                    System.out.println("Congratulations! Now You Can Sign in!");
//                    Main.log("New Player" , Main.getPlayers().size()-1);
                    new CLI();
                }

        }
    }

    boolean passwordHandler(int ID) {
        String password = scanner.next();
        while (!password.equals(Main.getPlayers().get(ID).getPassword())) {
            if (password.equals("exit")) {
                return false;
            }
            System.out.println("Wrong Password!");
            System.out.println("If You Want to Go To Back Type exit");
            System.out.println("Please Check and Enter Your Password");
            password = scanner.next();
        }
        if (Main.getPlayers().get(ID).getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    void playerhandler(int ID) {
        System.out.println("Enter Your Command!");
        switch (scanner.nextLine()) {
            case "exit -a":
                System.exit(1);
                break;
            case "delete-player":
                System.out.println("Enter Your Password To Delete");
                if (passwordHandler(ID)) {
                    Main.getPlayers().remove(ID);
                    System.out.println("Player Deleted Successfully");
                } else {
                    System.out.println("Player Delete is not Successful!");
                    playerhandler(ID);
                }
                break;
            case "collections":
                for (int i = 0; i < Main.getPlayers().get(ID).getHeros().get(Main.getPlayers().get(ID).getHeroID()).getCards().size(); i++) {
                    System.out.println(Main.getPlayers().get(ID).getHeros().get(Main.getPlayers().get(ID).getHeroID()).getCards().get(i).getName());
                    cardhandler(ID);
                }
                break;
            case "store":
                storehandler(ID);
        }

    }

    void cardhandler(int ID) {

    }

    void storehandler(int ID) {

    }*/
}




