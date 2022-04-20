package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.templatemethod.DBDataProcessor;
import com.endyary.patterns.behavioral.templatemethod.DataProcessor;
import com.endyary.patterns.behavioral.templatemethod.FileDataProcessor;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    void dataProcessorTemplateTest() {
        DataProcessor fileProcessor = new FileDataProcessor();
        DataProcessor dbProcessor = new DBDataProcessor();

        fileProcessor.process();
        dbProcessor.process();
    }
}
