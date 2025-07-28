package defpackage;

import android.net.Uri;
import android.view.Surface;
import android.widget.SeekBar;
import java.io.File;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: jv1  reason: default package */
public final /* synthetic */ class jv1 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jv1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [wt1, java.lang.Exception] */
    public final void accept(Object obj) {
        String str = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                a8f a8f = (f8f) obj;
                int i = CameraxCameraApiView.y0;
                if (a8f instanceof a8f) {
                    a8f a8f2 = a8f;
                    if (a8f2.c == 0) {
                        z = false;
                    }
                    CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.b;
                    Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
                    if (!z) {
                        udd.q(cls.getName(), "onVideoTaken");
                        gvf gvf = cameraxCameraApiView.w0;
                        if (gvf != null) {
                            File file = a8f2.a.b.c;
                            ykb ykb = ((vkb) gvf.b).o;
                            if (ykb == null) {
                                ykb = null;
                            }
                            taf.n(ykb, ykb.w0.b(), (ru3) null, new xkb(ykb, file, (Continuation) null), 2);
                            return;
                        }
                        return;
                    }
                    udd.q(cls.getName(), "onCameraError");
                    gvf gvf2 = cameraxCameraApiView.w0;
                    if (gvf2 != null) {
                        gvf2.i(new Exception(a8f2.d));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fm7 fm7 = (fm7) obj;
                fm7.d = ((be9) this.b).G0.c;
                fm7.b = false;
                return;
            case 2:
                fm7 fm72 = (fm7) obj;
                fm72.b = ((Boolean) this.b).booleanValue();
                fm72.a = true;
                return;
            case 3:
                ((fm7) obj).e = (gm7) this.b;
                return;
            case 4:
                ((kf9) obj).m1(((SeekBar) this.b).getProgress());
                return;
            case 5:
                af9 af9 = (af9) obj;
                int checkedChipId = ((ef9) this.b).w0.getCheckedChipId();
                gm7 gm7 = checkedChipId == yqb.layout_send_location__duration_20m ? gm7.c : checkedChipId == yqb.layout_send_location__duration_1h ? gm7.o : checkedChipId == yqb.layout_send_location__duration_3h ? gm7.X : checkedChipId == yqb.layout_send_location__duration_24h ? gm7.Y : checkedChipId == yqb.layout_send_location__duration_no_limit ? gm7.Z : gm7.X;
                af9.getClass();
                for (be9 be9 : (Set) af9.a) {
                    be9.getClass();
                    be9.b2(new jv1(3, gm7));
                }
                return;
            case 6:
                ((y5c) this.b).J = (Uri) obj;
                return;
            case 7:
                cb0 cb0 = (cb0) obj;
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    int i2 = cb0.b - ((ba0) entry.getKey()).f;
                    if (((ba0) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int i3 = hqe.i(i2);
                    o4e o4e = (o4e) entry.getValue();
                    o4e.getClass();
                    gt0.I(new as0(o4e, i3, -1, 5));
                }
                return;
            case 8:
                bb0 bb0 = (bb0) obj;
                xz xzVar = (xz) this.b;
                if (xzVar != null) {
                    xzVar.h();
                    return;
                }
                return;
            case 9:
                ((sn1) this.b).b((bb0) obj);
                return;
            case 10:
                bb0 bb02 = (bb0) obj;
                vj4 vj4 = (vj4) this.b;
                vj4.getClass();
                bb02.b.hashCode();
                Surface surface = (Surface) vj4.g;
                Surface surface2 = bb02.b;
                if (surface2 == surface) {
                    vj4.g = null;
                    ((sn1) vj4.n).b((xx4) vj4.f);
                    vj4.e();
                    return;
                }
                surface2.release();
                return;
            default:
                r6f r6f = (r6f) this.b;
                a8f a8f3 = (f8f) obj;
                if (a8f3 instanceof a8f) {
                    a8f a8f4 = a8f3;
                    if (a8f4.c == 0) {
                        z = false;
                    }
                    Class<r6f> cls2 = r6f.class;
                    if (!z) {
                        String name = cls2.getName();
                        fn6 fn6 = udd.e;
                        if (fn6 != null && fn6.c()) {
                            fn6.d(tn7.X, name, "onVideoTaken", (Throwable) null);
                        }
                        a73 a73 = r6f.E0;
                        if (a73 != null) {
                            a73.makeCompleting$kotlinx_coroutines_core(a8f4.b.a);
                            return;
                        }
                        return;
                    }
                    String name2 = cls2.getName();
                    Throwable th = a8f4.d;
                    udd.s(name2, rf0.h("onCameraError: ", th != null ? th.getLocalizedMessage() : null), a8f4.d);
                    a73 a732 = r6f.E0;
                    if (a732 != null) {
                        Throwable th2 = a8f4.d;
                        if (th2 == null) {
                            Throwable th3 = a8f4.d;
                            if (th3 != null) {
                                str = th3.getLocalizedMessage();
                            }
                            th2 = new RuntimeException(str);
                        }
                        a732.makeCompleting$kotlinx_coroutines_core(new r73(th2, false));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
