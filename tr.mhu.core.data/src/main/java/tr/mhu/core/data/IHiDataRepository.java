package tr.mhu.core.data;


import org.springframework.data.jpa.repository.JpaRepository;
import tr.mhu.core.domain.dtos.RequestHiDto;
import tr.mhu.core.domain.entites.Hi;
import tr.mhu.core.domain.model.ResponseModel;

/**
 * @author muludag on 5.01.2020
 */
public interface IHiDataRepository extends JpaRepository<Hi, String> {
//    ResponseModel hiSaySave(RequestHiDto requestHiDto);
}
