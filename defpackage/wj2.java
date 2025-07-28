package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: wj2  reason: default package */
public final class wj2 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dk2 Y;
    public int Z;
    public AtomicLong o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj2(dk2 dk2, Continuation continuation) {
        super(continuation);
        this.Y = dk2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c((String) null, (RectF) null, this);
    }
}
