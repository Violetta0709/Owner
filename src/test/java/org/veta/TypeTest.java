package org.veta;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.veta.config.Browser;
import org.veta.config.TypeConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class TypeTest {
    @Test
    public void testInteger() {
        System.getProperty("integer","10");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testDouble() {
        System.getProperty("double","10.10");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.10);
    }
    @Test
    public void testBoolean() {
        System.getProperty("boolean","true");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(true);
    }
    @Test
    public void testEnum() {
        System.getProperty("enum","CHROME");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.CHROME);
    }
}
