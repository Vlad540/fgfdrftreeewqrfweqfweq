package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: rk0  reason: default package */
public final class rk0 extends er3 {
    public final /* synthetic */ vk0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rk0(vk0 vk0, Continuation continuation) {
        super(continuation);
        this.X = vk0;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.g((ArrayList) null, this);
    }
}
