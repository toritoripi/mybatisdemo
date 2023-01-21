package com.dai8kadai.mybatisdemo;

import java.util.List;

public interface NameService {

    List<Name> findAll();
    Name findById(int id) throws Exception;
}
