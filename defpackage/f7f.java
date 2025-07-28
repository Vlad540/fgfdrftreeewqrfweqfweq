package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: f7f  reason: default package */
public final class f7f extends ol implements qce, tna {
    public final boolean A0;
    public final String B0 = f7f.class.getName();
    public final r7e C0 = new r7e(new q6e(9, this));
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String w0;
    public final boolean x0;
    public final boolean y0;
    public final String z0;

    public f7f(long j, long j2, long j3, long j4, long j5, String str, boolean z, boolean z2, String str2, boolean z3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.w0 = str;
        this.x0 = z;
        this.y0 = z2;
        this.z0 = str2;
        this.A0 = z3;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [tde, java.lang.Object] */
    public final void c(lbe lbe) {
        g7f g7f = (g7f) lbe;
        if (this.x0) {
            Map map = g7f.c;
            nu7 nu7 = am7.c;
            if (map.size() != 1 || !map.containsKey("EXTERNAL")) {
                ? obj = new Object();
                obj.a = this.Z;
                obj.b = this.w0;
                obj.c = this.o;
                obj.g = am7.m(g7f.c);
                obj.h = true;
                obj.n = !this.y0;
                ude ude = new ude(obj);
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((jc5) plVar.G.getValue()).a(ude);
                return;
            }
            return;
        }
        l().c(new h7f(this.a, this.o, this.Z, this.w0, g7f.c));
    }

    public final void d(uae uae) {
        vo8 q = p().q(this.Z);
        if (q == null || q.z0 == ls8.DELETED) {
            l().c(new jh0(this.a, uae));
            f();
            return;
        }
        if ("attachment.token.expired".equals(uae.b)) {
            udd.s(this.B0, "videoPlayCmd failed with token expired, retry videoPlayCmd", (Throwable) null);
            if (this.A0) {
                l().c(new jh0(this.a, uae));
            } else {
                i7f i7f = (i7f) this.C0.getValue();
                synchronized (i7f) {
                    if (i7f.b == -1) {
                        i7f.a.l().d(i7f);
                        pk j = i7f.a.j();
                        f7f f7f = i7f.a;
                        i7f.b = ((gy9) j).E(f7f.X, Collections.singletonList(Long.valueOf(f7f.Y)));
                    }
                }
            }
        } else if ("video.not.found".equals(uae.b)) {
            udd.s(this.B0, "videoPlayCmd failed, set attach status to ERROR", (Throwable) null);
            p().v(this.Z, this.w0, new are(25));
            l().c(new ove(q.x0, q.b, 0));
        }
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = defpackage.ls8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r4 = this;
            long r0 = r4.Z
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            to8 r4 = r4.p()
            vo8 r4 = r4.q(r0)
            if (r4 == 0) goto L_0x0018
            ls8 r0 = defpackage.ls8.DELETED
            ls8 r4 = r4.z0
            if (r4 != r0) goto L_0x001a
        L_0x0018:
            r4 = 3
            return r4
        L_0x001a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7f.e():int");
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.VideoPlay videoPlay = new Tasks.VideoPlay();
        videoPlay.requestId = this.a;
        videoPlay.videoId = this.o;
        videoPlay.chatServerId = this.X;
        videoPlay.messageServerId = this.Y;
        videoPlay.messageId = this.Z;
        String str = this.w0;
        if (str != null) {
            videoPlay.attachLocalId = str;
        }
        videoPlay.startDownload = this.x0;
        videoPlay.saveToGallery = this.y0;
        videoPlay.token = this.z0;
        return gr8.toByteArray(videoPlay);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_VIDEO_PLAY;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        return new bm9(this.z0, this.o, this.X, this.Y);
    }
}
