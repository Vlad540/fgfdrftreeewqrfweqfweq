package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: dd2  reason: default package */
public final class dd2 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gd2 Y;
    public int Z;
    public ArrayList o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dd2(gd2 gd2, Continuation continuation) {
        super(continuation);
        this.Y = gd2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(0, 0, 0, this);
    }
}
