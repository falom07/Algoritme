package AllTask.SecondTaskDepth;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree('Р',
                new Tree('И',
                        new Tree('Г',new Tree('Б',new Tree('A'),new Tree('B')),
                                new Tree('Д',new Tree('Е'),null)),
                        new Tree('Л',new Tree('К'),new Tree('О',new Tree('Н'),new Tree('П')))),
                new Tree('Ч',new Tree ('Ф',new Tree('T'),new Tree('Х',new Tree ('Ц'),null))
                        ,new Tree('Ь',new Tree('Щ',new Tree('Ш'),new Tree('Ы')),new Tree('Я'))));


        System.out.println(tree.sumDeapthRecourthion());
       System.out.println(Tree.sumDeapthIteration(tree));
       System.out.println(Tree.sumWeigthIteration(tree));

    }

}
