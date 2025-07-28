package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: n4a  reason: default package */
public final class n4a extends er3 {
    public final /* synthetic */ o4a X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n4a(o4a o4a, Continuation continuation) {
        super(continuation);
        this.X = o4a;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        this.X.a((Context) null, this);
        return pu3.a;
    }
}
