package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: h06  reason: default package */
public final /* synthetic */ class h06 implements o3e {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ h06(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final Object get() {
        return Boolean.valueOf(this.a.get());
    }
}
