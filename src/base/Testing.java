package base;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Сборщик тестов для заданной задачи в пакете task (Tests)
 */
public class Testing {

    public static void runAllTests() {
        ArrayList<String> testLogs = new ArrayList<>();
        task.Tests testInstance = new task.Tests(); // Поле для тестирования


        for(Method testMethod : task.Tests.class.getDeclaredMethods()) {
            LocalTime time = LocalTime.now();
            try {
                if ((boolean) testMethod.invoke(testInstance)) {
                    Design.printTaskSuccess();
                    testLogs.add("[SUCCESS]: "+ testMethod.getName() + " (" + (Duration.between(time, LocalTime.now()).toNanos() / 1_000_000.0) + " ms)");
                } else {
                    Design.printTaskError();
                    testLogs.add("[ERROR_1]: " + testMethod.getName());
                }
            } catch (Throwable error) {
                Design.printSystemError(error);
                testLogs.add("[ERROR_0]: " + testMethod.getName());
            }
        }

        System.out.println();
        System.out.println("Total:");
        for (String testLog : testLogs) {
            System.out.println(testLog);
        }
    }
}
