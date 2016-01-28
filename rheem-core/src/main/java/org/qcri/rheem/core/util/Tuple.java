package org.qcri.rheem.core.util;

import java.util.Objects;

/**
 * A helper data structure to manage two values without creating new classes.
 */
public class Tuple<T0, T1> {

    public T0 field0;

    public T1 field1;

    public Tuple() { }

    public Tuple(T0 field0, T1 field1) {
        this.field0 = field0;
        this.field1 = field1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(field0, tuple.field0) &&
                Objects.equals(field1, tuple.field1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field0, field1);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", this.field0, this.field1);
    }
}
