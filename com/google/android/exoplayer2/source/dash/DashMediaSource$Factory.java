package com.google.android.exoplayer2.source.dash;

import androidx.work.WorkRequest;

public final class DashMediaSource$Factory implements pe8 {
    public final nfc a;
    public final mz3 b;
    public final mn c = new mn(13);
    public final lu7 d = new Object();
    public final lk9 e = new Object();
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, lk9] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, lu7] */
    public DashMediaSource$Factory(mz3 mz3) {
        this.a = new nfc(13, (Object) mz3);
        this.b = mz3;
    }
}
