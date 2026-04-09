class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0; //starting index of char
        int end = s.length() - 1; //end index of char

        while (start < end) { 
            char startC = s.charAt(start); //stores character at pointer start
            char endC = s.charAt(end); //stores character at pointer end

            if (!Character.isLetterOrDigit(startC) && !Character.isLetterOrDigit(endC)) { //if char at pointer start and end is not a alphanumeric
                start++;
                end--;
                System.out.println("both start and end characters are not alphanumeric " + startC + endC);
            } else if (!Character.isLetterOrDigit(startC)) { //only start is not alphanumeric
                start++;
                System.out.println("startC is not alphanumeric " + startC);
            } else if (!Character.isLetterOrDigit(endC)) { //only end is not alphanumeric
                end--;
                System.out.println("endC is not alphanumeric " + endC);
            } else { //if they are both actuall value
                if (startC != endC) { //if they aren't a palindrone
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}
