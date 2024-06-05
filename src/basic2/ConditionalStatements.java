package basic2;

public class ConditionalStatements {
    public static void main(String[] args){
        // if else and there is if elseif too
        int bounty = 660;
        if(bounty > 1000){
            bounty = bounty + 600;
            System.out.println("you are a luffy so earn " + bounty);
        }else if(bounty > 500 && bounty<999){
            bounty = bounty + 200;
            System.out.println("you are a zoro so earn " + bounty);
        }else{
            System.out.println("you are a noob so earn this only " + bounty);
        }
    }
}
