package regresTest.api.pojo.rq;

import lombok.Builder;

@Builder
public class CreateUserRq {
    public String name;
    public String job;
}
