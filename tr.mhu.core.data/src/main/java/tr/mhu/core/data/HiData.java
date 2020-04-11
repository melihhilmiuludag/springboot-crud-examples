package tr.mhu.core.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import tr.mhu.core.domain.dtos.RequestHiDto;
import tr.mhu.core.domain.entites.Hi;
import tr.mhu.core.domain.enums.EErrorCodeAndMessage;
import tr.mhu.core.domain.model.ResponseModel;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

/**
 * @author muludag on 5.01.2020
 */
@Slf4j
@Repository
public class HiData implements IHiData {

	final
	IHiDataRepository iHiDataRepository;

	@Autowired
	public HiData(IHiDataRepository iHiDataRepository) {
		this.iHiDataRepository = iHiDataRepository;
	}

	@Override
	@Transactional
	public ResponseModel hiSaySave(RequestHiDto requestHiDto) {
		Hi hi = new Hi();
		hi.setName(requestHiDto.getName());
		hi.setEmail(requestHiDto.getEmail());
		hi.setMessage(requestHiDto.getMessage());
		Hi res = iHiDataRepository.save(hi);
		return new ResponseModel(EErrorCodeAndMessage.SUCCESS.getErrorMessage(), EErrorCodeAndMessage.SUCCESS.getErrorCode(), "saved.", true, res);
	}

	@Override
	public ResponseModel getHi() {
		List<Hi> hiList = new ArrayList<>();
		hiList = iHiDataRepository.findAll();
		return new ResponseModel(EErrorCodeAndMessage.SUCCESS.getErrorMessage(), EErrorCodeAndMessage.SUCCESS.getErrorCode(), "saved.", true, hiList);
	}
}
