package com.ramazansakin.designpatterns;

class Creature2
{
  public int attack, health;

  public Creature2(int attack, int health)
  {
    this.attack = attack;
    this.health = health;
  }
}

abstract class CardGame
{
  public Creature2 [] creatures;

  public CardGame(Creature2[] creatures)
  {
    this.creatures = creatures;
  }

  // return s-1 if no clear winner (both alive or both dead)
  public int combat(int creature1, int creature2)
  {
    Creature2 first = creatures[creature1];
    Creature2 second = creatures[creature2];
    hit(first, second);
    hit(second, first);
    boolean firstAlive = first.health > 0;
    boolean secondAlive = second.health > 0;
    if (firstAlive == secondAlive) return -1;
    return firstAlive ? creature1 : creature2;
  }

  // attacker hits other creature
  protected abstract void hit(Creature2 attacker, Creature2 other);
}

class TemporaryCardDamageGame extends CardGame
{
  public TemporaryCardDamageGame(Creature2[] creatures)
  {
    super(creatures);
  }

  @Override
  protected void hit(Creature2 attacker, Creature2 other)
  {
    int oldHealth = other.health;
    other.health -= attacker.attack;
    if (other.health > 0)
      other.health = oldHealth;
  }
}

class PermanentCardDamageGame extends CardGame
{
  public PermanentCardDamageGame(Creature2[] creatures)
  {
    super(creatures);
  }

  @Override
  protected void hit(Creature2 attacker, Creature2 other)
  {
    other.health -= attacker.attack;
  }
}