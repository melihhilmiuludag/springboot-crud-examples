package tr.mhu.core.api.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.mhu.core.domain.dtos.RequestHiDto;
import tr.mhu.core.domain.enums.EErrorCodeAndMessage;
import tr.mhu.core.domain.model.ResponseModel;
import tr.mhu.core.service.IHiService;

import javax.validation.Valid;

/**
 * @author muludag on 5.01.2020
 */
@RestController
@Slf4j
@RequestMapping("/say")
public class HiController {


    private final IHiService iHiService;
    @Autowired
    public HiController(IHiService iHiService) {
        this.iHiService = iHiService;
    }


    @PostMapping("/hi")
    @ResponseBody
    public ResponseEntity<ResponseModel> hi(@Valid @RequestBody RequestHiDto requestHiDto) {
        return new ResponseEntity<>(iHiService.hiSaySave(requestHiDto), HttpStatus.OK);
    }

    @GetMapping("/getHi")
    @ResponseBody
    public ResponseEntity<ResponseModel> getHi() {
        return new ResponseEntity<>(iHiService.getHi(), HttpStatus.OK);
    }

    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok("Hi, app started bro! this app developed by melihhilmiuludag.");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseModel> handleException(Exception e) {
        log.error("Handling error: " + e.getClass().getSimpleName() + ", " + e.getMessage());
        ResponseModel responseModel = new ResponseModel();
        responseModel.setErrorCode(EErrorCodeAndMessage.ERROR_HANDLE.getErrorCode());
        responseModel.setErrorMessage(e.getMessage());
        responseModel.setSuccess(false);
        return new ResponseEntity<>(responseModel, HttpStatus.OK);
    }
}
