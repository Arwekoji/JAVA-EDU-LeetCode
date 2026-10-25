package task;

import base.Design;

import java.util.Arrays;
import java.util.Objects;

import static task.Main.twoSum;

/**
 * Набор ручных тестов для проверки соответствия вывода кода (от input) к answer
 */
public class Tests {
    public static final int LEETCODE_NUMBER = 1;
    public static final String LEETCODE_DIFFICULTY = "Easy"; // "Easy", "Med", "Hard"
    public static final String TASK_NAME = "Two Sum";
    public static final String TASK_DESCRIPTION = """
            You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
            
            You may assume that each input would have exactly one solution, and you may not use the same element twice.
            
            You can return the answer in any order.
            """;
    public static final String TASK_CONSTRAINS = """
            2 <= nums.length <= 104
            -109 <= nums[i] <= 109
            -109 <= target <= 109
            Only one valid answer exists.
            """;
    public static final String TASK_FOLLOWUP = """
            Can you come up with an algorithm that is less than O(n2) time complexity?
            """;

    /**
     * Запись с текстовыми описанием теста
     *
     * @param input       Вводные данные
     * @param answer      Ожидаемый ответ
     * @param explanation Объяснение теста на данном примере
     */
    public record TestDesc(String input, String answer, String explanation) {
    }

    /**
     * Example of logic test
     *
     * @return (boolean) answer == output
     */
    public static boolean testExplanation() {
        TestDesc testDesc = new TestDesc(
                "В связи с неопределенностью типа input, все данные вводятся в каждом тесте отдельно",
                "Даже output. Потому что даже число тестов в каждой задаче отличается",
                "Тут можно объяснить почему input должен прийти к answer"
        );
        // vars: test data

        // calculate Output
        // Это обьясняющий тест, поэтому никакие вычисления тут не нужны

        // print all
        Design.printTestData(new Object() {
        }.getClass().getEnclosingMethod(), testDesc, testDesc.answer);

        // comparison of output and answer
        // if () return false;

        return true; // Универсальная заглушка
    }

    /**
     * Test #1 for descripted task
     *
     * @return (boolean) answer == output
     */
    public static boolean test1() {
        TestDesc testDesc = new TestDesc(
                "nums = [2,7,11,15], target = 9",
                "[0,1]",
                "The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1] are returned."
        );
        // vars: test data
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] answer = {0,1};

        // calculate Output
        int[] output = twoSum(nums, target);

        // print all
        Design.printTestData(new Object() {
        }.getClass().getEnclosingMethod(), testDesc, """
                %s
                """.formatted(Arrays.toString(output)));

        // comparison of output and answer
        if (!Arrays.equals(answer, output))
            return false;

        return true; // Универсальная заглушка
    }

    /**
     * Test #2 for descripted task
     *
     * @return (boolean) answer == output
     */
    public static boolean test2() {
        TestDesc testDesc = new TestDesc(
                "nums = [3,2,4], target = 6",
                "[1,2]",
                "The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2] are returned."
        );
        // vars: test data
        int[] nums = {3,2,4};
        int target = 6;
        int[] answer = {1,2};

        // calculate Output
        int[] output = twoSum(nums, target);

        // print all
        Design.printTestData(new Object() {
        }.getClass().getEnclosingMethod(), testDesc, """
                %s
                """.formatted(Arrays.toString(output)));

        // comparison of output and answer
        if (!Arrays.equals(answer, output))
            return false;

        return true; // Универсальная заглушка
    }

    /**
     * Test #3 for descripted task
     *
     * @return (boolean) answer == output
     */
    public static boolean test3() {
        TestDesc testDesc = new TestDesc(
                "nums = [3,3], target = 6",
                "[0,1]",
                "The sum of nums[0] and nums[1] is 3 + 3 = 6, which equals the target. Therefore, the indices [0, 1] are returned."
        );
        // vars: test data
        int[] nums = {3,3};
        int target = 6;
        int[] answer = {0,1};

        // calculate Output
        int[] output = twoSum(nums, target);

        // print all
        Design.printTestData(new Object() {
        }.getClass().getEnclosingMethod(), testDesc, """
                %s
                """.formatted(Arrays.toString(output)));

        // comparison of output and answer
        if (!Arrays.equals(answer, output))
            return false;

        return true; // Универсальная заглушка
    }

    /**
     * Test #4 for descripted task
     *
     * @return (boolean) answer == output
     */
    public static boolean test4() {
        TestDesc testDesc = new TestDesc(
                "none",
                "none",
                "none"
        );
        // vars: test data

        // calculate Output

        // print all
        Design.printTestData(new Object() {
        }.getClass().getEnclosingMethod(), testDesc, """
                none
                """.formatted());

        // comparison of output and answer
        // if () return false;

        return true; // Универсальная заглушка
    }

    /**
     * Test #5 for descripted task
     *
     * @return (boolean) answer == output
     */
    public static boolean test5() {
        TestDesc testDesc = new TestDesc(
                "none",
                "none",
                "none"
        );
        // vars: test data

        // calculate Output

        // print all
        Design.printTestData(new Object() {
        }.getClass().getEnclosingMethod(), testDesc, """
                none
                """.formatted());

        // comparison of output and answer
        // if () return false;

        return true; // Универсальная заглушка
    }
}
