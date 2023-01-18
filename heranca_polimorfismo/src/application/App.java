package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import entities.Reservation;

public class App {

	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");
		
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("check-out date (dd/MM/yyyy");
		Date checkOut = sdf.parse(sc.next());
		sc.close();
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: check-out date must be after check-in date");
		}else {
			Reservation reservation = new Reservation(number,checkIn,checkOut);
			System.out.println(("Reservation: " + reservation));
			
			System.out.println();
			System.out.println("Check-in date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("check-out date (dd/MM/yyyy");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now)|| checkOut.before(now)) {
				System.out.println("Error in reservation");
			}else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: check-out date must be after check-in date");
			}else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);	
			}
		}
	}
}
