package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.util.Log;
import android.util.Pair;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;

/**
 * Created by jordanhaynes on 6/2/18.
 */
public class EndpointsAsyncTaskTest {
    private static final String TAG = "EndpointsAsyncTaskTest";

    @Test
    public void testDoInBackground() throws Exception {
        try {
            MainActivity mainActivity = new MainActivity();
            EndpointsAsyncTask task = new EndpointsAsyncTask();

            task.execute(new Pair<Context, String>(mainActivity, "Manfred"));

            String returnValue = task.get(30, TimeUnit.SECONDS);
            assertTrue(returnValue.length() > 0);
        } catch (Exception e) {
            Log.e(TAG, "Test timed out");
        }
    }
}