package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sk4  reason: default package */
public final class sk4 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vk4 Y;
    public int Z;
    public vk4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk4(vk4 vk4, Continuation continuation) {
        super(continuation);
        this.Y = vk4;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
