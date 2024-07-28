package com.abhis.Hotel_project.service.interfac;

import com.abhis.Hotel_project.dto.Response;
import com.abhis.Hotel_project.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
