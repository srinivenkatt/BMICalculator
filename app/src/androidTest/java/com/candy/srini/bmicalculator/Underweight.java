package com.candy.srini.bmicalculator;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Underweight {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void underweightTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.field_weight), isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.field_weight), isDisplayed()));
        appCompatEditText2.perform(replaceText("40"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.field_height), isDisplayed()));
        appCompatEditText3.perform(replaceText("1.72"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.field_height), withText("1.72"), isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button_calc), withText("Calculate"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction result = onView(
                allOf(withId(R.id.view_result), withText("13.520822065981614"), isDisplayed()));
        result.perform(click());

        ViewInteraction message = onView(
                allOf(withId(R.id.view_msg), withText("Underweight !!"), isDisplayed()));
        message.perform(click());
    }

}
