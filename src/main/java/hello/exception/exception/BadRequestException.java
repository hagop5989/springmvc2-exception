package hello.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "error.bad") // 500번이아니라 400번으로
public class BadRequestException extends RuntimeException {

}
