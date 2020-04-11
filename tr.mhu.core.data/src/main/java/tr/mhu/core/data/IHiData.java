package tr.mhu.core.data;

import tr.mhu.core.domain.dtos.RequestHiDto;
import tr.mhu.core.domain.entites.Hi;
import tr.mhu.core.domain.model.ResponseModel;

import java.util.List;

/**
 * @author muludag on 5.01.2020
 */
public interface IHiData {
    ResponseModel hiSaySave(RequestHiDto requestHiDto);
    ResponseModel getHi();
}
