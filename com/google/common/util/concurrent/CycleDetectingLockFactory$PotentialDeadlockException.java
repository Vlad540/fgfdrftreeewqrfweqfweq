package com.google.common.util.concurrent;

import java.util.Objects;

public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        gt6.i(3, wx3.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", vx3.class.getName());
    }

    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable th = null; th != null; th = th.getCause()) {
            sb.append(", ");
            sb.append(th.getMessage());
        }
        return sb.toString();
    }
}
