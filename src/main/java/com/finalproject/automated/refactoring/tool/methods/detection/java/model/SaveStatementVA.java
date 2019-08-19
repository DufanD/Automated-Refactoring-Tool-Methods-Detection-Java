package com.finalproject.automated.refactoring.tool.methods.detection.java.model;

import com.finalproject.automated.refactoring.tool.model.StatementModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Stack;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class SaveStatementVA {

    private String body;

    @Builder.Default
    private Stack<List<StatementModel>> statements = new Stack<>();

    private Character character;

    private Character nextCharacter;

    private Integer index;

    private Integer iterationIndex;

    private Integer startStatementIndex;

    private Integer endStatementIndex;

    private Boolean isOneLineComments;

    private Boolean isMultiLineComments;
}
