package tr.mhu.core.domain.enums;

/**
 * @author muludag on 29.03.2020
 */
public enum EErrorCodeAndMessage {
	SUCCESS("0", "SUCCESS-0"),
	FAIL("0001", "FAIL-1"),
	ERROR_GENERAL("0002", "ERROR-GENERAL-2"),
	ERROR_HANDLE("0003", "ERROR-HANDLE-3");
	private String errorCode;
	private String errorMessage;

	EErrorCodeAndMessage(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
