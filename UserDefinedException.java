//1. InvalidAgeException

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

//2. NegativeBalanceException

class NegativeBalanceException extends Exception{
    public NegativeBalanceException(String message){
        super(message);
    }
}

// 3. InvalidEmailException

class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}

// 4. ExceedSpeedLimitException

class ExceedSpeedLimitException extends Exception{
    public ExceedSpeedLimitException(String message){
        super(message);
    }
}

// 5. EmptyInputException

class  EmptyInputException extends Exception{
    public EmptyInputException(String message){
        super(message);
    }
}

public class UserDefinedException {
    public static void validateAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or Above.");
        }
        System.out.println("Valid Age : " + age);
    }

    public static void validateBalance(double balance) throws NegativeBalanceException{
        if (balance < 0){
            throw new NegativeBalanceException("Balance is Less than 0.");
        }
        System.out.print("Balance is : " + balance);
    }

    public static void  validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") ){
            throw  new InvalidEmailException("Invalid Email!");
        }
        System.out.println("Your Email is : " + email);
    }

    public static void checkSpeed(int speed) throws ExceedSpeedLimitException{
        if (speed >= 100){
            throw new ExceedSpeedLimitException("Over Speed!");
        }
        System.out.println("Your Speed is : " + speed);
    }

    public static void  checkInput(String input) throws EmptyInputException{

        if (input == null || input.trim().isEmpty()){
            throw new EmptyInputException("Input Cannot be Empty or NULL.");
        }
        System.out.println(" Input is Valid : " + input);
    }

    public static void main(String[] args) {

        try {
            validateAge(17);
        }
        catch (InvalidAgeException e){
            System.out.println("Error : " + e.getMessage());
        }

        try{
            validateBalance(-987.7);
        }catch (NegativeBalanceException e){
            System.out.println("Error : " + e.getMessage());
        }

        try{
            validateEmail("ajay.gmail.com");
        }catch (InvalidEmailException e){
            System.out.println("Error : " + e.getMessage());
        }

        try{
            checkSpeed(120);
        }catch (ExceedSpeedLimitException e){
            System.out.println("Error : " +  e.getMessage());
        }

        try{
            checkInput(null);
        }catch (EmptyInputException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
