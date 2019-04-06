package com.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.util.StringHelper;

/**
 * CustomGeneratorFacade
 * @author Wang926454
 * @date 2019/4/6 19:36
 */
public class CustomGeneratorFacade extends GeneratorFacade {

    public CustomGeneratorFacade(String outRootDir) {
        if (StringHelper.isNotBlank(outRootDir)) {
            super.getGenerator().setOutRootDir(outRootDir);
        }
    }

}
