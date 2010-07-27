package org.ttb.integration.mvc.model;

/**
 * Interface which should be implemented by every class which wants to be
 * notified whenever pattern list changed.
 * 
 * @author Piotr Dorobisz
 * 
 */
public interface ITracePatternListObserver {

    public void addPattern(TracePattern tracePattern);

    public void removePattern(TracePattern tracePattern);

    public void updatePattern(TracePattern tracePattern);
}
