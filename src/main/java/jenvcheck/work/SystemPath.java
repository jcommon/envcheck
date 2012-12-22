package jenvcheck.work;

import jenvcheck.IWork;
import jenvcheck.IWorkResult;
import jenvcheck.WorkResults;

public class SystemPath implements IWork<Boolean> {
  @Override
  public IWorkResult<Boolean> doWork() throws Throwable {
    return WorkResults.TRUE;
  }
}
