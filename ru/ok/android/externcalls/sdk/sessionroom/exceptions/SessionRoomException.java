package ru.ok.android.externcalls.sdk.sessionroom.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/exceptions/SessionRoomException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SessionRoomException extends RuntimeException {
    private final Throwable cause;
    private final String message;

    public SessionRoomException() {
        this((String) null, (Throwable) null, 3, (x54) null);
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public SessionRoomException(String str) {
        this(str, (Throwable) null, 2, (x54) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionRoomException(String str, Throwable th, int i, x54 x54) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public SessionRoomException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }
}
