package HomeTask;

import java.util.*;

/*Создать новый проект. Написать метод, который принимает список чисел и
возвращает минимальное число из списка чисел. В main продемонстрировать работу этого метода.
 Закоммитить, затем запушить эту з-чу в репозиторий.
 Скинуть ссылку на этот репозиторий в чат, либо в личку. */
public class MinNumbersForGit {
    public static void main(String[] args) {
        int size = 30;
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(i, random.nextInt(50));
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println(findMinFromArrayList(numbers));
    }

    public static int findMinFromArrayList(List<Integer> minNumber) {
        int min = Collections.min(minNumber);
        return min;
    }
}

