package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: oxd  reason: default package */
public final class oxd extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sxd Y;
    public int Z;
    public sxd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oxd(sxd sxd, Continuation continuation) {
        super(continuation);
        this.Y = sxd;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return sxd.q(this.Y, (List) null, (nwd) null, this);
    }
}
