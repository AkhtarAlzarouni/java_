import java.util.regex.Pattern;

public class NewEmployee extends Employee {

   String email;
    String phone;


    static boolean isValid(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }
    static boolean isValidPhoneNumber(String phone)
    {
        String regex = "^(\\+\\d{3}( )?)?\\d{4}[- .]?\\d{4}$";
        Pattern p = Pattern.compile(regex);
        if (phone == null) {
            return false;
        }
        return p.matcher(phone).matches();
    }
    @Override
    void EmployeeSalary() {
        System.out.println("the salary for old employee  " + (salary-10));

}
}
