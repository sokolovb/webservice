package shell;

import static org.junit.Assert.*;

public class ExecuteShellCommandTest {
    @org.junit.Test
    public void executeCommand() throws Exception {
        ExecuteShellCommand tester = new ExecuteShellCommand();

        assertEquals("echo test must return test",
                "test", tester.executeCommand("echo test"));
    }

}