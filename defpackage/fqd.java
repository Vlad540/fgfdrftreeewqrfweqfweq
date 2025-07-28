package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: fqd  reason: default package */
public final class fqd extends l5e implements i26 {
    public b X;
    public int Y;
    public final /* synthetic */ a Z;
    public final /* synthetic */ gqd w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ pae y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fqd(a aVar, gqd gqd, String str, n3a n3a, Continuation continuation) {
        super(2, continuation);
        this.Z = aVar;
        this.w0 = gqd;
        this.x0 = str;
        this.y0 = n3a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fqd(this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        Context context;
        mg5 mg5;
        gqd gqd = this.w0;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            a aVar = this.Z;
            Context T0 = aVar.T0();
            try {
                mg5 = gqd.a;
            } catch (Exception e) {
                e = e;
                context = T0;
                udd.s(gqd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                a06.E(context, cic.L2);
                return jue.a;
            }
            try {
                mg5.getClass();
                File o = mg5.o((String) null, (String) null);
                String name = o.getName();
                Uri x = at7.x(this.x0);
                try {
                    int i2 = xs7.y;
                    File q = vl.b().h().q(name);
                    if (!q.exists() && x != null) {
                        ete.E(T0.getContentResolver().openInputStream(x), q);
                    }
                    try {
                        gqd.b.getClass();
                        Size i3 = tf4.i(T0);
                        int min = Math.min(Math.max(i3.getWidth(), i3.getHeight()), 2048);
                        String absolutePath = o.getAbsolutePath();
                        at7.J(absolutePath, absolutePath, min, min, 100);
                        at7.H(gqd.c, absolutePath);
                        Uri fromFile = Uri.fromFile(o);
                        zr7 c = this.y0.c();
                        eqd eqd = new eqd(aVar, fromFile, absolutePath, (Continuation) null);
                        this.X = T0;
                        this.Y = 1;
                        if (xs7.U(c, eqd, this) == pu3) {
                            return pu3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e = e;
                        context = T0;
                        udd.s(gqd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                        a06.E(context, cic.L2);
                        return jue.a;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e = e;
                    context = T0;
                    udd.s(gqd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                    a06.E(context, cic.L2);
                    return jue.a;
                }
            } catch (Exception e4) {
                e = e4;
                e = e;
                context = T0;
                udd.s(gqd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                a06.E(context, cic.L2);
                return jue.a;
            }
        } else if (i == 1) {
            context = this.X;
            try {
                wx3.H(obj);
            } catch (Exception e5) {
                e = e5;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
