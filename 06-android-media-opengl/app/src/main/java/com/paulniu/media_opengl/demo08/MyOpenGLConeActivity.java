package com.paulniu.media_opengl.demo08;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Coder: niupuyue
 * Date: 2019/8/30
 * Time: 10:12
 * Desc:
 * Version:
 */
public class MyOpenGLConeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyOpenGLSurfaceViewCone(this));
    }
}
