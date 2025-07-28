package com.facebook.common.time;

@lj4
public class AwakeTimeSinceBootClock implements c69 {
    @lj4
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @lj4
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @lj4
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @lj4
    public long nowNanos() {
        return System.nanoTime();
    }
}
