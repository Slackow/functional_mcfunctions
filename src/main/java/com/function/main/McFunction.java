package com.function.main;

import java.util.List;

public interface McFunction {
    List<Lambda> getLambdas();
    void addLambda(Lambda lambda);
    String getDirectory();
    void parse();
    void save();
}
