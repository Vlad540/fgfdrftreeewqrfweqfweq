package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: tk5  reason: default package */
public final class tk5 extends er3 {
    public int X;
    public final /* synthetic */ tj5 Y;
    public rj5 Z;
    public /* synthetic */ Object o;
    public Iterator w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk5(tj5 tj5, Continuation continuation) {
        super(continuation);
        this.Y = tj5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.c((rj5) null, this);
    }
}
