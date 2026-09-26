
/*
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char current : s.toCharArray()) {
            if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(current) && stack.peek() != current) {
                stack.pop(); 
            } else {
                stack.push(current); 
            } 
        }

        StringBuilder b = new StringBuilder(); 
        for (char c : stack) {
            b.append(c);
        } 
        return b.toString();
        
    }
}
*/
 

/*
 class Solution {
    public int maxDepth(String s) {

        int current = 0;
        int max = 0;


        for(char c : s.toCharArray()){
            
            if(c == '('){
                current += 1;
                max = Math.max(max, current);
            }
            else if(c == ')'){
                current -= 1;
            }
        }
        

        return max;
    }
}
*/
class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack1 = new Stack<>();

        int index = word.indexOf(ch);
       
        if (index == -1) {
        return word;
        }

        for (int i = 0; i <= index; i++) {
            stack1.push(word.charAt(i));
        }

        StringBuilder b = new StringBuilder(); 
    
        while (!stack1.isEmpty()) {
           b.append(stack1.pop());
        }

        for (int i = index + 1; i < word.length(); i++) {
            b.append(word.charAt(i));
        }

        return b.toString(); 


    }
}
// this is the code that we did in class along side you

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> q = new ArrayDeque<>();

        int n = tickets.length;

        for (int i = 0; i < n; i++){
        q.offer(i);
        }

        int ans = 0;

        while (!q.isEmpty()){
            int index = q.poll();

            ans += 1;
            tickets[index] -= 1;

            if (index == k && tickets[index] == 0){
                return ans;
            }

            if (tickets[index] != 0){
                q.offer(index);
            }
        }
        return -1;
    }
}


