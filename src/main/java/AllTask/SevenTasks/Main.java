package AllTask.SevenTasks;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("Одеса");//0
        graph.addVertex("Миколаїв");//1
        graph.addVertex("Умань");//2
        graph.addVertex("Київ");//3
        graph.addVertex("Вінниця");//4
        graph.addVertex("Кропивницький");//5
        graph.addVertex("Херсон");//6
        graph.addVertex("Кривий Ріг");//7
        graph.addVertex("Дніпро");//8
        graph.addVertex("Харків");//9
        graph.addVertex("Суми");//10
        graph.addVertex("Полтава");//11
        graph.addVertex("Житомер");//12
        graph.addVertex("Хмелькицьк");//13
        graph.addVertex("Львів");//14
        graph.addVertex("Тернопіль");//15
        graph.addVertex("Рівне");//16

        graph.addEdge(0,1,132);
        graph.addEdge(0,2,271);
        graph.addEdge(1,6,71);
        graph.addEdge(1,7,204);
        graph.addEdge(2,4,160);
        graph.addEdge(2,3,212);
        graph.addEdge(2,5,167);
        graph.addEdge(3,11,342);
        graph.addEdge(3,12,140);
        graph.addEdge(4,13,122);
        graph.addEdge(5,7,119);
        graph.addEdge(5,8,245);
        graph.addEdge(7,8,146);
        graph.addEdge(8,9,216);
        graph.addEdge(9,10,183);
        graph.addEdge(11,9,143);
        graph.addEdge(12,16,188);
        graph.addEdge(13,15,111);
        graph.addEdge(15,14,127);
        graph.addEdge(15,16,159);
        graph.addEdge(16,14,121);

        graph.path();


    }
}
