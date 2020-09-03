package main;


public class BalancedBrackets {
   /**
    * The function BalancedBrackets should return true if and only if
    * the input string has a set of "balanced" brackets.
    * <p>
    * That is, whether it consists entirely of pairs of opening/closing
    * brackets (in that order), none of which mis-nest. We consider a bracket
    * to be square-brackets: [ or ].
    * <p>
    * The string may contain non-bracket characters as well.
    * <p>
    * These strings have balanced brackets:
    * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    * <p>
    * While these do not:
    * "[LaunchCode", "Launch]Code[", "[", "]["
    *
    * @param str - to be validated
    * @return true if balanced, false otherwise
    */
   public static boolean hasBalancedBrackets(String str) {
      int brackets = 0;
      for (char ch : str.toCharArray()) {
         if (ch == '[') {
            brackets++;
         } else if (ch == ']') {
            brackets--;
         }
         if(brackets < 0) {
            return false;
         }
      }
      return brackets == 0;
   }

   public static boolean hasBalancedParenthesis(String str){
      int counter = 0;
      for (char ch : str.toCharArray()) {
         if(ch == '('){
            counter++;
         }else if(ch == ')'){
            counter--;
         }
         throw new IllegalArgumentException("It is not a parenthesis");
      }
      return counter == 0;
   }
}
