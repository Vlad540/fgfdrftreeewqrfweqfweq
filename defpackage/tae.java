package defpackage;

import java.io.File;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: tae  reason: default package */
public final class tae implements dd3 {
    public long A0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public pn1 w0;
    public c97 x0;
    public ea6 y0;
    public int z0;

    public tae(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.o = t974;
        this.X = t975;
        this.Y = t976;
        this.Z = t977;
    }

    public final void a() {
    }

    public final void b() {
        if (((ed3) this.Z.getValue()).b() != wd3.c) {
            tic.b(this.x0);
            ea6 ea6 = this.y0;
            if (ea6 != null) {
                int i = this.z0;
                udd.p(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", new Object[]{Integer.valueOf(i)});
                ((LoadEmojiFontWorker) ea6.b).state = new si7(i);
                return;
            }
            return;
        }
        c(this.y0);
    }

    public final void c(ea6 ea6) {
        udd.q("tae", "Load font");
        this.y0 = ea6;
        if (!tic.c(this.w0)) {
            udd.q("tae", "Font already loading");
            return;
        }
        mv9 mv9 = new mv9(2, new m5(15, this));
        mbe mbe = (mbe) this.X.getValue();
        mbe.getClass();
        yhd i = mv9.m(((nbe) mbe).a()).i(cnc.d);
        pn1 pn1 = new pn1(new rae(this, ea6, 0), 2, new rae(this, ea6, 1));
        i.k(pn1);
        this.w0 = pn1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [nxc, java.lang.Object, ot4] */
    public final void d(File file, ea6 ea6) {
        udd.q("tae", "Tam emoji font loaded");
        t97 t97 = this.X;
        t97 t972 = this.Y;
        ? obj = new Object();
        obj.a = file;
        obj.b = t97;
        obj.c = t972;
        tt5 tt5 = new tt5(obj);
        if (ea6 != null) {
            udd.p(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontSuccess %s", new Object[]{tt5});
            ((LoadEmojiFontWorker) ea6.b).state = new ti7(tt5);
        }
        ((ed3) this.Z.getValue()).e(this);
        this.y0 = null;
    }
}
