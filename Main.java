public class Main {
    public static void main(String[] args) {

        // наполняем список призов тестовыми рандомными значениями
        ToysManager.GeneratePrises(10);
        ToysManager manager = new ToysManager();

        // Queue queue1 = new Queue(manager, 10, true); true - удаляет из очереди
        // игрушку
        Queue queue1 = new Queue(manager, 10);
        for (int i = 0; i < 10; i++)
            manager.appendResults(queue1.get());
    }
}
