package Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeCoversion {
	public static String flightEndDateValidator(String endDate, String seasonEndDate) {
		String eDate = endDate;

		// Flight End Date.
		DateTimeFormatter fParse1 = DateTimeFormatter.ofPattern("ddMMMyy", Locale.US);
		LocalDate flightEDate = LocalDate.parse(eDate, fParse1);
		// System.out.println(date1);

		// Season End Date.
		String[] seasonEndDateArr = seasonEndDate.split("/");
		DateTimeFormatter fParse2;

		//Conditions for respective date fprmats
		if (seasonEndDateArr[0].length() == 1 && seasonEndDateArr[1].length() == 1) {
			fParse2 = DateTimeFormatter.ofPattern("d/M/yyyy", Locale.US);
		} else if (seasonEndDateArr[0].length() == 1 && seasonEndDateArr[1].length() == 2) {
			fParse2 = DateTimeFormatter.ofPattern("d/MM/yyyy", Locale.US);
		} else if (seasonEndDateArr[0].length() == 2 && seasonEndDateArr[1].length() == 1) {
			fParse2 = DateTimeFormatter.ofPattern("dd/M/yyyy", Locale.US);
		} else {
			fParse2 = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
		}

		LocalDate seasonEDate = LocalDate.parse(seasonEndDate, fParse2);
		// System.out.println(date2);

		if (seasonEDate.compareTo(flightEDate) < 0) {
			LocalDate updFlightEndDate = LocalDate.parse(seasonEDate + "");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMYY");
			eDate = formatter.format(updFlightEndDate).toString();
			// System.out.println(eDate);
		}

		return eDate;
	}

}
