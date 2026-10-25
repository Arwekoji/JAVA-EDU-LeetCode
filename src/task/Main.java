package task;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Главный узел алгоритма задачи
 */
public class Main {

    private record IntegerElement(int value, int origIndex) {}

    public static int[] twoSum(int[] nums, int target) {
        // Шаг первый - упорядочить массив
        IntegerElement[] sortedArray = new IntegerElement[nums.length];
        for (int i = 0; i < nums.length; i++)
            sortedArray[i] =new IntegerElement(nums[i], i);

        Arrays.sort(sortedArray, Comparator.comparingInt(element -> element.value)); // Сортировка по компаратору

        // Шаг второй - Запустить двойной цикл для рваных проверок
        // Внимание! Защиты не нужны по условиям задачи
        for (int i = 0; i < sortedArray.length; i++) {
            int dif = target - sortedArray[i].value; // Заранее вычисленное значение сэкономит число операций за счет небольшого прироста в памяти
            for (int j = i + 1; j < nums.length; j++) {
                if (sortedArray[j].value > dif)
                    break;
                if (sortedArray[j].value == dif)
                    return new int[]{
                            sortedArray[i].origIndex,
                            sortedArray[j].origIndex
                };
            }
        }
        return new int[]{0, 0};
    }
}