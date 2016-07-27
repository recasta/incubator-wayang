package org.qcri.rheem.postgres.operators;

import org.qcri.rheem.basic.operators.TableSource;
import org.qcri.rheem.core.platform.ChannelDescriptor;
import org.qcri.rheem.jdbc.operators.JdbcTableSource;

import java.util.List;

/**
 * PostgreSQL implementation for the {@link TableSource}.
 */
public class PostgresTableSource extends JdbcTableSource implements PostgresExecutionOperator {

    public PostgresTableSource(String tableName) {
        super(tableName);
    }

    /**
     * Copies an instance (exclusive of broadcasts).
     *
     * @param that that should be copied
     */
    public PostgresTableSource(JdbcTableSource that) {
        super(that);
    }

    @Override
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        throw new UnsupportedOperationException("This operator has no input channels.");
    }
}
