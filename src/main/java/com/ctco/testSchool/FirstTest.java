package com.ctco.testSchool;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    @Test
    public void testSample() {
        Team myTeam = new Team();
        Member me = new Member();
        myTeam.addMember(me);
        Assert.assertEquals("By default my velocity is 1 per 10 days of sprint", 10.0, myTeam.getTeamVelocity(), 0.1);
    }
}
