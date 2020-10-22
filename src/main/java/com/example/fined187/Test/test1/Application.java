package com.example.fined187.Test.test1;

import com.example.fined187.Test.test1.bread.Bread;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception {

        List<Bread> breads = new ArrayList<>();
        String jsonStr = FileReader.getResource("json/bread.json");
        JSONArray jsonArray = new JSONArray(jsonStr);

        for (int i=0; i<jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            String breadType = jsonObject.getString("breadType");
            JSONObject recipe = jsonObject.getJSONObject("recipe");

            Bread bread = BreadFactory.create(breadType,
                    recipe.getInt("flour"),
                    recipe.getInt("water"),
                    recipe.getInt(breadType));

            breads.add(bread);
        }

        breads.forEach(System.out::println);

    }
}
