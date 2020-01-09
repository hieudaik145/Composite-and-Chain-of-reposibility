package test.common;

public enum NumberOperatorEnum {

	EQ {

		@Override
		public boolean apply(int a, int b) {
			return a == b;
		}
	},
	NE {

		@Override
		public boolean apply(int a, int b) {
			return a != b;
		}
		
	},
	LT {

		@Override
		public boolean apply(int a, int b) {
			return a < b;
		}
	},
	GT {

		@Override
		public boolean apply(int a, int b) {
			return a > b;
		}
		
	},
	LE {

		@Override
		public boolean apply(int a, int b) {
			return a <= b;
		}
		
	},
	GE {

		@Override
		public boolean apply(int a, int b) {
			return a >= b;
		}
		
	}
	;
	public abstract boolean apply(int a, int b);
}
