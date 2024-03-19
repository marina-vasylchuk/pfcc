package org.mvasylchuk.pfcc.domain.repository;

import org.assertj.core.api.Assertions;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.jupiter.api.Test;
import org.mvasylchuk.pfcc.IntegrationTest;
import org.mvasylchuk.pfcc.common.dto.Page;
import org.mvasylchuk.pfcc.domain.dto.FoodDto;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
class FoodJooqRepositoryTest {
    @Autowired
    FoodJooqRepository repository;

    @Test
    @FlywayTest(locationsForMigrate = "migration/FoodJooqRepositoryTest")
    void getFoodList() {
        Page<FoodDto> result = repository.getFoodList(0,2,null,null,1L);
        Assertions.assertThat(result.getTotalPages()).isEqualTo(2);
        Assertions.assertThat(result.getTotalElements()).isEqualTo(3);
    }

}
