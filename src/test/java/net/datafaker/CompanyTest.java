package net.datafaker;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompanyTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.company().name()).matches("[A-Za-z\\-&', ]+");
    }

    @Test
    public void testSuffix() {
        assertThat(faker.company().suffix()).matches("[A-Za-z ]+");
    }

    @Test
    public void testIndustry() {
        assertThat(faker.company().industry()).matches("(\\w+([ ,&/-]{1,3})?){1,4}+");
    }

    @Test
    public void testBuzzword() {
        assertThat(faker.company().buzzword()).matches("(\\w+[ /-]?){1,3}");
    }

    @Test
    public void testCatchPhrase() {
        assertThat(faker.company().catchPhrase()).matches("(\\w+[ /-]?){1,9}");
    }

    @Test
    public void testBs() {
        assertThat(faker.company().bs()).matches("(\\w+[ /-]?){1,9}");
    }

    @Test
    public void testLogo() {
        assertThat(faker.company().logo()).matches("https://pigment.github.io/fake-logos/logos/medium/color/\\d+\\.png");
    }

    @Test
    public void testProfession() {
        assertThat(faker.company().profession()).matches("[a-z ]+");
    }

    @RepeatedTest(100)
    public void testUrl() {
        String regexp = "(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])";
        assertThat(faker.company().url()).matches(regexp);
    }
}
