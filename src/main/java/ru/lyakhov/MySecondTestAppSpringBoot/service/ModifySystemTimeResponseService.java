package ru.lyakhov.MySecondTestAppSpringBoot.service;

import ru.lyakhov.MySecondTestAppSpringBoot.model.Response;
import ru.lyakhov.MySecondTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}
