package tr.mhu.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.mhu.core.data.IHiData;
import tr.mhu.core.domain.dtos.RequestHiDto;
import tr.mhu.core.domain.model.ResponseModel;

/**
 * @author muludag on 5.01.2020
 */
@Service
public class HiService implements IHiService {


	final
	IHiData iHiData;

	@Autowired
	public HiService(IHiData iHiData) {
		this.iHiData = iHiData;
	}

	@Override
	public ResponseModel hiSaySave(RequestHiDto requestHiDto) {
		return iHiData.hiSaySave(requestHiDto);
	}

	@Override
	public ResponseModel getHi() {
		return iHiData.getHi();
	}

	@Override
	public ResponseModel getHi2() {
		return null;
	}
}
