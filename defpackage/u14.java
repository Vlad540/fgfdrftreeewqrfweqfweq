package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: u14  reason: default package */
public final /* synthetic */ class u14 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a;
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
        Class<u14> cls = u14.class;
        a = AtomicIntegerFieldUpdater.newUpdater(cls, "installations$volatile");
        AtomicLongFieldUpdater.newUpdater(cls, "sequenceNumber$volatile");
    }
}
