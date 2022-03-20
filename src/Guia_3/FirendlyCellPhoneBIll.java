package Guia_3;

public class FirendlyCellPhoneBIll extends CellPhoneBill{

    private String[] friends;
    private double cost;
    private int index;
    private int max;

    private static final int COST_OF_FRIEND_CALL_PER_SECOND = 0;

    FirendlyCellPhoneBIll(String number,int max){
        super(number);

        this.friends = new String[max];
        this.max = max;
        this.cost = COST_OF_FRIEND_CALL_PER_SECOND;

    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void addFriend(String num){
        if(index < max && !isFriendly(num)){
            friends[index++] = num;
        }
    }

    private boolean isFriendly(String num){
        int i;
        for(i = 0;i < index;i++){
            if(friends[i].compareTo(num) == 0){
                return true;
            }
        }
        return false;
    }

    private void removeFriend(String num){
        boolean removed = false;
        for(int i = 0; i < index  && !removed; i++) {
            if(friends[i].compareTo(num) == 0) {
                friends[i] = friends[--index];
                removed = true;
            }
        }
    }

    @Override
    public double processBill(){
        double total = 0;
        for(int i = 0; i < callsIndex; i++) {
            boolean isFreind = false;
            for(int j = 0; j < index && !isFreind;j++){
                if (calls[i].getTo().compareTo(friends[j]) == 0) {
                    isFreind = true;
                }
            }
            total += isFreind ? calls[i].getCost() * cost: calls[i].getCost();
        }
        return total;
    }
}
