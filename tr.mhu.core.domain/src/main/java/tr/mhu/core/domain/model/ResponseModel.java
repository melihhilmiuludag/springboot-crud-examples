package tr.mhu.core.domain.model;

import lombok.Data;
import tr.mhu.core.domain.entites.Hi;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

/**
 * @author muludag on 5.01.2020
 */
@Data
public class ResponseModel {

	private String errorMessage;
	private String errorCode;
	private String message;
	private boolean isSuccess;
	private Transient T;
	private List<Hi> listT = new ArrayList<>();
	public ResponseModel() {
	}
	public ResponseModel(String errorMessage, String errorCode, String message, boolean isSuccess, Transient t) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.message = message;
		this.isSuccess = isSuccess;
		T = t;
	}
	public ResponseModel(String errorMessage, String errorCode, String message, boolean isSuccess, ArrayList listT) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.message = message;
		this.isSuccess = isSuccess;
		this.listT = listT;
	}
	public ResponseModel(String errorMessage, String errorCode, String message, boolean isSuccess, List<Hi> listT) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.message = message;
		this.isSuccess = isSuccess;
		this.listT = listT;
	}

}
