package Day15;

import java.util.*;

public class EnumDemo {
		public enum WeekDay {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY ;
		}
		public static void main(String[] args) {
			EnumSet<WeekDay> weekdayset = EnumSet.range(WeekDay.MONDAY,WeekDay.FRIDAY);
			System.out.println("Using for each: Iterating EnumSet" );
			for(WeekDay weekday : weekdayset) {
				System.out.println("WeekDay :" + weekday);
			}
			System.out.println("********************************************");
			
			EnumSet<WeekDay> weekEndset = EnumSet.complementOf(weekdayset);
			System.out.println("Using Iterator: Iterating WeekEndSet" );
			Iterator<WeekDay> itr = weekEndset.iterator(); 
					while(itr.hasNext()) {
						System.out.println("WeekDay : " + itr.next());
					}
			System.out.println("*********************************************");
			System.out.println("Need to Work ?" +isWorkingDay(weekdayset, WeekDay.MONDAY));
			System.out.println("Need to Work ?" +isWorkingDay(weekdayset, WeekDay.SATURDAY));
			System.out.println("Need to Work ?" +isWorkingDay(weekdayset, WeekDay.SUNDAY));
			
		}
	private static boolean isWorkingDay(Set<WeekDay> daysSet, WeekDay day) {
		return daysSet.contains(day);
	}

}
