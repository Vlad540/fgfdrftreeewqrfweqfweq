package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: xd4  reason: default package */
public final /* synthetic */ class xd4 implements be4, bid {
    public final /* synthetic */ long X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ xd4(Object obj, Object obj2, long j, long j2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = j;
        this.X = j2;
        this.Y = obj3;
    }

    public ScheduledFuture b(c9 c9Var) {
        switch (this.a) {
            case 0:
                ae4 ae4 = (ae4) this.b;
                ae4.getClass();
                return ae4.b.scheduleAtFixedRate(new yd4(ae4, (Runnable) this.c, c9Var, 0), this.o, this.X, (TimeUnit) this.Y);
            default:
                ae4 ae42 = (ae4) this.b;
                ae42.getClass();
                return ae42.b.scheduleWithFixedDelay(new yd4(ae42, (Runnable) this.c, c9Var, 2), this.o, this.X, (TimeUnit) this.Y);
        }
    }

    public void j(ihd ihd) {
        tl7 tl7;
        ihd ihd2 = ihd;
        l8f l8f = (l8f) this.b;
        l8f.getClass();
        o10 o10 = (o10) this.c;
        boolean i = o10.i();
        boolean L = ete.L(o10);
        String b2 = l8f.b(o10);
        boolean p = r1g.p(b2);
        Context context = l8f.b;
        if (!p) {
            tl7 = new tl7(context, b2);
        } else {
            if (i || L) {
                n10 n10 = o10.d;
                if (!i || !r1g.p(n10.h)) {
                    l8f l8f2 = l8f;
                    if (L) {
                        udd.p("VideoRipper", "buildFetcher: video file", new Object[0]);
                        l8f = l8f2;
                        tl7 = new jg5(l8f.h, l8f.f, l8f.i, o10.j.a);
                    } else {
                        l8f = l8f2;
                        String str = n10.h;
                        if (pvf.b(str)) {
                            udd.p("VideoRipper", "buildFetcher: youtube video", new Object[0]);
                            tl7 = new pvf(context, str);
                        } else {
                            String b3 = xcf.b(str);
                            if (!r1g.p(b3)) {
                                udd.p("VideoRipper", "buildFetcher: vimeo", new Object[0]);
                                tl7 = new xcf(b3);
                            } else {
                                String b4 = vy6.b(str);
                                if (!r1g.p(b4)) {
                                    udd.p("VideoRipper", "buildFetcher: instagram", new Object[0]);
                                    tl7 = new vy6(b4);
                                } else {
                                    udd.R("VideoRipper", (IOException) null, "buildFetcher: unknown type! null", Arrays.copyOf(new Object[0], 0));
                                }
                            }
                        }
                    }
                } else {
                    udd.p("VideoRipper", "buildFetcher: video from ok", new Object[0]);
                    tl7 = new zz6(l8f.j, l8f.i, l8f.e, l8f.k, l8f.h, n10.a, this.o, this.X, n10.m);
                    l8f = l8f;
                }
            }
            tl7 = null;
        }
        if (tl7 == null) {
            if (o10.w != c10.b) {
                ihd ihd3 = ihd;
                bd bdVar = (bd) l8f.c.get();
                if (bdVar != null) {
                    bdVar.g("ACTION_VIDEO_FETCH_UNSUPPORTED", ((n10) this.Y).h);
                }
                if (!ihd.h()) {
                    ihd3.onError(new FetcherException(3, "Unsupported video hosting"));
                }
            } else if (!ihd.h()) {
                ihd.onError(new FetcherException(9, "video is processing"));
            }
        } else {
            ihd ihd4 = ihd;
            if (!ihd.h()) {
                ihd4.a(tl7);
            }
        }
    }
}
