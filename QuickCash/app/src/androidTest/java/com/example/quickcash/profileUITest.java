package com.example.quickcash;

import androidx.test.core.app.ActivityScenario;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Before;
import org.junit.Test;

import com.example.quickcash.ui.profile.EmployerProfile;
import com.example.quickcash.util.AppConstants;


public class profileUITest {

    ActivityScenario<EmployerProfile> activityScenario;

    @Before
    public void setUp(){



        activityScenario = ActivityScenario.launch(EmployerProfile.class);
        activityScenario.onActivity(activity -> {

        });
    }
    @Test
    public void testValidIndustry1() {
        onView(withId(R.id.industryTypeTitle)).perform(typeText(AppConstants.VALID_INDUSTRIES[0]));
        onView(withId(R.id.industryTypeTitle)).check(matches(withText(AppConstants.VALID_INDUSTRIES[0])));
    }

    @Test
    public void testValidLicenseNum(){
        onView(withId(R.id.idNumTitle)).perform(typeText(AppConstants.VALID_ID));
        onView(withId(R.id.idNumTitle)).check(matches(withText(AppConstants.VALID_ID)));
    }
    @Test
    public void testHiringStatus(){
        onView(withId(R.id.hiringStatusTitle)).perform(typeText(AppConstants.HIRING_STATUS));
        onView(withId(R.id.hiringStatusTitle)).check(matches(withText(AppConstants.HIRING_STATUS)));
    }
    @Test
    public void testValidPhoneNum(){
        onView(withId(R.id.phoneNumTitle)).perform(typeText(AppConstants.PHONE_NO));
        onView(withId(R.id.phoneNumTitle)).check(matches(withText(AppConstants.PHONE_NO)));
    }
}