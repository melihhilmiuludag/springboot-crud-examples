package tr.mhu.core.service;

import tr.mhu.core.domain.dtos.RequestHiDto;
import tr.mhu.core.domain.model.ResponseModel;

/**
 * @author muludag on 5.01.2020
 */
public interface IHiService {
    ResponseModel hiSaySave(RequestHiDto requestHiDto);
    ResponseModel getHi();
    ResponseModel getHi2();//
}
