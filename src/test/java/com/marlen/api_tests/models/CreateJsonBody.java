package com.marlen.api_tests.models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CreateJsonBody {

    private final Booking booking = new Booking();
    private final BookingDates bookingDates = new BookingDates();
    private final CreateAuth createAuth = new CreateAuth();

    public Booking getPostBody() {
        booking.setFirstname("Marcello");
        booking.setLastname("Mastroianni");
        booking.setTotalprice(200);
        booking.setDepositpaid(true);
        bookingDates.setCheckin(LocalDate.of(2022, 4, 16).toString());
        bookingDates.setCheckout(LocalDate.of(2022, 4, 22).toString());
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");
        return booking;
    }

    public Booking getUpdateBody() {
        booking.setFirstname("Federico");
        booking.setLastname("Fellini");
        booking.setTotalprice(300);
        booking.setDepositpaid(true);
        bookingDates.setCheckin(LocalDate.of(2022, 4, 16).toString());
        bookingDates.setCheckout(LocalDate.of(2022, 4, 22).toString());
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Dinner");
        return booking;
    }

    public CreateAuth getAuth() {
        createAuth.setUsername("admin");
        createAuth.setPassword("password123");
        return createAuth;
    }
}
