package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: z8e  reason: default package */
public final class z8e extends er3 {
    public SystemServicesManager$PushTokenGeneratedListener X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b9e Z;
    public b9e o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z8e(b9e b9e, Continuation continuation) {
        super(continuation);
        this.Z = b9e;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.e((SystemServicesManager$PushTokenGeneratedListener) null, this);
    }
}
