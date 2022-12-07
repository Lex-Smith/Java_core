package homework4.basic;

public class Task1 {

    public static void main(String[] args) {

        //проблемы с русской кодировкой, пришлось все сообщения выводить на английском

        Duck duck = new Duck(false);
        Duck duck1 = new Duck(true);
        Airplane airplane = new Airplane(10);
        Airplane airplane1 = new Airplane(-1);

        Flying[] objects = {duck, duck1, airplane, airplane1};

        for (Flying obj : objects) {
            try {
                obj.Fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
