package ru.lyakhov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.lyakhov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
