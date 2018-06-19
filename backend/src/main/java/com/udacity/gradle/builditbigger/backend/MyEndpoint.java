package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.example.android.jokelibrary.JokeLibrary;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    private JokeLibrary jokeLibrary;

    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke() {
        if (jokeLibrary == null) {
            jokeLibrary = new JokeLibrary();
        }
        String joke = jokeLibrary.returnJoke();

        MyBean response = new MyBean();
        response.setData(joke);

        return response;
    }

}
