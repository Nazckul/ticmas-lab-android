package com.example.myarg

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule

    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @Test
    fun mainActivity_compareButton(){

        Espresso.onView(
            ViewMatchers.withId(R.id.button3)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.textView3)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("Resultado: Los textos son iguales.")
            )
        )
    }}