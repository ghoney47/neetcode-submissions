class Solution {
    public boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack<Character> brackets = new Stack<>();

        if(str.length % 2 != 0)
            return false;

        for (int i = 0; i < s.length(); i++) {
            boolean closed = true;

            System.out.println("Current " + str[i]);
            switch (str[i]){
                case '[':
                case '(':
                case '{':
                    brackets.push(str[i]);
                    break;

            }


            //if we only have closed brackets we know we do not have a valid set
            if (brackets.isEmpty())
                return false;

            switch(str[i]){

                case ']':
                    if (brackets.peek() == '['){
                        System.out.println("True on ], popping");
                        closed = true;
                        brackets.pop();
                    } else{
                        closed = false;
                    }

                    break;
                
                case '}':
                    if (brackets.peek() == '{'){
                        System.out.println("True on }, popping");
                        closed = true;
                        brackets.pop();
                    } else{
                        closed = false;
                    }

                    break;

                case ')':
                    if (brackets.peek() == '('){
                        System.out.println("True on ), popping");
                        closed = true;
                        brackets.pop();
                    } else{
                        closed = false;
                    }

                    break;
            }

            if (!closed)
                return false;
        }


        //after iterating through and not hitting any falses, the stack should not contain any open brackets
        if (!brackets.isEmpty())
            return false;

        return true;
    }
}
