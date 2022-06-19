/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.persistence.derby;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.apache.derby.jdbc.EmbeddedConnectionPoolDataSource;
import org.apache.derby.jdbc.EmbeddedDataSource;
import org.apache.derby.jdbc.EmbeddedDriver;
import org.apache.derby.jdbc.EmbeddedXADataSource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.jdbc.DataSourceFactory;

/**
 * 
 * @author mark
 * @since 16.04.2022
 */
@Component(immediate = true, configurationPid = "org.gecko.datasource", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class JDBCProvider implements DataSourceFactory {
	
	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.jdbc.DataSourceFactory#createDataSource(java.util.Properties)
	 */
	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		EmbeddedDataSource eds = new EmbeddedDataSource();
		String database = props.getProperty(JDBC_DATABASE_NAME);
		if (database != null) {
			eds.setDatabaseName(database);
		}
		String name = props.getProperty(JDBC_DATASOURCE_NAME);
		if (name != null) {
			eds.setDataSourceName(name);
		}
		return eds;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.jdbc.DataSourceFactory#createConnectionPoolDataSource(java.util.Properties)
	 */
	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {
		EmbeddedConnectionPoolDataSource ecpds = new EmbeddedConnectionPoolDataSource();
		String database = props.getProperty(JDBC_DATABASE_NAME);
		if (database != null) {
			ecpds.setDatabaseName(database);
		}
		String name = props.getProperty(JDBC_DATASOURCE_NAME);
		if (name != null) {
			ecpds.setDataSourceName(name);
		}
		return ecpds;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.jdbc.DataSourceFactory#createXADataSource(java.util.Properties)
	 */
	@Override
	public XADataSource createXADataSource(Properties props) throws SQLException {
		EmbeddedXADataSource exads = new EmbeddedXADataSource();
		String database = props.getProperty(JDBC_DATABASE_NAME);
		if (database != null) {
			exads.setDatabaseName(database);
		}
		String name = props.getProperty(JDBC_DATASOURCE_NAME);
		if (name != null) {
			exads.setDataSourceName(name);
		}
		return exads;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.jdbc.DataSourceFactory#createDriver(java.util.Properties)
	 */
	@Override
	public Driver createDriver(Properties props) throws SQLException {
		return new EmbeddedDriver();
	}

}
