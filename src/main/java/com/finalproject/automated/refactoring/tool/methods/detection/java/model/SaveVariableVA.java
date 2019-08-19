package com.finalproject.automated.refactoring.tool.methods.detection.java.model;


import com.finalproject.automated.refactoring.tool.model.MethodModel;
import com.finalproject.automated.refactoring.tool.model.StatementModel;
import lombok.Builder;
import lombok.Data;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class SaveVariableVA {

    @Builder.Default
    private AtomicBoolean isClass = new AtomicBoolean();

    @Builder.Default
    private AtomicBoolean isFinal = new AtomicBoolean();

    private StatementModel statementModel;

    private MethodModel methodModel;
}
