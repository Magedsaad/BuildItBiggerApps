package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

public class JokeAsyncTaskTest extends ApplicationTestCase<Application> {
    public JokeAsyncTaskTest() {
        super(Application.class);
    }

    public void testFetchJokeTask() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask connectedTest = new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onDone(String result) {}
        });
        connectedTest.execute();
        String jokess = connectedTest.get();
        assertNotNull(jokess);
    }
}
