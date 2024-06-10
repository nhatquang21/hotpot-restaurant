package demo.springboot.hotpot.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import demo.springboot.hotpot.constants.HttpErrorConstants;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HttpError {
  /**
   * mutli-lingual message
   */
  @Builder.Default
  private Map<String, String> messages = new HashMap<>();

  private String code;

  @Builder.Default
  private Map<String, String> details = new HashMap<>();

  public HttpError(String code) {
    this.code = code;
    this.messages = HttpErrorConstants.getMessage(code);
    this.details = new HashMap<>();
  }

  public HttpError(String code, Map<String, String> messages) {
    if (messages == null) {
      messages = HttpErrorConstants.getMessage(code);
    }

    this.code = code;
    this.messages = messages;
    this.details = new HashMap<>();
  }

  public void setMessage(String locale, String message) {
    if (messages == null) {
      messages = new HashMap<>();
    }

    messages.put(locale, message);
  }

  public void setMessage(Entry<String, String> entry) {
    if (messages == null) {
      messages = new HashMap<>();
    }

    messages.put(entry.getKey(), entry.getValue());
  }

  public void addDetail(String key, String value) {
    if (details == null) {
      details = new HashMap<>();
    }

    details.put(key, value);
  }

  public void addDetail(Entry<String, String> entry) {
    if (details == null) {
      details = new HashMap<>();
    }

    details.put(entry.getKey(), entry.getValue());
  }

  public String toJsonStringify() {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      return objectMapper.writeValueAsString(this.messages);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }

  // override generated `build()` method
  public static HttpErrorBuilder builder() {
    return new HttpErrorBuilderWithGeneratedMessages();
  }

  private static class HttpErrorBuilderWithGeneratedMessages extends HttpErrorBuilder {
    @Override
    public HttpError build() {
      HttpError instance = super.build();
      if (instance.messages == null || instance.messages.isEmpty()) {
        instance.messages = HttpErrorConstants.getMessage(instance.code);
      }

      return instance;
    }
  }
}