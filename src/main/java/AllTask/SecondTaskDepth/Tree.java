package AllTask.SecondTaskDepth;
public class Tree {
    private char mainChar;
    private Tree rideChar;
    private Tree leftChar;

    public Tree(char mainValue, Tree rideValue, Tree leftValue) {
        this.mainChar = mainValue;
        this.rideChar = rideValue;
        this.leftChar = leftValue;
    }
    public Tree(char mainValue){
        this.mainChar = mainValue;
    }


    public int sumDeapthRecourthion(){
        int sum = mainChar;

        System.out.println(mainChar);

        if(rideChar != null){
            sum += rideChar.sumDeapthRecourthion();
        }
        if(leftChar != null){
            sum += leftChar.sumDeapthRecourthion();
        }
        return sum;
    }
    public static int sumDeapthIteration(Tree object){
        Stack<Tree> stack = new Stack<>();
        stack.push(object);

        int sum = 0;
        int i = 0;

        while(!stack.isEmpty()){
            Tree node = stack.pop();

            System.out.println(++i + ") " +  node.mainChar);

            sum += node.mainChar;

            if(node.leftChar != null){
                stack.push(node.leftChar);
            }
            if(node.rideChar != null){
                stack.push(node.rideChar);
            }
        }
        return sum;
    }
    public static int sumWeigthIteration(Tree object){
        Queue<Tree> queue = new Queue<>();
        queue.add(object);

        int sum = 0;
        int i = 0;

        while(!queue.isEmpty()){
            Tree node = queue.remove();

            System.out.println(++i + ") " +  node.mainChar);

            sum += node.mainChar;

            if(node.leftChar != null){
                queue.add(node.leftChar);
            }
            if(node.rideChar != null){
                queue.add(node.rideChar);
            }
        }
        return sum;
    }


}
