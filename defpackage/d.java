package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;

/* renamed from: d  reason: default package */
public final class d implements ll7, bc9 {
    public final boolean A0;
    public final fe1 B0;
    public final CopyOnWriteArraySet C0 = new CopyOnWriteArraySet();
    public volatile jl7 D0;
    public volatile VideoSink E0;
    public final zk7 F0;
    public final ufc G0;
    public final eje H0;
    public final rgc I0;
    public final ygd J0;
    public qu1 K0 = null;
    public qqe L0;
    public final cc9 X;
    public final Context Y;
    public final String Z;
    public final EglBase.Context a;
    public final ow0 b;
    public final ocd c;
    public final k40 o;
    public final String w0;
    public final String x0;
    public final Integer y0;
    public final xwb z0;

    public d(kcd kcd) {
        xwb xwb = kcd.e;
        this.z0 = xwb;
        this.c = kcd.a;
        this.o = kcd.b;
        this.y0 = kcd.j;
        this.Y = kcd.d;
        this.X = kcd.c;
        this.a = kcd.l;
        this.A0 = kcd.k;
        this.B0 = kcd.f;
        this.b = kcd.g;
        this.F0 = kcd.m;
        this.G0 = kcd.o;
        if (!TextUtils.isEmpty(kcd.i)) {
            this.w0 = wn6.l(new StringBuilder(), kcd.i, "v0");
            this.x0 = wn6.l(new StringBuilder(), kcd.i, "a0");
            this.Z = kcd.i;
        } else {
            this.w0 = "ARDAMSv0";
            this.x0 = "ARDAMSa0";
            this.Z = "ARDAMS";
        }
        xwb.log("SlmsSource", "local media stream id = " + this.Z + " local video track id = " + this.w0 + " local audio track id = " + this.x0);
        this.H0 = kcd.n;
        this.I0 = kcd.p;
        this.J0 = kcd.h;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [il7, java.lang.Object] */
    public final xp0 a() {
        boolean z = this.D0 == null;
        if (z) {
            ? obj = new Object();
            obj.o = false;
            obj.s = null;
            obj.t = false;
            obj.a = this.c.d;
            obj.c = this.c.a;
            obj.b = this.o;
            obj.e = this.Z;
            obj.f = this.w0;
            obj.g = this.x0;
            obj.d = this.Y.getApplicationContext();
            obj.h = this.z0;
            obj.i = this.a;
            obj.k = true;
            obj.j = this.b;
            obj.p = this.A0;
            fe1 fe1 = this.B0;
            obj.l = fe1.s;
            zk7 zk7 = this.F0;
            obj.q = zk7;
            obj.m = this.G0;
            obj.s = this.y0;
            de1 de1 = fe1.B;
            obj.t = de1.a;
            obj.o = de1.k;
            obj.n = this.H0;
            obj.r = this.J0;
            if (obj.a == null || zk7 == null || obj.b == null || TextUtils.isEmpty(obj.e) || TextUtils.isEmpty(obj.f) || TextUtils.isEmpty(obj.g) || obj.h == null || obj.j == null || obj.i == null || obj.m == null || obj.n == null || obj.r == null) {
                throw new IllegalStateException();
            }
            this.D0 = new jl7(obj);
            this.D0.x = this.L0;
            this.D0.c.add(this);
            if (this.K0 != null) {
                this.D0.l(this.K0);
            }
            VideoSink videoSink = this.E0;
            if (videoSink != null) {
                this.D0.k(videoSink);
            }
            this.D0.d(this.X);
            rgc rgc = this.I0;
            if (rgc != null) {
                jl7 jl7 = this.D0;
                jl7.getClass();
                ((d4b) rgc.b).c = new hl7(jl7);
            }
        }
        return new xp0(this.D0, z);
    }

    public final void b(jl7 jl7) {
        this.z0.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((ll7) it.next()).b(jl7);
        }
    }

    public final int c() {
        jl7 jl7 = this.D0;
        if (jl7 == null) {
            return 0;
        }
        at1 at1 = jl7.r;
        if (at1 != null && at1.k) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) jl7.y.X;
            if (mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) {
                return at1.i ? 1 : 2;
            }
        }
        pnc pnc = jl7.t;
        if (pnc == null || !pnc.d) {
            return 0;
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) jl7.z.X;
        return mediaStreamTrack2 != null ? mediaStreamTrack2.enabled() : false ? 3 : 0;
    }

    public final void j(cc9 cc9) {
        this.z0.log("SlmsSource", "onMediaSettingsChanged, " + cc9);
        this.c.a.execute(new c(this, 1, cc9));
    }
}
