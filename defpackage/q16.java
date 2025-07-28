package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: q16  reason: default package */
public final class q16 extends LinkedHashMap {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q16(int i, int i2, byte b2) {
        super(i, 1.0f, false);
        this.a = i2;
        this.b = 4;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                return size() > this.b;
            case 1:
                return size() > this.b;
            default:
                return super.size() > this.b;
        }
    }

    public q16(int i) {
        this.a = 2;
        this.b = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q16(int i, int i2) {
        super(4, 0.75f, true);
        this.a = 2;
        this.b = i;
    }
}
