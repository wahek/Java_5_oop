import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerApp {
    public static void main(String[] args) {
        ListDataRandom listDataRandom = new ListDataRandom();
        ArrayList<Student> students = new ArrayList<>();
        Operation operation = new Operation();
        Writer writer = new Writer();
        while (listDataRandom.getI() < 20) {
            students.add(listDataRandom.getI(), new Student(listDataRandom.getI(), listDataRandom.getRandomString(listDataRandom.listFirstName), listDataRandom.getRandomString(listDataRandom.listLastName), listDataRandom.getRandomPhone(), listDataRandom.getRandomInt(listDataRandom.listGroup)));
            listDataRandom.setI(listDataRandom.getI() + 1);
        }
        students.add(operation.addRandomStudent());
        System.out.println(students);
        writer.writerInFile(students.toString().replace("[", "").replace("]", ""));
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем соединение....");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился к серверу!");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();
                if (clientRequest.equals("001")) {
                    dataOutputStream.writeUTF("В университете: " + students.size() + " человек.");
                } else if (clientRequest.equals("002")) {
                    int searchId = Integer.parseInt(dataInputStream.readUTF());
                    operation.searchStudent(students, searchId);
                    dataOutputStream.writeUTF("отвечаем: "+operation.searchStudent(students, searchId).toString());

                }
                if (clientRequest.equals("end")) break;
                System.out.println("Мы получили строку: " + clientRequest);
                dataOutputStream.writeUTF("Отвечаем на сообщение: " + clientRequest);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
