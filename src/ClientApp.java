import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 1234)) {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while (true) {
                System.out.println("""
                        Кто вы:
                        1: Студент
                        2: Преподаватель
                        0: Выход""");
                String choice0 = scanner.next();
                switch (choice0) {
                    case "1":
                    System.out.println("""
                            1: Узнать количетсво людей в университете
                            2: Найти ученика
                            0: Назад
                            """);
                    String choice1 = scanner.next();
                    switch (choice1){
                        case "1":
                            dataOutputStream.writeUTF("001");
                            break;
                        case "2":
                            dataOutputStream.writeUTF("002");
                            System.out.println("Введите id ученика: ");
                            String str = scanner.next();
                            dataOutputStream.writeUTF("str");
                    }
                }
                dataOutputStream.writeUTF(choice0);
                if (choice0.equals("0")) break;
                System.out.println("Получили сообщение от сервера: " + dataInputStream.readUTF());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

