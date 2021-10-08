/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author mfard
 */
public class Coffee {

    private boolean milk;
    private boolean sugar;
    private boolean chocolate;
    
    public Coffee(Builder builder){
        milk = builder.milk;
        sugar = builder.sugar;
        chocolate = builder.chocolate;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public boolean isChocolate() {
        return chocolate;
    }
    
    public void summary(){
        System.out.print(milk ? "Sütlü " : " ");
        System.out.print(sugar ? "Şekerli " : " ");
        System.out.println(chocolate ? "Çikolatalı " : " ");
    }

    public static final class Builder implements IFluentBuilder<Coffee>{
          private boolean milk;
          private boolean sugar;
          private boolean chocolate;

        public Builder setMilk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public Builder setSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder setChocolate(boolean chocolate) {
            this.chocolate = chocolate;
            return this;
        }

        @Override
        public Coffee build() {
           return new Coffee(this);
        }
    }
}
