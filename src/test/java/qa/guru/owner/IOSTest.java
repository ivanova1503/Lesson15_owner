package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.AndroidConfig;
import qa.guru.owner.config.IOSConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IOSTest {


    @Test
    public void testConfig() {
        IOSConfig config = ConfigFactory.create(IOSConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
        assertThat(config.deviceName()).isEqualTo("iPhone 13 Pro Max XML Bust Must Have");
    }


}
