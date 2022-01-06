package com.amaze.filemanager;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.widget.TextView;

public class MyAdditionTest {
    Viewer viewer = new Viewer();

    @Test
    public void testAdd(){
        assertEquals(viewer.cnt, 1);
    }
}
