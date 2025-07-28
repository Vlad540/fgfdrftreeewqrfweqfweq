package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: j47  reason: default package */
public abstract class j47 {
    public static final Symbol a = new Symbol("COMPLETING_ALREADY");
    public static final Symbol b = new Symbol("COMPLETING_WAITING_CHILDREN");
    public static final Symbol c = new Symbol("COMPLETING_RETRY");
    public static final Symbol d = new Symbol("TOO_LATE_TO_CANCEL");
    public static final Symbol e = new Symbol("SEALED");
    public static final yv4 f = new yv4(false);
    public static final yv4 g = new yv4(true);

    public static final Object a(Object obj) {
        jv6 jv6;
        kv6 kv6 = obj instanceof kv6 ? (kv6) obj : null;
        return (kv6 == null || (jv6 = kv6.a) == null) ? obj : jv6;
    }
}
