package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: q7c  reason: default package */
public final class q7c extends LinkedHashMap {
    public final /* synthetic */ og0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q7c(og0 og0, int i) {
        super(i, 0.75f, true);
        this.a = og0;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.b;
    }
}
