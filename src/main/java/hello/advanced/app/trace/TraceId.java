package hello.advanced.app.trace;

import java.util.UUID;

public class TraceId {
  private String id;
  private int level;

  public TraceId(String id, int level){
    this.id = createId();
    this.level = 0;
  }

  private String createId(){
    // ab99e16f-dddd-dddd-ddddd.... 중 ab99e16f만 잘라냄. 자르면 중복이 되는 경우 발생하나, 상관없어서 잘라냄
    return UUID.randomUUID().toString().substring(0, 8);
  }

  public TraceId createNextId(){
    return new TraceId(id, level+1);
  }
  public TraceId createPreviousId(){
    return new TraceId(id, level-1);
  }

  public boolean isFirstLevel(){
    return level == 0;
  }

  public String getId(){
    return id;
  }

  public int getLevel(){
    return level;
  }
}
