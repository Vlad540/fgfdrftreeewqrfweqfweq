package defpackage;

import androidx.work.WorkRequest;
import java.util.Set;

/* renamed from: juf  reason: default package */
public final class juf {
    public final String a;
    public final String b;
    public final a35 c;
    public final ztf d;
    public final Set e;
    public final long f;
    public final int g;

    public juf(String str, String str2, a35 a35, ztf ztf, Set set, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = a35;
        this.d = ztf;
        this.e = set;
        this.f = j;
        this.g = i;
    }

    public juf(String str, a35 a35, WorkRequest workRequest) {
        this(workRequest.getId().toString(), str, a35, workRequest.getWorkSpec(), workRequest.getTags(), System.currentTimeMillis(), 0);
    }
}
