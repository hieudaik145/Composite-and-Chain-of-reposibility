package test.common.support;

public enum DateTimeFormat {
	
	YYMMDD("yyMMdd")
    ,YYYYMMDD("yyyyMMdd")
    ,SLASH_YYYYMMDD("yyyy/MM/dd")
    ,SLASH_YYMMDD("yy/MM/dd")
    ,YYYY_MM_DD("yyyy-MM-dd")
    ,HHMM("HHmm")
    ,YYYYMMDDHHMM("yyyyMMddHHmm")
    ,YYYYMMDDHHMMSS("yyyyMMddHHmmss")
    ,YYYY_MM_DD_HH24_MM_SS("yyyy-MM-dd HH:mm:ss")
    ,SLASH_YYYY_MM_DD_HH24_MM_SS("yyyy/MM/dd HH:mm:ss")
    ,YYYYMM("yyyyMM")
    ,HH24_MM_SS("HH:mm:ss")
    ,YYYYMM_JP("yyyy年MM月")
    ,DDMMYY("ddMMyy")
    ,DDMMYYYY("ddMMyyyy")
    ,SLASH_DDMMYYYY("dd/MM/yyyy")
    ,SLASH_DDMMYY("dd/MM/yy")
    ,dd_mm_yy("dd-MM-yy")
    ;

	private final String value;
	
	private DateTimeFormat(String value) {
        this.value = value;
    }

	public String getValue() {
		return value;
	}
	
}
