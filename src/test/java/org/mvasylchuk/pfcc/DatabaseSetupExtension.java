package org.mvasylchuk.pfcc;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class DatabaseSetupExtension implements BeforeEachCallback, BeforeAllCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        var flyway = SpringExtension.getApplicationContext(context).getBean(Flyway.class);
        flyway.clean();
        flyway.migrate();
    }

    @Override
    public void beforeAll(ExtensionContext context) {
        PfccMariadbContainer.container.start();
        updateDataSourceProps(PfccMariadbContainer.container);
    }

    private void updateDataSourceProps(PfccMariadbContainer container) {
        System.setProperty("spring.datasource.url", container.getJdbcUrl());
        System.setProperty("spring.datasource.username", container.getUsername());
        System.setProperty("spring.datasource.password", container.getPassword());
    }
}
