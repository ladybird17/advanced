package hello.advanced.trace;

import java.util.UUID;

public class TraceId {
  private String id;
  private int level;

  public TraceId(){
    this.id= createId();
    this.level = 0;
  }

  public TraceId(String id, int level){
    this.id= id;
    this.level = level;
  }

  private String createId(){
    // ab99e16f과 같은 형태로 트랜잭션 아이디가 중복될 수는 있으나, 단순한 로그 남기는 용도라 크게 문제는 없음.
    return UUID.randomUUID().toString().substring(0,8);
  }

  public TraceId createNextId(){
    return new TraceId(id, level +1);
  }

  public TraceId createPreviousId(){
    return new TraceId(id, level -1);
  }

  public boolean isFirstLevel(){
    return level == 0;
  }

  public String getId() {
    return id;
  }

  public int getLevel() {
    return level;
  }
}
