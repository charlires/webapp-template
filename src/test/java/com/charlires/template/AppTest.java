package com.charlires.template;

import com.charlires.template.config.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class AppTest {

    @Test
    public void testFake1() throws Exception {

        Assert.assertTrue(true);

    }

    @Test
    public void testFake2() throws Exception {

        Assert.assertFalse(false);

    }
}
