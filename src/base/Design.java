package base;

import task.Tests;

import java.lang.reflect.Method;

/**
 * Набор оформителей для вывода задачи и её решения
 */
public class Design {
    public static final int LINE_LENGTH = 127;
    public static final String LINE_SEGMENT = "─";

    /**
     * Пишет в консоль заголовок задачи
     */
    public static void printTaskHeader() {
        System.out.printf("""
                LeetCode task #%d
                "%s" (%s)
                %s
                %s%s
                Constraints:
                %s%s
                Follow-up:
                %s%s
                
                """,
                task.Tests.LEETCODE_NUMBER, task.Tests.TASK_NAME, Tests.LEETCODE_DIFFICULTY,
                createLine(), Tests.TASK_DESCRIPTION, createLine(),
                Tests.TASK_CONSTRAINS, createLine(),
                Tests.TASK_FOLLOWUP, createLine()
                );
    }

    /**
     * Пишет в консоль вывод логической ошибки
     */
    public static void printTaskError() {
        System.out.println("[ERROR_1]: Вывод кода задачи не совпадает с тестовыми данными");
    }

    /**
     * Пишет в консоль вывод системной ошибки
     * @param error Throwable объект-ошибка
     */
    public static void printSystemError(Throwable error) {
        System.out.println("[ERROR_0]: При выполнении кода произошла критическая ошибка \"%s\"".formatted(error.getClass()));
    }

    /**
     * Пишет в консоль сообщение об успешности теста
     */
    public static void printTaskSuccess() {
        System.out.println("[SUCCESS]: Real output equals waited output.");
    }

    /**
     * Пишет в консоль заголовок теста
     * @param testMethod Запись с вводными, ожидаемым ответом и описанием принципа решения в данном экземпляре теста
     */
    public static void printTestData(Method testMethod, Tests.TestDesc testDesc, String output) {
        System.out.printf("""
                        
                        ---TEST START: %s---
                        Input Data:
                        %s
                        
                        Answer Data:
                        %s
                        
                        Test explanation:
                        %s
                        
                        Real Output:
                        %s
                        """,
                testMethod.toString(), testDesc.input(), testDesc.answer(), testDesc.explanation(), output
        );
    }

    /**
     * Генерирует строку-линию шаблонного типа и длины
     *
     * @return Строка из символов LINE_SEGMENT длиной в LINE_LENGTH
     */
    private static String createLine() {
        return LINE_SEGMENT.repeat(LINE_LENGTH);
    }
}
