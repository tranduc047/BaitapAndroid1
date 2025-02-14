package com.example.bai1;

public class TinhToan {
    private int canh;


    public int tinhChuVi(){
        return canh*4;
    }
    public int tinhDienTich(){
        return (int) Math.pow(canh,2);
    }
    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
}
