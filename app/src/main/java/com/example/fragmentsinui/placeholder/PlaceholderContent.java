package com.example.fragmentsinui.placeholder;

import com.example.fragmentsinui.ItemDetailFragment;
import com.example.fragmentsinui.Months;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaceholderContent {
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();
    private static final int COUNT = 12;
    public static final List<Months> months = new ArrayList<Months>();

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    static {
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceholderItem(i));
        }
    }

    private static void setInitialData(){
        months.clear();
        months.add(new Months (1, "January", 31));
        months.add(new Months (2, "February", 28));
        months.add(new Months (3, "March", 31));
        months.add(new Months (4,  "April", 30));
        months.add(new Months (5, "May", 31));
        months.add(new Months (6, "June", 30));
        months.add(new Months (7, "July", 31));
        months.add(new Months (8, "August", 31));
        months.add(new Months (9, "September", 30));
        months.add(new Months (10, "October", 31));
        months.add(new Months (11, "November", 30));
        months.add(new Months (12, "December", 31));
    }

    private static PlaceholderItem createPlaceholderItem(int position) {
        setInitialData();
        PlaceholderItem placeholderItem = new PlaceholderItem(String.valueOf(position), months.get(position-1).getMonth(), makeDetails(position));
        return placeholderItem;
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Days: ").append(months.get(position-1).getCountOfDays());
        return builder.toString();
    }

    public static class PlaceholderItem {
        public final String id;
        public final String content;
        public final String details;

        public PlaceholderItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}