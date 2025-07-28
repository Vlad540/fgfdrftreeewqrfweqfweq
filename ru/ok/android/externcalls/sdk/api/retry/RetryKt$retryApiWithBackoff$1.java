package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RetryKt$retryApiWithBackoff$1 extends x26 implements u16 {
    public static final RetryKt$retryApiWithBackoff$1 INSTANCE = new RetryKt$retryApiWithBackoff$1();

    public RetryKt$retryApiWithBackoff$1() {
        super(1, RetryKt.class, "retryApiExceptionFilter", "retryApiExceptionFilter(Ljava/lang/Throwable;)Z", 1);
    }

    public final Boolean invoke(Throwable th) {
        return Boolean.valueOf(RetryKt.retryApiExceptionFilter(th));
    }
}
