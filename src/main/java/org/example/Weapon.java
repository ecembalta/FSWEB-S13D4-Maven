package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    AXE(60, 1.0),
    BOW(30, 1.8);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }
}
