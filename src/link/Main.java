package link;
import java.util.*;
import one.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("欢迎使用经典软件体系结构教学软件\n请选择你想要使用的风格\n1.主程序-子程序软件体系结构\n" +
                "2.面向对象软件体系结构\n" +
                "3.事件系统软件体系结构\n" +
                "4.管道-过滤软件体系结构\n" +
                "5.退出");
        int i=in.nextInt();
        output(i);
        }


    public static void output(int i){
        Scanner in=new Scanner(System.in);
        switch (i){
            case 1:
                System.out.println("主程序—子程序体系结构是较简单的结构，其组件是主程序和子程序，连接件是调用返回机制");
                System.out.println("关键代码如下：\n" +
                        "public static void main(String[] args) {\n" +
                        "\n" +
                        "        demo1 kwic = new demo1();\n" +
                        "        kwic.input(\"E:\\\\input.txt\");\n" +
                        "        kwic.shift();\n" +
                        "        kwic.alphabetizer();\n" +
                        "        kwic.output(\"E:\\\\output.txt\");\n" +
                        "    }");
                new demo1();
                i=in.nextInt();
                output(i);
                break;
            case 2:
                System.out.println("在面向对象体系结构中，软件工程的模块化、信息隐藏、抽象和重用原则得到了充分的体现。在这种体系结构中，数据表示和相关原语操作都被封装在抽象数据类型中。在这种风格中，对象是构件，也成为抽象数据类型的实例。对象与对象之间，通过函数调用和过程调用来进行交互。");
                System.out.println("关键代码如下：" +
                        "public static void main(String[] args) {\n" +
                        "        Input input = new Input();\n" +
                        "        input.input(\"E:\\\\input.txt\");\n" +
                        "        Shift shift = new Shift(input.getLineTxt());\n" +
                        "        shift.shift();\n" +
                        "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\n" +
                        "        alphabetizer.sort();\n" +
                        "        Output output = new Output(alphabetizer.getKwicList());\n" +
                        "        output.output(\"E:\\\\output.txt\");\n" +
                        "\n" +
                        "    }");
                new tow.Main();
                i=in.nextInt();
                output(i);
                break;
            case 3:
                System.out.println("事件：能够激活对象功能的动作，当发生动作后会给所涉及对象发送一条消息，对象便可执行相应的功能。\n" +
                        "\n" +
                        "事件系统主要分为隐式调用和显示调用两种\n" +
                        "\n" +
                        "隐式调用：1.事件的触发者不知道那些构件会被影响，相互独立\n" +
                        "\n" +
                        "2.不能假设构件的处理顺序，甚至不知道哪些构件或过程会被调用\n" +
                        "\n" +
                        "3.在整个系统中，各个构件之间无联系，各自独立，通过对事件的发布和注册实现关联\n" );
                System.out.println("关键代码如下：\n" +
                        " public static void main(String[] args) {\n" +
                        "        //创建主题\n" +
                        "        KWICSubject kwicSubject = new KWICSubject();\n" +
                        "        //创建观察者\n" +
                        "        Input input = new Input(\"E:\\\\input.txt\");\n" +
                        "        Shift shift = new Shift(input.getLineTxt());\n" +
                        "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\n" +
                        "        Output output = new Output(alphabetizer.getKwicList(), \"E:\\\\output.txt\");\n" +
                        "\n" +
                        "        // 将观察者加入主题\n" +
                        "        kwicSubject.addObserver(input);\n" +
                        "        kwicSubject.addObserver(shift);\n" +
                        "        kwicSubject.addObserver(alphabetizer);\n" +
                        "        kwicSubject.addObserver(output);\n" +
                        "        // 逐步调用各个观察者\n" +
                        "        kwicSubject.startKWIC();\n" +
                        "    }");
                new three.Main();
                i=in.nextInt();
                output(i);
                break;
            case 4:
                System.out.println("主要包括过滤器和管道两种元素。在这种结构中，构件被称为过滤器，负责对数据进行加工处理。每个过滤器都有一组输入端口和输出端口，从输入端口接收数据，经过内部加工处理之后，传送到输出端口上。数据通过相邻过滤器之间的连接件进行传输，连接件可以看作输入数据流和输出数据流之间的通路，这就是管道。\n"
                );
                System.out.println("关键代码如下：\n" +
                        "public static void main(String[] args) throws IOException {\n" +
                        "        File inFile = new File(\"E:\\\\input.txt\");\n" +
                        "        File outFile = new File(\"E:\\\\output.txt\");\n" +
                        "        Pipe pipe1 = new Pipe();\n" +
                        "        Pipe pipe2 = new Pipe();\n" +
                        "        Pipe pipe3 = new Pipe();\n" +
                        "        Input input = new Input(inFile, pipe1);\n" +
                        "        Shift shift = new Shift(pipe1, pipe2);\n" +
                        "        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);\n" +
                        "        Output output = new Output(outFile,pipe3);\n" +
                        "        input.transform();\n" +
                        "        shift.transform();\n" +
                        "        alphabetizer.transform();\n" +
                        "        output.transform();\n" +
                        "\n" +
                        "    }");
                new four.Main();
                i=in.nextInt();
                output(i);
                break;
            case 5:
                break;
        }

}}
