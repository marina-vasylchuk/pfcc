package org.mvasylchuk.pfcc.domain.repository;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DishJooqRepository {
    private final DSLContext ctx;
}
