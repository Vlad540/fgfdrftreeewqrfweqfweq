package defpackage;

import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: hg1  reason: default package */
public final /* synthetic */ class hg1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ hg1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [kv2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8, types: [bc1, f6c] */
    public final Object invoke() {
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                smc smc = CallScreen.T0;
                return new og1(callScreen);
            case 1:
                smc smc2 = CallScreen.T0;
                return udd.C(callScreen.getContext());
            case 2:
                smc smc3 = CallScreen.T0;
                return new l11(callScreen.getContext());
            case 3:
                smc smc4 = CallScreen.T0;
                bh1 bh1 = bh1.a;
                Class<iq1> cls = iq1.class;
                r7e d = bh1.getAccessor().d(cls);
                po1 b2 = bh1.b();
                t97 t97 = mqc.a;
                r7e d2 = bh1.getAccessor().d(xk1.class);
                r7e r7e = callScreen.c;
                tz0 tz0 = new tz0(d2, (ync) r7e.getValue());
                r7e r7e2 = callScreen.o;
                ? obj = new Object();
                obj.a = (fna) callScreen.X.getValue();
                obj.b = (l11) r7e2.getValue();
                obj.c = zw3.k;
                obj.o = new bka(qja.c);
                obj.X = k11.g;
                obj.Z = ea.h;
                xk1 xk1 = new xk1(callScreen.getContext());
                bh1.getAccessor().d(f03.class);
                Class<jb5> cls2 = jb5.class;
                r7e d3 = bh1.getAccessor().d(cls2);
                po1 b3 = bh1.b();
                r7e d4 = bh1.getAccessor().d(vx0.class);
                return new aj1(d, (fna) callScreen.X.getValue(), b2, tz0, obj, xk1, new yl1(new hg1(callScreen, 10), b3, bh1.getAccessor().d(cls), d4, nqc.a.getAccessor().d(cls2)), (l11) r7e2.getValue(), (ync) r7e.getValue(), d3);
            case 4:
                smc smc5 = CallScreen.T0;
                rs3 rs3 = new rs3();
                rs3.h = new ig1(callScreen, 1);
                rs3.i = new ig1(callScreen, 2);
                return rs3;
            case 5:
                smc smc6 = CallScreen.T0;
                ViewStub viewStub = new ViewStub(callScreen.getContext());
                viewStub.setId(uob.call_bottom_unavailable_control);
                return viewStub;
            case 6:
                smc smc7 = CallScreen.T0;
                return new pg1(callScreen);
            case 7:
                smc smc8 = CallScreen.T0;
                c11 c11 = new c11(callScreen.getContext(), (AttributeSet) null);
                c11.setLayoutParams(new re3(-1, 0));
                c11.setVisibility(8);
                return c11;
            case 8:
                smc smc9 = CallScreen.T0;
                return new yg1(callScreen);
            case 9:
                smc smc10 = CallScreen.T0;
                return Integer.valueOf(((ync) callScreen.c.getValue()).a);
            case 10:
                smc smc11 = CallScreen.T0;
                return callScreen.getViewLifecycleScope();
            case 11:
                smc smc12 = CallScreen.T0;
                return new xg1(callScreen);
            case 12:
                smc smc13 = CallScreen.T0;
                return new jg1(0, callScreen);
            case 13:
                t97 t972 = callScreen.I0;
                t97 t973 = callScreen.C0;
                return new bc1(callScreen.B0, (yg1) callScreen.F0.getValue(), (pg1) callScreen.G0.getValue(), (xg1) callScreen.H0.getValue(), (bk1) callScreen.Y.getValue(), t972, t973, (al1) callScreen.z0().T0.getValue(), (f5f) callScreen.z0().P0.getValue(), (b) callScreen.z0().S0.getValue());
            case 14:
                smc smc14 = CallScreen.T0;
                ViewPager2 viewPager2 = new ViewPager2(callScreen.getContext());
                viewPager2.setId(uob.call_modes_view_pager);
                viewPager2.setAdapter((bc1) callScreen.J0.getValue());
                viewPager2.setLayoutParams(new re3(-1, -1));
                viewPager2.setOrientation(1);
                return viewPager2;
            case 15:
                smc smc15 = CallScreen.T0;
                ViewStub viewStub2 = new ViewStub(callScreen.getContext());
                viewStub2.setId(uob.call_user_talking_view_label);
                return viewStub2;
            case 16:
                smc smc16 = CallScreen.T0;
                zj1 zj1 = new zj1(callScreen.getContext(), (AttributeSet) null);
                zj1.setLayoutParams(new re3(-1, -2));
                zj1.setVisibility(8);
                boolean isLaidOut = zj1.isLaidOut();
                dwa dwa = callScreen.B0;
                if (!isLaidOut || zj1.isLayoutRequested()) {
                    zj1.addOnLayoutChangeListener(new ng1(callScreen, 0));
                } else {
                    dwa.c();
                }
                zj1.setControlsMediator(callScreen.u0());
                zj1.setCallSpeakerMediator((bk1) callScreen.Y.getValue());
                zj1.setPipBoundariesController(dwa);
                callScreen.u0().a.add(zj1);
                dwa.a(zj1, cwa.a);
                return zj1;
            case 17:
                smc smc17 = CallScreen.T0;
                ViewStub viewStub3 = new ViewStub(callScreen.getContext());
                viewStub3.setId(uob.call_change_mode_tip_view);
                return viewStub3;
            default:
                smc smc18 = CallScreen.T0;
                g11 g11 = new g11(callScreen.getContext());
                g11.setVisibility(8);
                g11.setTranslationY(dh4.c().getDisplayMetrics().density * -50.0f);
                return g11;
        }
    }
}
