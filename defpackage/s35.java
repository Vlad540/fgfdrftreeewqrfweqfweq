package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.transformer.ExportException;

/* renamed from: s35  reason: default package */
public final class s35 implements hya {
    public final zs a;
    public final /* synthetic */ ci9 b;

    public s35(ci9 ci9, zs zsVar) {
        this.b = ci9;
        this.a = zsVar;
    }

    public final void X(spe spe) {
        zs zsVar = this.a;
        try {
            int b2 = spe.b(1);
            if (spe.b(2)) {
                b2++;
            }
            if (b2 > 0) {
                zsVar.b(b2);
                ((n45) this.b.c).play();
                return;
            }
            zsVar.d(ExportException.a(new IllegalStateException("The asset loader has no track to output."), 1001));
        } catch (RuntimeException e) {
            zsVar.d(ExportException.a(e, 1000));
        }
    }

    public final void f0(vje vje, int i) {
        int i2;
        zs zsVar = this.a;
        ci9 ci9 = this.b;
        try {
            if (ci9.b == 1) {
                tje tje = new tje();
                vje.o(0, tje);
                if (!tje.k) {
                    long j = tje.m;
                    if (j > 0) {
                        if (j != -9223372036854775807L) {
                            i2 = 2;
                            ci9.b = i2;
                            zsVar.f(j);
                        }
                    }
                    i2 = 3;
                    ci9.b = i2;
                    zsVar.f(j);
                }
            }
        } catch (RuntimeException e) {
            zsVar.d(ExportException.a(e, 1000));
        }
    }

    public final void x0(PlaybackException playbackException) {
        int i = 1000;
        Object obj = ExportException.b.get(playbackException.b());
        if (obj != null) {
            i = obj;
        }
        this.a.d(ExportException.a(playbackException, ((Integer) i).intValue()));
    }
}
