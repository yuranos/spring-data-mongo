package com.yuranos.session;

import com.yuranos.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
public class SessionCleanUpSchedulerJobTest {

    @Autowired
    private SessionCleanUpSchedulerJob underTest;

    @Test
    public void onCall() throws Exception {
        underTest.onCall();
    }

}
