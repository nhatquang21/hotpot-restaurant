package demo.springboot.hotpot.exception;

import demo.springboot.hotpot.models.HttpError;
import org.springframework.http.HttpStatusCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HttpErrorException extends Exception {
  private HttpStatusCode httpStatusCode;
  private HttpError responseBody;
}
