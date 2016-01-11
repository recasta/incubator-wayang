package org.qcri.rheem.core;

import org.junit.Test;
import org.qcri.rheem.core.plan.test.TestSink;
import org.qcri.rheem.core.plan.test.TestSource;
import org.qcri.rheem.core.test.TestDataUnit;
import org.qcri.rheem.core.test.TestDataUnit2;
import org.qcri.rheem.core.types.DataSet;

/**
 * Test suite for {@link org.qcri.rheem.core.plan.Slot}s.
 */
public class SlotTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConnectMismatchingSlotFails() {
        TestSink<TestDataUnit> testSink = new TestSink<>(DataSet.flatAndBasic(TestDataUnit.class));
        TestSource<TestDataUnit2> testSource = new TestSource<>(DataSet.flatAndBasic(TestDataUnit2.class));
        testSource.connectTo(0, testSink, 0);
    }

    @Test
    public void testConnectMatchingSlots() {
        TestSink<TestDataUnit> testSink = new TestSink<>(DataSet.flatAndBasic(TestDataUnit.class));
        TestSource<TestDataUnit> testSource = new TestSource<>(DataSet.flatAndBasic(TestDataUnit.class));
        testSource.connectTo(0, testSink, 0);
    }
}
