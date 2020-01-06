package com.lucasantarella.chapter5.homework;

public class DieAndCoin {

    private Die die;

    private Coin coin;

    public DieAndCoin() {
        this.die = new Die();
        this.coin = new Coin();
    }

    public DieAndCoin(Die die, Coin coin) {
        this.die = die;
        this.coin = coin;
    }

    public Die getDie() {
        return die;
    }

    public void setDie(Die die) {
        this.die = die;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return String.format("%d, %s", this.die.getFaceValue(), this.coin.toString().toUpperCase());
    }

    /**
     * Rolls the die and flips the coin.
     */
    public void play() {
        this.coin.flip();
        this.die.roll();
    }

    /**
     * Determine if a winning play has been made.
     *
     * @return Returns true if the face value of the die is even and the face of the coin is TAILS and false, otherwise.
     */
    public boolean win() {
        return (this.die.getFaceValue() % 2 == 0) && !this.coin.isHeads();
    }

}
