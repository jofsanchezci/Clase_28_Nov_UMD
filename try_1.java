public class try_1 {
  public static void main(String[] args) {
    try {
      int[] nums = {1, 2, 3,4,5};
      System.out.println("El elemento de la pos es: "+nums[10]);
    } catch (Exception e) {
      System.out.println("A cometido algun error.");
  	}finally {
  		System.out.println("La instrucción Tyr Catch a finalizado.");
  	}
    
  }
}









