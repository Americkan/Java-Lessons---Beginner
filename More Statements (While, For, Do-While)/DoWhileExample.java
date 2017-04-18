//do {
//     statement(s)
//} while (expression);

//The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top. 
//Therefore, the statements within the do block are always executed at least once.

class DoWhileExample {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}