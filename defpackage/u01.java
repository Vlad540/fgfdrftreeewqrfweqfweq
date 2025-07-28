package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: u01  reason: default package */
public final class u01 extends taf {
    public final s01 A0;
    public final t97 X;
    public final t97 Y;
    public final bc Z;
    public final jrf b;
    public final aj1 c;
    public final t97 o;
    public final bc w0;
    public final grd x0;
    public final t0c y0;
    public final uv z0;

    /* JADX WARNING: type inference failed for: r5v2, types: [m26, l5e] */
    public u01(jrf jrf, aj1 aj1) {
        r7e d = z11.a.getAccessor().d(qna.class);
        bh1 bh1 = bh1.a;
        r7e d2 = bh1.getAccessor().d(po1.class);
        r7e d3 = bh1.getAccessor().d(iq1.class);
        r7e d4 = bh1.getAccessor().d(jb5.class);
        this.b = jrf;
        this.c = aj1;
        this.o = d2;
        this.X = d;
        this.Y = d3;
        pj5 z = ez3.z(new v11(aj1.L0, aj1.M0, new j01(3, (Continuation) null, 0), 4));
        this.Z = ez3.s((dcd) ((po1) d2.getValue()).t.getValue(), z, ((py0) ((po1) d2.getValue()).l).F0, new l5e(4, (Continuation) null));
        this.w0 = ez3.r(new uv(((po1) d2.getValue()).e(), 9), z, new uv(((po1) d2.getValue()).o, 10), new uv(((po1) d2.getValue()).b(), 11), new l01(d4, (Continuation) null));
        hy7 hy7 = hy7.X;
        grd a = hrd.a(new wp0(hy7, hy7, hy7, new j31(CallsAudioDeviceInfo.Companion.getNONE())));
        this.x0 = a;
        this.y0 = new t0c(a);
        t0c t0c = aj1.G0;
        this.z0 = new uv(t0c, 12);
        this.A0 = new s01(new djc(new lk5(TimeUnit.MILLISECONDS, (Continuation) null)), d2, 0);
        ez3.N(ez3.s((zqd) ((po1) d2.getValue()).q.getValue(), t0c, new uv(((po1) d2.getValue()).e(), 13), new i01(this, d4, (Continuation) null)), this.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r0.getAvailableAudioDevices();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList q() {
        /*
            r4 = this;
            po1 r0 = r4.r()
            qz0 r0 = r0.b
            rz0 r0 = (defpackage.rz0) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            java.lang.Object r0 = r0.get()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager r0 = (ru.ok.android.externcalls.sdk.audio.CallsAudioManager) r0
            if (r0 == 0) goto L_0x001d
            java.util.List r0 = r0.getAvailableAudioDevices()
            if (r0 == 0) goto L_0x001d
            java.util.Set r0 = defpackage.o23.w0(r0)
            goto L_0x001f
        L_0x001d:
            qw4 r0 = defpackage.qw4.a
        L_0x001f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.q23.H(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r0.next()
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r2 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r2
            aj1 r3 = r4.c
            boolean r3 = r3.u()
            l31 r2 = defpackage.au7.b(r2, r3)
            r1.add(r2)
            goto L_0x002e
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u01.q():java.util.ArrayList");
    }

    public final po1 r() {
        return (po1) this.o.getValue();
    }

    public final void s(hy7 hy7) {
        if (hy7 != hy7.c) {
            t97 t97 = this.X;
            String[] strArr = qna.h;
            if (!((qna) t97.getValue()).b(strArr)) {
                qna qna = (qna) t97.getValue();
                int i = r1a.E;
                qna.getClass();
                int i2 = iub.permissions_audio_title;
                int i3 = baa.g;
                jrf jrf = this.b;
                if (qna.i(jrf, strArr)) {
                    jrf.c(strArr, 160, i2, i, i3);
                } else {
                    qna.f(jrf, strArr, 160);
                }
            } else {
                iq1 iq1 = (iq1) this.Y.getValue();
                String str = r().c().c;
                hy7 hy72 = hy7.b;
                boolean z = false;
                int i4 = hy7 == hy72 ? 1 : 0;
                boolean z2 = r().c().h;
                iq1.getClass();
                iq1.c(iq1, "AUDIO_ENABLED", str, (String) null, Integer.valueOf(i4), (String) null, (String) null, z2, 52);
                po1 r = r();
                if (hy7 == hy72) {
                    z = true;
                }
                MicrophoneManager c2 = ((rz0) r.b).c();
                if (c2 != null) {
                    c2.setMicEnabled(z);
                }
                if (z) {
                    ((lc9) r.r.getValue()).g(Boolean.FALSE);
                }
            }
        } else if (!((ea) ((py0) r().l).F0.getValue()).c) {
            taf.o(this.c.Q0, wh1.b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = r1.getAvailableAudioDevices();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r6 = this;
            po1 r6 = r6.r()
            qz0 r0 = r6.b
            rz0 r0 = (defpackage.rz0) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.c
            java.lang.Object r1 = r1.get()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager r1 = (ru.ok.android.externcalls.sdk.audio.CallsAudioManager) r1
            if (r1 == 0) goto L_0x001d
            java.util.List r1 = r1.getAvailableAudioDevices()
            if (r1 == 0) goto L_0x001d
            java.util.Set r1 = defpackage.o23.w0(r1)
            goto L_0x001f
        L_0x001d:
            qw4 r1 = defpackage.qw4.a
        L_0x001f:
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0027
            goto L_0x005a
        L_0x0027:
            int r2 = r1.size()
            r4 = 3
            if (r2 >= r4) goto L_0x0059
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r0 = r0.b()
            java.util.Iterator r1 = r1.iterator()
        L_0x0036:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r1.next()
            r4 = r2
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r4 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r4
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r4 = r4.getDeviceType()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r5 = r0.getDeviceType()
            if (r4 == r5) goto L_0x0036
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r2 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r2
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r0 = r2
        L_0x0055:
            r6.j(r0)
            goto L_0x005a
        L_0x0059:
            r3 = 1
        L_0x005a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u01.t():boolean");
    }

    public final void u(hy7 hy7) {
        if (hy7 != hy7.c) {
            t97 t97 = this.X;
            boolean b2 = ((qna) t97.getValue()).b(qna.l);
            t97 t972 = this.Y;
            if (!b2) {
                iq1 iq1 = (iq1) t972.getValue();
                String str = r().c().c;
                boolean z = r().c().h;
                iq1.getClass();
                iq1.c(iq1, "REQUEST_PERMISSION_CAM", str, "DURING_CALL", (Integer) null, (String) null, (String) null, z, 56);
                ((qna) t97.getValue()).h(this.b);
            } else if (!r().h.c()) {
                iq1 iq12 = (iq1) t972.getValue();
                String str2 = r().c().c;
                hy7 hy72 = hy7.b;
                boolean z2 = false;
                int i = hy7 == hy72 ? 1 : 0;
                boolean z3 = r().c().h;
                iq12.getClass();
                iq1.c(iq12, "VIDEO_ENABLED", str2, (String) null, Integer.valueOf(i), (String) null, (String) null, z3, 52);
                po1 r = r();
                if (hy7 == hy72) {
                    z2 = true;
                }
                r.g(z2);
            }
        } else if (!((ea) ((py0) r().l).F0.getValue()).b) {
            taf.o(this.c.Q0, wh1.c);
        }
    }
}
