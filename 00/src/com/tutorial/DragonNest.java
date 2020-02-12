package com.tutorial;

// npx prettier java "**/*.java"

class Player {
  String name;
  int level;
  long battlePoint;
  long healthPoint;

  // object member supaya bisa diakses
  Weapon weapon;
  Armor armor;

  Player(String name, int level, long healthPoint, long battlePoint) {
    this.name = name;
    this.level = level;
    this.healthPoint = healthPoint;
    this.battlePoint = battlePoint;
  }

  // untuk bind player dengan class lain seperti weapon, armor dll

  void equipWeapon(Weapon weapon) {
    this.weapon = weapon;
  }
  void equipArmor(Armor armor) {
    this.armor = armor;
  }
  void display(){
    System.out.println("Nickname : " + this.name);
    System.out.println("HP : " + this.healthPoint);
    System.out.println("BP : " + this.battlePoint);
    this.weapon.display();
    this.armor.display();
    System.out.println("\n");
  }

  void attack(Player enemy){
    double attackPower = this.weapon.attackPower;
    // berapa demagenya:
    System.out.println(this.name + " attacking " + enemy.name + " with demage " + attackPower);
    enemy.attacked(attackPower);
  }
  void attacked(double attackPower){
    double demage;
    
    if (this.armor.defensePower < attackPower){
      demage = attackPower - this.armor.defensePower;
    }
    else{
      demage = 1;
    }

    // pengurangan darahnya
    this.healthPoint -= demage;
    System.out.println(this.name + " gets demage " + demage + ", Current HP: " + this.healthPoint);
  }
}

class Weapon {
  String name;
  double attackPower;

  // constructor
  Weapon(String name, double attackPower) {
    this.name = name;
    this.attackPower = attackPower;
  }

  void display() {
    System.out.println( "Weapon : " + this.name + " -> Att. Power : " + this.attackPower );
  }
}

class Armor {
  String name;
  double defensePower;

  // constructor
  Armor(String name, double defensePower) {
    this.name = name;
    this.defensePower = defensePower;
  }

  void display() {
    System.out.println("Armor : " + this.name + " -> Deff. Power: " + this.defensePower );
  }
}

public class DragonNest {

  public static void main(String[] args) {

    // buat object player baru
    Player player1 = new Player("Gnome", 1, 100, 1000);
    Player player2 = new Player("hhhhx", 1, 110, 1000);

    // object weapon
    Weapon sword = new Weapon("sword", 120);
    Weapon mace = new Weapon("mace", 100);
    //object armor
    Armor shirt = new Armor("shirt", 50);
    Armor armor = new Armor("armor", 70);

    // equip weapon dan armor player 1
    player1.equipWeapon(sword);
    player1.equipArmor(shirt);
    player1.display();

    //player 2
    player2.equipWeapon(mace);
    player2.equipArmor(armor);
    player2.display();


    //sparring gnome vs hhhx
    System.out.println("\t\tSPARRING " + player1.name + " VS " + player2.name);
    System.out.println("---------------------------------------------------\n");
    System.out.println("EPISODE 1:\n");
    player1.attack(player2);    
    System.out.println("EPISODE 2:\n");
    player2.attack(player1);
    System.out.println("EPISODE 3:\n");
    player1.attack(player2);    
    System.out.println("EPISODE 4:\n");
    player2.attack(player1);

  }
}
