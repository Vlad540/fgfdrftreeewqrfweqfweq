package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: wj7  reason: default package */
public final class wj7 extends er3 {
    public final /* synthetic */ yj7 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj7(yj7 yj7, Continuation continuation) {
        super(continuation);
        this.X = yj7;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.s((ArrayList) null, this);
    }
}
