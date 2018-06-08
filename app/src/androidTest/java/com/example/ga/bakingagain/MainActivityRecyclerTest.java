package com.example.ga.bakingagain;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.espresso.contrib.RecyclerViewActions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;

@RunWith(AndroidJUnit4.class)
public class MainActivityRecyclerTest {
    public static final String DISH_NAME = "Nutella Pie";
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void clickGridViewItem_OpensOrderActivity() {
        Espresso.onView(ViewMatchers.withId(R.id.DishR)).perform(RecyclerViewActions)


    }
}
