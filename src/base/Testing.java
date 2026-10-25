package base;

import java.lang.reflect.Method;

/**
 * Сборщик тестов для заданной задачи в пакете task (Tests)
 */
public class Testing {

    public static void runAllTests() {
        task.Tests testInstance = new task.Tests(); // Поле для тестирования

        for(Method testMethod : task.Tests.class.getDeclaredMethods()) {
            try {
                if ((boolean) testMethod.invoke(testInstance))
                    Design.printTaskSuccess();
                else
                    Design.printTaskError();
            } catch (Throwable error) {
                Design.printSystemError(error);
            }
        }
    }
}
