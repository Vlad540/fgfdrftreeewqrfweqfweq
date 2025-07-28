package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: hxc  reason: default package */
public abstract class hxc {
    public static final int a = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    public static final Symbol b = new Symbol("PERMIT");
    public static final Symbol c = new Symbol("TAKEN");
    public static final Symbol d = new Symbol("BROKEN");
    public static final Symbol e = new Symbol("CANCELLED");
    public static final int f = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);
}
