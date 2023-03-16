import java.util.Random;

public class ListDataRandom {
    static int i = 0;
    String[] listFirstName = new String[]{"Ваня", "Миша", "Саша", "Вова", "Катя", "Ира"};
    String[] listLastName = new String[]{"Дмитричук", "Солов", "Бурденко", "Краев", "Белых"};
    int[] listGroup = new int[]{123, 25, 12, 44, 5};
    Random random = new Random();

    public String getRandomString(String[] strings) {
        int i = random.nextInt(strings.length);
        return strings[i];
    }

    public int getRandomInt(int[] ints) {
        int i = random.nextInt(ints.length);
        return ints[i];
    }

    public String getRandomPhone() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(8);
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(random.nextInt(9));
        }
        return stringBuilder.toString();
    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
