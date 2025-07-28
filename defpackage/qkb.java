package defpackage;

import android.os.SystemClock;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: qkb  reason: default package */
public final /* synthetic */ class qkb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vkb b;

    public /* synthetic */ qkb(vkb vkb, int i) {
        this.a = i;
        this.b = vkb;
    }

    public final void onClick(View view) {
        Object value;
        ns1 ns1;
        Object value2;
        Object obj;
        kkb kkb = kkb.a;
        ykb ykb = null;
        vkb vkb = this.b;
        switch (this.a) {
            case 0:
                e3 e3Var = vkb.x0;
                if (e3Var != null) {
                    int i = lt1.E0;
                    lt1 lt1 = (lt1) e3Var.a;
                    lt1.a(false, true);
                    MediaBarWidget listener = lt1.getListener();
                    if (listener != null) {
                        xg9.g(listener.o, mnc.CHAT_ATTACH_PICKER);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ykb ykb2 = vkb.o;
                if (ykb2 != null) {
                    ykb = ykb2;
                }
                grd grd = ykb.y0;
                do {
                    value = grd.getValue();
                    int ordinal = ((ns1) value).ordinal();
                    if (ordinal == 0) {
                        ns1 = ns1.b;
                    } else if (ordinal != 1) {
                        ns1 = ns1.a;
                        if (!(ordinal == 2 || ordinal == 3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        ns1 = ns1.c;
                    }
                } while (!grd.b(value, ns1));
                return;
            case 2:
                ykb ykb3 = vkb.o;
                if (ykb3 == null) {
                    ykb3 = null;
                }
                ykb3.getClass();
                udd.q("QuickCameraViewModel", "onClickTake()");
                grd grd2 = ykb3.x0;
                lkb lkb = (lkb) grd2.getValue();
                boolean z = lkb instanceof hkb;
                l05 l05 = ykb3.z0;
                if (z) {
                    grd2.m((Object) null, ikb.a);
                    taf.o(l05, ekb.a);
                    return;
                } else if (lkb instanceof ikb) {
                    return;
                } else {
                    if (lkb instanceof kkb) {
                        if (ykb3.B0.h()) {
                            grd2.m((Object) null, new jkb(SystemClock.elapsedRealtime()));
                            taf.o(l05, new ckb(((mg5) ykb3.X).n(ykb3.Y.a())));
                            return;
                        }
                        taf.o(ykb3.A0, nkb.a);
                        return;
                    } else if (lkb instanceof jkb) {
                        grd2.m((Object) null, kkb);
                        taf.o(l05, dkb.a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            case 3:
                vkb.getCameraApi().f(!vkb.getCameraApi().j());
                return;
            default:
                ykb ykb4 = vkb.o;
                if (ykb4 != null) {
                    ykb = ykb4;
                }
                grd grd3 = ykb.x0;
                do {
                    value2 = grd3.getValue();
                    obj = (lkb) value2;
                    if (obj instanceof hkb) {
                        obj = kkb;
                    } else if (obj instanceof kkb) {
                        obj = hkb.a;
                    } else if (!(obj instanceof jkb) && !(obj instanceof ikb)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!grd3.b(value2, obj));
                return;
        }
    }
}
