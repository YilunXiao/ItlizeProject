package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProjectColumnTest {

    @Test
    void getId(){
        ProjectColumn PC1 = new ProjectColumn();
        Integer id = 9527;
        PC1.setId(id);
        assert(PC1.getId()).equals(9527);
    }

    @Test
    void getColumnName(){
        ProjectColumn PC1 = new ProjectColumn();
        String name = "ProjectName";
        PC1.setColumnName(name);
        assert(PC1.getColumnName()).equals(name);
    }

    @Test
    void getFormulaText(){
        ProjectColumn PC1 = new ProjectColumn();
        String formula = "IBM * weight";
        PC1.setFormulaText(formula);
        assert(PC1.getFormulaText()).equals(formula);
    }

    @Test
    void getProject(){
        ProjectColumn PC1 = new ProjectColumn();
        Project project101 = new Project();
        PC1.setProject(project101);
        assert(PC1.getProject()).equals(project101);
    }

    @Test
    void getResourceDetails(){
        ProjectColumn PC1 = new ProjectColumn();
        ResourceDetail detail101 = new ResourceDetail();
        ResourceDetail detail201 = new ResourceDetail();
        List<ResourceDetail> detailList = new ArrayList<ResourceDetail>();
        detailList.add(detail101);
        detailList.add(detail201);
        PC1.setResourceDetails(detailList);
        assert(PC1.getResourceDetails()).equals(detailList);
    }

    @Test
    void getType(){
        ProjectColumn PC1 = new ProjectColumn();
        PC1.setType(ProjectColumn.Type.Formula);
        assert(PC1.getType()).equals(ProjectColumn.Type.Formula);
        //System.out.println(ProjectColumn.Type.Text);
    }

}
