package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.PlaybackException;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: j9  reason: default package */
public final /* synthetic */ class j9 implements m9e, of3, tbf, j26, e21, agc, au, tn1, i83, rjd, lh7, nh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j9(hda hda, mv4 mv4) {
        this.a = 18;
        this.c = hda;
        this.b = mv4;
    }

    public void a(int i) {
        DateTimePicker dateTimePicker = (DateTimePicker) this.b;
        if (!dateTimePicker.R0) {
            v04 v04 = (v04) ((z04) this.c).C(i);
            s04 s04 = dateTimePicker.Q0;
            if (s04 != null) {
                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) s04;
                udd.q("ScheduledSendPickerViewModel", "day = " + v04);
                grd grd = scheduledSendPickerViewModel.e;
                k04 k04 = (k04) grd.getValue();
                if (k04 != null && !hhd.f(k04.a, v04)) {
                    grd.m((Object) null, k04.a(k04, v04, (zie) null, (zie) null, 6));
                    scheduledSendPickerViewModel.f();
                }
            }
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 1:
                udd.q("oz", "Attach downloaded");
                oz ozVar = (oz) obj3;
                ozVar.b.o((mz) obj2, (File) obj);
                ozVar.a.C(false);
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                y52 y52 = (y52) obj;
                ((t52) obj3).getClass();
                y52.c = (m62) obj2;
                t52.q(y52);
                y52.x = 0;
                y52.m = 0;
                return;
            case LangUtils.HASH_SEED /*17*/:
                y52 y522 = (y52) obj;
                t52 t52 = (t52) obj3;
                t52.getClass();
                Map d = y522.d();
                j2b j2b = (j2b) t52.n;
                d.remove(Long.valueOf(j2b.a.s()));
                if (((i22) obj2).Y()) {
                    for (Long remove : Collections.singletonList(Long.valueOf(j2b.a.s()))) {
                        y522.R.remove(remove);
                    }
                }
                t52.q(y522);
                y522.x = 0;
                return;
            default:
                gi3 gi3 = (gi3) obj;
                gi3.k = (mi3) obj3;
                gi3.i = (li3) obj2;
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public Object m2apply(Object obj) {
        xo0 xo0 = (xo0) obj;
        gvf gvf = (gvf) this.b;
        gvf.getClass();
        uj3 uj3 = (uj3) ((Map) this.c).get(Long.valueOf(xo0.a));
        if (uj3 == null) {
            udd.p("gvf", "prepareBotCommandItems, contactInfo is null, botId: %d", new Object[]{Long.valueOf(xo0.a)});
            return new ep0((String) null, xo0.a, gvf.d(xo0, (uj3) null), xo0.c);
        }
        return new ep0(ehe.c(uj3.A0), xo0.a, gvf.d(xo0, uj3), xo0.c);
    }

    public void b() {
        lv1 lv1;
        lhd lhd;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 6:
                zz0 zz0 = (zz0) obj2;
                if (zz0.T0 != null && (lv1 = zz0.Q0) != null) {
                    lv1.w((dgc) obj);
                    return;
                }
                return;
            default:
                hl1 hl1 = (hl1) obj2;
                if (hhd.f(hl1.L0, Boolean.TRUE) && (lhd = hl1.K0) != null) {
                    k77[] k77Arr = CallTopPanelWidget.o;
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) lhd.b;
                    if (((aj1) callTopPanelWidget.a.getValue()).u()) {
                        taf.o(callTopPanelWidget.m0().b.Q0, kh1.C);
                        return;
                    }
                    boolean z = true;
                    mq3 b2 = pfa.a(1).d().j((dgc) obj).b();
                    u81 u81 = (u81) callTopPanelWidget.m0().b.G0.a.getValue();
                    pq3 pq3 = bja.a;
                    boolean z2 = !u81.g;
                    y11 y11 = u81.f;
                    if ((y11 != null ? y11.a : null) == null) {
                        z = false;
                    }
                    lg7 c2 = hwf.c();
                    if (z2) {
                        c2.add(bja.a);
                    }
                    if (z) {
                        c2.add(bja.b);
                    }
                    b2.e(hwf.a(c2)).build().q(callTopPanelWidget);
                    return;
                }
                return;
        }
    }

    public void c(j9e j9e, int i) {
        String str;
        switch (this.a) {
            case 0:
                List list = (List) ((u5g) this.b).b;
                if (!list.isEmpty()) {
                    gda gda = j9e.e;
                    gda gda2 = gda instanceof gda ? gda : null;
                    k9 k9Var = (k9) list.get(i);
                    hda hda = (hda) this.c;
                    Context context = hda.getContext();
                    int i2 = 1;
                    boolean z = i == hda.getSelectedTabPosition();
                    String valueOf = String.valueOf(k9Var.a);
                    String string = context.getString(k9Var.b);
                    if (!z) {
                        i2 = 2;
                    }
                    sz9 sz9 = new sz9(valueOf, i2, 56, string);
                    if (gda2 != null) {
                        gda2.setTabItem(sz9);
                        return;
                    }
                    gda gda3 = new gda(hda.getContext());
                    gda3.setTabItem(sz9);
                    j9e.e = gda3;
                    l9e l9e = j9e.g;
                    if (l9e != null) {
                        l9e.e();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                f71 f71 = (f71) this.b;
                if (!f71.a.isEmpty()) {
                    gda gda4 = j9e.e;
                    gda gda5 = gda4 instanceof gda ? gda4 : null;
                    h71 h71 = (h71) f71.a.get(i);
                    hda hda2 = (hda) this.c;
                    Context context2 = hda2.getContext();
                    int i3 = 1;
                    boolean z2 = i == hda2.getSelectedTabPosition();
                    String valueOf2 = String.valueOf(h71.a);
                    String string2 = context2.getString(h71.b);
                    if (!z2) {
                        i3 = 2;
                    }
                    sz9 sz92 = new sz9(valueOf2, string2, i3, new pz9(0), (Drawable) null, (Drawable) null);
                    if (gda5 != null) {
                        gda5.setTabItem(sz92);
                        return;
                    }
                    gda gda6 = new gda(hda2.getContext());
                    gda6.setTabItem(sz92);
                    j9e.e = gda6;
                    l9e l9e2 = j9e.g;
                    if (l9e2 != null) {
                        l9e2.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                hda hda3 = (hda) this.c;
                int selectedTabPosition = hda3.getSelectedTabPosition();
                gda gda7 = j9e.e;
                gda gda8 = gda7 instanceof gda ? gda7 : null;
                ie2 ie2 = (ie2) ((List) ((mv4) this.b).b).get(i);
                int i4 = 1;
                boolean z3 = i == selectedTabPosition;
                Context context3 = hda3.getContext();
                int ordinal = ie2.ordinal();
                if (ordinal == 0) {
                    str = d8.u(context3, l8a.u0);
                } else if (ordinal == 1) {
                    str = d8.u(context3, l8a.s0);
                } else if (ordinal == 2) {
                    str = d8.u(context3, l8a.t0);
                } else if (ordinal == 3) {
                    str = d8.u(context3, l8a.r0);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                String valueOf3 = String.valueOf(ie2.ordinal());
                if (!z3) {
                    i4 = 2;
                }
                sz9 sz93 = new sz9(valueOf3, i4, 8, str);
                if (gda8 != null) {
                    gda8.setTabItem(sz93);
                    return;
                }
                gda gda9 = new gda(hda3.getContext());
                gda9.setTabItem(sz93);
                j9e.e = gda9;
                l9e l9e3 = j9e.g;
                if (l9e3 != null) {
                    l9e3.e();
                    return;
                }
                return;
        }
    }

    public void d(Object obj, wi5 wi5) {
        ((hd) obj).u((kya) this.c, new b2b(wi5, ((g44) this.b).X));
    }

    public Object h(uwb uwb) {
        String str = (String) this.b;
        t73 t73 = (t73) this.c;
        try {
            Trace.beginSection(str);
            return t73.f.h(uwb);
        } finally {
            Trace.endSection();
        }
    }

    public void i(q7 q7Var) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 5:
                w6 w6Var = (w6) q7Var;
                f21 f21 = (f21) obj2;
                zz0 zz0 = (zz0) obj;
                if (w6Var instanceof t6) {
                    f21.getClass();
                    lv1 lv1 = zz0.Q0;
                    if (lv1 != null) {
                        lv1.A(true);
                    }
                    zq3 zq3 = f21.a;
                    if (zq3 != null) {
                        zq3.dismiss();
                    }
                    f21.a = null;
                    return;
                } else if (w6Var instanceof u6) {
                    f21.getClass();
                    lv1 lv12 = zz0.Q0;
                    if (lv12 != null) {
                        lv12.A(false);
                    }
                    zq3 zq32 = f21.a;
                    if (zq32 != null) {
                        zq32.dismiss();
                    }
                    f21.a = null;
                    return;
                } else if (w6Var instanceof v6) {
                    f21.getClass();
                    lv1 lv13 = zz0.Q0;
                    if (lv13 != null) {
                        k77[] k77Arr = CallBottomPanelWidget.w0;
                        taf.o(((CallBottomPanelWidget) lv13.b).m0().c.Q0, ih1.C);
                    }
                    zq3 zq33 = f21.a;
                    if (zq33 != null) {
                        zq33.dismiss();
                    }
                    f21.a = null;
                    return;
                } else if (w6Var instanceof s6) {
                    f21.getClass();
                    lv1 lv14 = zz0.Q0;
                    if (lv14 != null) {
                        k77[] k77Arr2 = CallBottomPanelWidget.w0;
                        taf.o(((CallBottomPanelWidget) lv14.b).m0().c.Q0, jh1.C);
                    }
                    zq3 zq34 = f21.a;
                    if (zq34 != null) {
                        zq34.dismiss();
                    }
                    f21.a = null;
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            default:
                z6 z6Var = (z6) q7Var;
                f21 f212 = (f21) obj2;
                el1 el1 = (el1) obj;
                if (z6Var instanceof y6) {
                    f212.getClass();
                    lhd lhd = el1.P0;
                    if (lhd != null) {
                        lhd.A(raf.a);
                    }
                    zq3 zq35 = f212.a;
                    if (zq35 != null) {
                        zq35.dismiss();
                    }
                    f212.a = null;
                    return;
                } else if (z6Var instanceof x6) {
                    f212.getClass();
                    lhd lhd2 = el1.P0;
                    if (lhd2 != null) {
                        lhd2.A(raf.c);
                    }
                    zq3 zq36 = f212.a;
                    if (zq36 != null) {
                        zq36.dismiss();
                    }
                    f212.a = null;
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
        }
    }

    public void invoke(Object obj) {
        hd hdVar = (hd) obj;
        switch (this.a) {
            case 22:
                hdVar.C((gd) this.b, (wxa) this.c);
                return;
            case 24:
                hdVar.E((gd) this.b, (a39) this.c);
                return;
            case 25:
                hdVar.A0((gd) this.b, (spe) this.c);
                return;
            case 26:
                hdVar.m0((gd) this.b, (PlaybackException) this.c);
                return;
            case 27:
                hdVar.K((gd) this.b, (l24) this.c);
                return;
            case 28:
                hdVar.N((gd) this.b, (k20) this.c);
                return;
            default:
                r8f r8f = (r8f) this.c;
                hdVar.T((gd) this.b, r8f);
                int i = r8f.a;
                return;
        }
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 11:
                ((yr1) this.b).getClass();
                ((w30) this.c).b(new xr1(sn1, 0));
                return "submitStillCapture";
            case Protos.Attaches.Attach.PRESENT /*12*/:
                es1 es1 = (es1) this.b;
                es1.getClass();
                pa2.A().execute(new g5((Object) es1, (Object) (AtomicReference) this.c, (Object) sn1, 13));
                return "OnScreenFlashStart";
            default:
                hv1 hv1 = (hv1) this.b;
                hv1.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = hv1.d;
                executor.execute(new gv1(hv1, (Context) this.c, executor, 1, sn1, elapsedRealtime));
                return "CameraX initInternal";
        }
    }

    public /* synthetic */ j9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ch7 apply(Object obj) {
        switch (this.a) {
            case 10:
                Void voidR = (Void) obj;
                ww1 ww1 = (ww1) this.b;
                ww1.a();
                ((xc4) this.c).a();
                return ww1.m();
            default:
                es1 es1 = (es1) this.b;
                es1.getClass();
                return hwf.f(new vd4((ch7) this.c, es1.c, TimeUnit.SECONDS.toMillis(3)));
        }
    }
}
