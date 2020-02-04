package com.company;
public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Software() {
        super();
        this.programmer="Mark";
        this.platform="Linux";
        this.os="Mac";
    }

    @Override
    public String toString() {
        return "Programmer :" + programmer +
                "Platform :" + platform +
                "Os :" + os;
    }
}

