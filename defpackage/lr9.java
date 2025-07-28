package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: lr9  reason: default package */
public final class lr9 extends er3 {
    public final /* synthetic */ mr9 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lr9(mr9 mr9, Continuation continuation) {
        super(continuation);
        this.X = mr9;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return mr9.d(this.X, (ArrayList) null, this);
    }
}
