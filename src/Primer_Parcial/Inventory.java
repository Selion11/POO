package Primer_Parcial;

import java.util.Arrays;
import java.util.Comparator;

public class Inventory {
    private Item[] items;

    public Inventory(Item[] items) {
        this.items = items;
    }

    public Item[] getItems(){
        return getItems(Comparator.naturalOrder());
    }

    public Item[] getItems(Comparator<Item> comparator){
        Item[] ans = Arrays.copyOf(items,items.length);
        Arrays.sort(ans,comparator);
        return ans;
    }
}
