package javaOOP.tinhtruutuong;

abstract class Person {
    protected String ten;
    protected int tuoi;
    protected String cmnd;

    abstract public void showInfor();  //Hiển thị thông tin của một người cơ bản
    abstract public String getTen();
    abstract public String getCmnd();
    abstract public int getTuoi();
    abstract public String getGioiTinh();
    abstract public String getTrinhDo();
}
