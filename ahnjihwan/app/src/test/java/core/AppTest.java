/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        assertThat(classUnderTest.getGreeting()).isEqualTo("Hello World!");
    }
}
