package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import java.util.concurrent.TimeUnit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends AndroidTestCase {

    public void testAsyncGetFreeJoke() {


        try {
            MainActivity.EndpointsAsyncTask jokeTask = new MainActivity().new EndpointsAsyncTask();
            jokeTask.execute(new Pair<Context, String>(getContext(), "free"));
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
            assertFalse(joke.isEmpty());

        } catch (Exception e){
            fail("Timed out");
        }

    }

    public void testAsyncGetPaidJoke() {

        try {
            MainActivity.EndpointsAsyncTask jokeTask = new MainActivity().new EndpointsAsyncTask();
            jokeTask.execute(new Pair<Context, String>(getContext(), "paid"));
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
            assertFalse(joke.isEmpty());

        } catch (Exception e){
            fail("Timed out");
        }

    }


}