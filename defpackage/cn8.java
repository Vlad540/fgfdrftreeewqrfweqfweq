package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cn8  reason: default package */
public final class cn8 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gn8 Y;
    public int Z;
    public gn8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn8(gn8 gn8, Continuation continuation) {
        super(continuation);
        this.Y = gn8;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((List) null, this);
    }
}
