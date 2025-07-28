package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: f72  reason: default package */
public final class f72 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n72 Y;
    public int Z;
    public AtomicLong o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f72(n72 n72, Continuation continuation) {
        super(continuation);
        this.Y = n72;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.h((String) null, (RectF) null, this);
    }
}
