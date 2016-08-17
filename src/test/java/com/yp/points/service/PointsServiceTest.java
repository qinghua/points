package com.yp.points.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointsServiceTest {

    @Test
    public void should_get_points_for_rmzhang_when_the_initial_points_is_minus_1() {
        PointsService service = new PointsService();
        service.setPoints("rmzhang", -1);

        int points = service.getPoints("rmzhang");

        assertEquals(-1, points);
    }

    @Test
    public void should_get_points_for_rmzhang_when_the_initial_points_is_2() {
        PointsService service = new PointsService();
        service.setPoints("rmzhang", 2);

        int points = service.getPoints("rmzhang");

        assertEquals(2, points);
    }

    @Test
    public void should_get_the_correct_points_if_other_people_is_set_afterwards() {
        PointsService service = new PointsService();
        service.setPoints("ggg", 1);
        service.setPoints("rmzhang", 2);

        int points = service.getPoints("ggg");

        assertEquals(1, points);
    }

    @Test
    public void should_get_0_as_default_when_the_points_of_the_user_is_not_set () {
        PointsService service = new PointsService();

        int points = service.getPoints("ggg");

        assertEquals(0, points);
    }

    @Test
    public void should_get_10_points_after_a_session () {
        PointsService service = new PointsService();

        service.giveSession("ggg");

        assertEquals(10, service.getPoints("ggg"));
    }

}
