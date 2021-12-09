package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.Browser;
import qa.guru.owner.config.TypesConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TypeConfig {

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testDouble() {
        System.setProperty("double", "10.10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.10);
    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "true");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(true);
    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "FIREFOX");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX);
    }
}
