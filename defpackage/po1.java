package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: po1  reason: default package */
public final class po1 {
    public static final /* synthetic */ k77[] y;
    public final so1 a;
    public final qz0 b;
    public final dq4 c;
    public final aka d;
    public final d11 e;
    public final n11 f;
    public final eq1 g;
    public final nnc h;
    public final boc i;
    public final mib j;
    public final ro1 k;
    public final vx0 l;
    public final t97 m;
    public final grd n;
    public final t0c o;
    public final r7e p = new r7e(new go1(this, 0));
    public final r7e q = new r7e(new go1(this, 1));
    public final r7e r = new r7e(new di1(20));
    public final p14 s;
    public final r7e t;
    public final r7e u;
    public final e3 v;
    public final ck5 w;
    public final r7e x;

    static {
        hc9 hc9 = new hc9(po1.class, "vpnStatusJob", "getVpnStatusJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        y = new k77[]{hc9};
    }

    public po1(so1 so1, qz0 qz0, dq4 dq4, aka aka, d11 d11, n11 n11, eq1 eq1, nnc nnc, boc boc, mib mib, ro1 ro1, vx0 vx0, t97 t97, ed3 ed3) {
        so1 so12 = so1;
        ro1 ro12 = ro1;
        this.a = so12;
        this.b = qz0;
        this.c = dq4;
        this.d = aka;
        this.e = d11;
        this.f = n11;
        this.g = eq1;
        this.h = nnc;
        this.i = boc;
        this.j = mib;
        this.k = ro12;
        this.l = vx0;
        this.m = t97;
        grd a2 = hrd.a(new lm1(false, (raf) null, 127));
        this.n = a2;
        this.o = new t0c(a2);
        int i2 = p14.g;
        int i3 = zp4.o;
        this.s = new p14(new o14(mt0.P(10, eq4.SECONDS)), new tg0(2, new go1(this, 2)), (u16) null);
        this.t = new r7e(new go1(this, 3));
        this.u = new r7e(new go1(this, 4));
        this.v = hwf.t();
        this.w = new ck5(ez3.z(ez3.h(new no1(ed3, (Continuation) null))), new oo1(this, (Continuation) null), 5);
        this.x = new r7e(new go1(this, 5));
        ((ep1) so12).d(new ho1(this));
        ez3.N(new ck5(new ik5(ez3.z(new zi1(e(), 1)), 2), new io1(this, (Continuation) null), 5), ro12);
    }

    public final void a(raf raf) {
        grd grd;
        Object value;
        do {
            grd = this.n;
            value = grd.getValue();
        } while (!grd.b(value, lm1.a((lm1) value, (le1) null, (le1) null, (le1) null, raf, false, (vye) null, 111)));
    }

    public final grd b() {
        return ((ep1) this.a).I;
    }

    public final zw3 c() {
        return (zw3) ((ep1) this.a).I.getValue();
    }

    public final qja d() {
        return ((oka) this.d).c();
    }

    public final zqd e() {
        return ((oka) this.d).A0;
    }

    public final grd f() {
        return ((doc) this.i).Z;
    }

    public final void g(boolean z) {
        if (!this.h.c()) {
            CameraManager a2 = this.e.a();
            if (a2 != null) {
                a2.setCameraEnabled(z);
            }
            CallsAudioManager callsAudioManager = (CallsAudioManager) ((rz0) this.b).c.get();
            if (callsAudioManager != null) {
                CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, z, false, (s16) null, (u16) null, 12, (Object) null);
            }
        }
    }

    public final void h(le1 le1, boolean z) {
        grd grd;
        Object value;
        lm1 lm1;
        le1 le12;
        do {
            grd = this.n;
            value = grd.getValue();
            lm1 = (lm1) value;
            le12 = (!z && hhd.f(lm1.a, le1)) ? null : le1;
        } while (!grd.b(value, lm1.a(lm1, le12, (le1) null, (le1) null, le12 != null ? raf.a : lm1.e, false, (vye) null, 110)));
    }

    public final void i(le1 le1) {
        grd grd;
        Object value;
        do {
            grd = this.n;
            value = grd.getValue();
        } while (!grd.b(value, lm1.a((lm1) value, (le1) null, le1, (le1) null, (raf) null, false, (vye) null, 125)));
    }

    public final void j(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        iq1 iq1 = (iq1) this.m.getValue();
        String str = c().c;
        int i2 = jo1.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        String str2 = i2 != 1 ? i2 != 2 ? "HEADPHONES" : "DYNAMIC" : "PHONE";
        boolean z = c().h;
        iq1.getClass();
        iq1.c(iq1, "SPEAKER_MODE_CHANGED", str, str2, (Integer) null, (String) null, (String) null, z, 56);
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((rz0) this.b).c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.setAudioDeviceAsync$default(callsAudioManager, callsAudioDeviceInfo, (s16) null, (u16) null, 6, (Object) null);
        }
    }

    public final void k() {
        Object value;
        rz0 rz0;
        mc9 mc9 = (mc9) this.p.getValue();
        do {
            value = mc9.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
            rz0 = (rz0) this.b;
        } while (!mc9.b(value, rz0.b()));
        rgc rgc = new rgc(21, this);
        CallsAudioManager callsAudioManager = (CallsAudioManager) rz0.c.get();
        if (callsAudioManager != null) {
            callsAudioManager.setOnAudioDeviceChangeListener(rgc);
        }
    }

    public final void l() {
        AudioLevelListener audioLevelListener = (AudioLevelListener) this.u.getValue();
        rz0 rz0 = (rz0) this.b;
        rz0.getClass();
        try {
            MicrophoneManager c2 = rz0.c();
            if (c2 != null) {
                c2.registerAudioSampleCallback(250, audioLevelListener);
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            udd.S("CallAudioController", "CallAudioController can't register mic audio listener due to: " + message + ".", e2);
        }
    }

    public final void m(vye vye) {
        Object value;
        grd grd = this.n;
        if (((lm1) grd.getValue()).g != vye.c || vye == vye.o) {
            do {
                value = grd.getValue();
            } while (!grd.b(value, lm1.a((lm1) value, (le1) null, (le1) null, (le1) null, (raf) null, false, vye, 63)));
        }
    }
}
