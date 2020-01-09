package test.common;

import java.time.LocalDateTime;

public enum DateOperatorEnum {
	
	EQ {

		@Override
		public boolean apply(LocalDateTime timeA, LocalDateTime timeB) {
			return timeA.isEqual(timeB);
		}

	},
	NE {

		@Override
		public boolean apply(LocalDateTime timeA, LocalDateTime timeB) {
			return timeA.isEqual(timeB);
		}

		
	},
	LT {

		@Override
		public boolean apply(LocalDateTime timeA, LocalDateTime timeB) {
			return timeA.isBefore(timeB);
		}
	},
	GT {

		@Override
		public boolean apply(LocalDateTime timeA, LocalDateTime timeB) {
			return timeA.isAfter(timeB);
		}
		
	},
	LE {

		@Override
		public boolean apply(LocalDateTime timeA, LocalDateTime timeB) {
			return (timeA.isBefore(timeB) || timeA.isEqual(timeB)) ? true : false;
		}
	},
	GE {

		@Override
		public boolean apply(LocalDateTime timeA, LocalDateTime timeB) {
			return (timeA.isAfter(timeB) || timeA.isEqual(timeB)) ? true : false;
		}
		
	}
	;

	public abstract boolean apply(LocalDateTime timeA, LocalDateTime timeB);
}
