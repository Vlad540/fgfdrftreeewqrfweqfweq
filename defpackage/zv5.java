package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: zv5  reason: default package */
public final class zv5 implements oaa {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ zv5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void I(CharSequence charSequence) {
        qod qod;
        StickersShowcaseScreen stickersShowcaseScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ForwardPickerScreen.M0;
                wra u0 = ((ForwardPickerScreen) stickersShowcaseScreen).u0();
                String obj = charSequence != null ? charSequence.toString() : null;
                u0.getClass();
                if (obj == null) {
                    obj = BuildConfig.FLAVOR;
                }
                u0.x0.m((Object) null, obj);
                return;
            default:
                k77[] k77Arr2 = StickersShowcaseScreen.z0;
                sxd m0 = stickersShowcaseScreen.m0();
                qwd qwd = m0.X;
                if (!qwd.a() && (qod = m0.c.g) != null) {
                    qod.cancel((CancellationException) null);
                }
                String valueOf = String.valueOf(charSequence);
                AtomicReference atomicReference = qwd.g;
                if (!valueOf.equals(((mwd) atomicReference.get()).b)) {
                    qod qod2 = qwd.h;
                    if (qod2 != null) {
                        qod2.cancel((CancellationException) null);
                    }
                    int length = valueOf.length();
                    grd grd = qwd.d;
                    grd grd2 = qwd.f;
                    if (length == 0) {
                        g37 g37 = (g37) qwd.i.T0(qwd, qwd.j[0]);
                        if (g37 != null) {
                            g37.cancel((CancellationException) null);
                        }
                        grd.setValue(qwd.k);
                        atomicReference.set(new mwd((String) null, 3));
                        grd2.setValue((Object) null);
                        return;
                    }
                    grd.m((Object) null, new nwd(1, true, (List) null));
                    grd2.m((Object) null, valueOf);
                    return;
                }
                return;
        }
    }
}
