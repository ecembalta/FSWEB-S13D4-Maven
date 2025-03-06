package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.weapon = weapon;

        if(healthPercentage>100){
            this.healthPercentage = 100;
        }else if(healthPercentage<0){
            this.healthPercentage = 0;
        }else{
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;
        if(healthPercentage <= 0){
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

   public void  restoreHealth(int healthPotion){
        healthPercentage += healthPotion;
        if (healthPercentage>100){
            healthPercentage = 100;
        }
   }

    public void printWeaponStats() {
        System.out.println(name + " is using " + weapon);
        System.out.println("Damage: " + weapon.getDamage());
        System.out.println("Attack Speed: " + weapon.getAttackSpeed());
    }

}
