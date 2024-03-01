package BoxingGame;
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    public Fighter(String name,int damage,int health,int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge < 0 || dodge >=100){
            this.dodge = 0;
        }else{
            this.dodge = dodge;
        }
    }
    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        int num = (int)(Math.random()*100);
        if(num < this.dodge){
            return true;
        }else{
            return false;
        }
    }
}
