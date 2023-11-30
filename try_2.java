public class try_2 {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Acceso denegado - Ud debe tener 18 años.");
    }
    else {
      System.out.println("Acceso Grantizado - Su edad es sufuciente!");
    }
  }

  public static void main(String[] args) {
    checkAge(21);
  }
}