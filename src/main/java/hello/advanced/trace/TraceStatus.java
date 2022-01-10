package hello.advanced.trace;

public class TraceStatus {
  private TraceId traceId;
  private Long startTimeMs;
  private String message;

  public TraceStatus(TraceId traceId, Long startTimeMs, String messge) {
    this.traceId = traceId;
    this.startTimeMs = startTimeMs;
    this.message = messge;
  }

  public TraceId getTraceId() {
    return traceId;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  public String getMessage() {
    return message;
  }
}
