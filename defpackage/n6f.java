package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException;

/* renamed from: n6f  reason: default package */
public final class n6f extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ r6f Z;
    public final /* synthetic */ File w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n6f(r6f r6f, File file, Continuation continuation) {
        super(2, continuation);
        this.Z = r6f;
        this.w0 = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n6f n6f = new n6f(this.Z, this.w0, continuation);
        n6f.Y = obj;
        return n6f;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        a6c a6c = null;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            t0c t0c = this.Z.G0;
            l5e l5e = new l5e(2, (Continuation) null);
            this.Y = ou32;
            this.X = 1;
            Object G = ez3.G(t0c, l5e, this);
            if (G == pu3) {
                return pu3;
            }
            ou3 = ou32;
            obj = G;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (hhd.f((Boolean) obj, Boolean.TRUE)) {
            String name = ou3.getClass().getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, name, "Camera preview was bind successfully", (Throwable) null);
            }
            r6f r6f = this.Z;
            File file = this.w0;
            wu1 wu1 = r6f.L0;
            r6f.getClass();
            r6f.E0 = z3d.a();
            y5c y5c = r6f.y0;
            if (y5c != null) {
                ew0 ew0 = new ew0((Context) r6f.a.getValue(), y5c, new c9(file).h());
                ew0.Y = true;
                ew0.x();
                a6c = ew0.u((ExecutorService) r6f.Z.getValue(), new jv1(11, r6f));
            }
            r6f.D0 = a6c;
            return jue.a;
        }
        throw new VideoMessageRecordDelegate$PreviewRenderException(0);
    }
}
