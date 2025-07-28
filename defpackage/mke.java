package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import kotlin.coroutines.Continuation;

/* renamed from: mke  reason: default package */
public final class mke extends l5e implements i26 {
    public int X;
    public final /* synthetic */ cle Y;
    public final /* synthetic */ ByteBuffer Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mke(cle cle, ByteBuffer byteBuffer, Continuation continuation) {
        super(2, continuation);
        this.Y = cle;
        this.Z = byteBuffer;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mke(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            AsynchronousByteChannel asynchronousByteChannel = this.Y.b;
            this.X = 1;
            zv1 zv1 = new zv1(1, urd.y(this));
            zv1.n();
            asynchronousByteChannel.read(this.Z, zv1, ju.b);
            obj = zv1.m();
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
