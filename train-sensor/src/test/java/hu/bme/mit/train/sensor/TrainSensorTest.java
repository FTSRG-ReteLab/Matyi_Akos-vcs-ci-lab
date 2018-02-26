package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    Tachograph tachograph;

    @Before
    public void before() {
        tachograph = new Tachograph();
        tachograph.addElement();
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Assert.assertEquals(1, tachograph.getCount());
    }
}
