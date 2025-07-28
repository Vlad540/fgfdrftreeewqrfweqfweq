package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: ws0  reason: default package */
public abstract class ws0 {
    public static final n12 a = new n12(-1, (n12) null, (us0) null, 0);
    public static final int b = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    public static final int c = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
    public static final Symbol d = new Symbol("BUFFERED");
    public static final Symbol e = new Symbol("SHOULD_BUFFER");
    public static final Symbol f = new Symbol("S_RESUMING_BY_RCV");
    public static final Symbol g = new Symbol("RESUMING_BY_EB");
    public static final Symbol h = new Symbol("POISONED");
    public static final Symbol i = new Symbol("DONE_RCV");
    public static final Symbol j = new Symbol("INTERRUPTED_SEND");
    public static final Symbol k = new Symbol("INTERRUPTED_RCV");
    public static final Symbol l = new Symbol("CHANNEL_CLOSED");
    public static final Symbol m = new Symbol("SUSPEND");
    public static final Symbol n = new Symbol("SUSPEND_NO_WAITER");
    public static final Symbol o = new Symbol("FAILED");
    public static final Symbol p = new Symbol("NO_RECEIVE_RESULT");
    public static final Symbol q = new Symbol("CLOSE_HANDLER_CLOSED");
    public static final Symbol r = new Symbol("CLOSE_HANDLER_INVOKED");
    public static final Symbol s = new Symbol("NO_CLOSE_CAUSE");

    public static final boolean a(yv1 yv1, Object obj, k26 k26) {
        Symbol l2 = yv1.l(obj, k26);
        if (l2 == null) {
            return false;
        }
        yv1.q(l2);
        return true;
    }
}
