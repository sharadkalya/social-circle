package com.circle.socialcircle;

public class DemoService implements IDemoService {
  private final LogRepository logRepository;

  public DemoService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public String showMessage(String message) {
    if (message == null || message.length() == 0) {
      return "This is just a random message";
    }
    String result = String.format("%s Hello again !", message);

    // add log to database
    Log log = new Log();
    log.setMessage(message);
    logRepository.save(log);

    return result;
  }
}
