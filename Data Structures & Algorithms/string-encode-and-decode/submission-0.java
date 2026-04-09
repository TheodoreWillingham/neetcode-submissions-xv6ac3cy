class Solution {

    public String encode(List<String> strs) {
        String encoding = "";

        for (String str : strs) {
            encoding += str.length();
            encoding += "#";
            encoding += str;
        }

        System.out.println(encoding);
        return encoding;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int index = 0;
    
        while(index < str.length()) {
            int number = 0; //stores the number before #

            //get the number 
            while (str.charAt(index) != '#') {
                number = number * 10 + (str.charAt(index) - '0');
                index++;
            }
            //goes over the #
            index++;
            //test print
            // System.out.println("number is " + number + " index is " + index);

            //use number to extract string
            // System.out.println(str.substring(index, index + number));
            list.add(str.substring(index, index + number));
            index += number;

        }

        return list;
    }
}
