package com.circle.socialcircle.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
  @JsonProperty("error")
  private MessageResponse messageResponse;

  public ErrorResponse(MessageResponse messageResponse) {
    this.messageResponse = messageResponse;
  }

  public ErrorResponse(String message) {
    this.messageResponse = new MessageResponse(message);
  }

  public MessageResponse getMessageResponse() {
    return messageResponse;
  }

  public void setMessageResponse(MessageResponse messageResponse) {
    this.messageResponse = messageResponse;
  }
}
