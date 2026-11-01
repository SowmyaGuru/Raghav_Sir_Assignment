public class real_java_automation
{
    public static void main(String[] args)
    {
        //Part A methods
        displayLoginMessage();
        displayLoginMessage();
        enterUsername("Sowmya");
        System.out.println(calculateTotal(200.0,10));
        System.out.println(calculateTotal(500.0,10));
        System.out.println(calculateTotal(700.0,10));
        System.out.println(isPasswordLengthValid("SOWMyA123"));
        System.out.println(isPasswordLengthValid("SOWMyA"));
        printOrderConfirmation("ORD123",50000.00);

        String browser = getDefaultBrowser();
        System.out.println("Browser name: " + browser);


        System.out.println(calculateDiscountedPrice(1000, 10));
        System.out.println(calculateDiscountedPrice(2000, 25));

        sendOtpMessage("8660422030");

        System.out.println(isEmailFormatValid("sowmyaguru62@gmail.com"));

        printTestResult("TEST1" , true);

        System.out.println("**************Part B methods************");
        openLoginPage();

        enterCredentials("sowyaguru62@gmail.com","Appa");

        boolean result = isLoginButtonEnabled();
        System.out.println("Login button enabled " + result);

        boolean res = isErrorMessageCorrect("hello sowmya","Bye sowmya");
        System.out.println(res);

        searchProduct("Iphone 18 Pro");

        if(isProductDisplayed("laptop")){
            System.out.println("Product is displayed");
        }else{
            System.out.println("Product not displayed");
        }

        addProductToCart("Iphone 18 Pro",1000);
        addProductToCart("Camera Pro",100);

        int count = getCartItemCount();
        if(count>=1) {
            System.out.println("Cart has some items");
        }else{
            System.out.println("Cart is empty");
        }
    }
    //Part A Real world Automation Assignment


    static void displayLoginMessage()
    {
        System.out.println("Welcome to the Login Page!");
    }

    static void enterUsername(String username)
    {
        System.out.println("Enter username: " + username);
    }

    static double calculateTotal(double price, int quantity)
    {
        double Total_cost = price * quantity;
        return Total_cost;
    }

    static Boolean isPasswordLengthValid(String password)
    {
        if (password.length() >= 8) {
            return true;
        }else{

            return false;
        }
    }

    static void printOrderConfirmation(String orderId, double amount)
    {
        System.out.println("Order ID :" + " " + orderId + " " + "amount: " + " " + amount + " " + "ORDER CONFIRMED!");
    }

    static String getDefaultBrowser()
    {
        return "Chrome";
    }

    static double calculateDiscountedPrice(double price, double discountPercent)
    {
        double discount = price * discountPercent / 100 ;
        double final_price = price - discount ;
        return final_price;
    }

    static void sendOtpMessage(String phoneNumber)
    {
        System.out.println("OTP Initiated for " + phoneNumber);
        System.out.println("OTP generated successfully");
    }

    static Boolean isEmailFormatValid(String email)
    {
        int atposition = email.indexOf('@');
        int dotposition = email.indexOf('.',atposition + 1);

        if(atposition > 0 && dotposition > atposition + 1 && dotposition < email.length() - 1) {
            return true;
        }else{
            return  false;
        }
    }

    static void printTestResult(String testName, boolean passed)
    {
        if(passed){
            System.out.println(testName + " : PASS");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    //Part B assignment scenarios

    static void openLoginPage()
    {
        System.out.println("Opening URL: https://example.com/login");
    }


    static void enterCredentials(String username, String password)
    {
        System.out.println("Enter Username: " + " " + username);
        System.out.println("Password Entered Successfully");
    }

    static  boolean isLoginButtonEnabled()
    {
        return true;

    }
    static String  getLoginPageTitle()
    {
          return "Login Page";
    }
    static boolean  isErrorMessageCorrect(String actualMessage, String expectedMessage)
    {
        if (actualMessage == expectedMessage){
            return true;
        } else {
            return false;

        }
    }
    static void searchProduct(String productName){
          System.out.println("Enter product name: " + productName);
          System.out.println("Press Search");
    }
    static boolean  isProductDisplayed(String productName)
    {
        if (productName.equals("Laptop")){
            return true;
        }else {
            return false;
        }
    }
    static void addProductToCart(String productName, int quantity)
    {
        System.out.println("Adding: " + productName + " with quantity :" + quantity);
    }
    static int  getCartItemCount()
    {
        return 2;
    }
}

