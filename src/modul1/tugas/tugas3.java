package modul1.tugas;

public class tugas3 {

  static String kata = "23 $# A ,.pa", nstr = "", validateInput, validateOutput;

  public void palindrome() {
    char ch;

    for (int i = 0; i < kata.length(); i++) {
      ch = kata.charAt(i);
      nstr = ch + nstr;
    }
  }

  public void toLowerCase() {
    validateInput = kata.replaceAll("[^a-zA-Z]", "").toLowerCase();
    validateOutput = nstr.replaceAll("[^a-zA-Z]", "").toLowerCase();

  }

  public void validatePalindrome() {
    if (validateInput.equals(validateOutput)) {
      System.out.println("termasuk palindrome");
    } else {
      System.out.println("tidak termasuk palindrome");
    }
  }

  public static void main(String[] args) {
    tugas3 obj = new tugas3();

    obj.palindrome();
    obj.toLowerCase();
    obj.validatePalindrome();
  }
}
