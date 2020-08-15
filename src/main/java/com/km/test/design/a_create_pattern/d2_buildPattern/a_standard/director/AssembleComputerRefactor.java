package com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.director;

import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.build.ComputerBuild;
import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product.Computer;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:56
 */
public class AssembleComputerRefactor {
    private ComputerBuild computerBuild;

    public AssembleComputerRefactor(ComputerBuild computerBuild){
        this.computerBuild = computerBuild;
    }

    public Computer getComputer(){
        computerBuild.assembleMainBoard();
        computerBuild.assembleDisplayDevice();
        return computerBuild.createComputer();
    }

}
