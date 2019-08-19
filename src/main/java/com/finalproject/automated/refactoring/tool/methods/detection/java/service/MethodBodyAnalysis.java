package com.finalproject.automated.refactoring.tool.methods.detection.java.service;

import com.finalproject.automated.refactoring.tool.methods.detection.model.IndexModel;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface MethodBodyAnalysis {

    void analysis(@NonNull String content, @NonNull IndexModel indexModel,
                  @NonNull MethodModel methodModel);
}
