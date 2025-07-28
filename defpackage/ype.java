package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ype  reason: default package */
public final class ype implements fu3 {
    public static final s59 c = new Object();
    public final fr3 a;
    public final AtomicInteger b = new AtomicInteger(0);

    public ype(fr3 fr3) {
        this.a = fr3;
    }

    public final Object fold(Object obj, i26 i26) {
        return i26.invoke(obj, this);
    }

    public final fu3 get(gu3 gu3) {
        return urd.r(this, gu3);
    }

    public final gu3 getKey() {
        return c;
    }

    public final hu3 minusKey(gu3 gu3) {
        return urd.z(this, gu3);
    }

    public final hu3 plus(hu3 hu3) {
        return hhd.I(this, hu3);
    }
}
