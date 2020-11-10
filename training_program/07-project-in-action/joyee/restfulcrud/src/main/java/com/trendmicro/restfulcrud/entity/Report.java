package com.trendmicro.restfulcrud.entity;

public class Report {
    private Integer id;
    private String projectname;
    private Integer testcasenum;
    private Integer reportnum;
    private String createdate;
    private String owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Integer getTestcasenum() {
        return testcasenum;
    }

    public void setTestcasenum(Integer testcasenum) {
        this.testcasenum = testcasenum;
    }

    public Integer getReportnum() {
        return reportnum;
    }

    public void setReportnum(Integer reportnum) {
        this.reportnum = reportnum;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
