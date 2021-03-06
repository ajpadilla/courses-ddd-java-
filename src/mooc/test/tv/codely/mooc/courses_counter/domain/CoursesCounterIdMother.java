package tv.codely.mooc.courses_counter.domain;

import tv.codely.shared.domain.UuidMother;
import tv.codely.shared.domain.WordMother;

public final class CoursesCounterIdMother {
    public static CoursesCounterId create(String value) {
        return new CoursesCounterId(value);
    }

    public static CoursesCounterId random() {
        return create(UuidMother.random());
    }
}
