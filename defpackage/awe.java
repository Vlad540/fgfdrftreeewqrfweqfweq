package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: awe  reason: default package */
public final /* synthetic */ class awe implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ewe b;
    public final /* synthetic */ wve c;

    public /* synthetic */ awe(ewe ewe, wve wve, int i) {
        this.a = i;
        this.b = ewe;
        this.c = wve;
    }

    public final Object call() {
        wve wve = this.c;
        ewe ewe = this.b;
        int i = this.a;
        ewe.getClass();
        switch (i) {
            case 0:
                vve b2 = wve.b();
                String str = wve.b;
                zpe zpe = ewe.g;
                try {
                    udd.p("ewe", "resizeSticker: path = %s", new Object[]{str});
                    File a2 = ((bf5) zpe.f.getValue()).a("png");
                    if (zpe.f(str, a2.getAbsolutePath())) {
                        udd.p("ewe", "resizeSticker: resized for path = %s", new Object[]{str});
                        str = a2.getAbsolutePath();
                    } else {
                        udd.p("ewe", "resizeSticker: no resize needed for path = %s", new Object[]{str});
                    }
                } catch (IOException e) {
                    udd.s("ewe", "resizeSticker: failed", e);
                }
                b2.b = str;
                return new wve(b2);
            default:
                vve b3 = wve.b();
                String str2 = wve.b;
                zpe zpe2 = ewe.g;
                try {
                    udd.p("ewe", "resizePhoto: path = %s", new Object[]{str2});
                    File a3 = ((bf5) zpe2.f.getValue()).a("jpg");
                    if (at7.I(((xh0) ((u98) zpe2.g.getValue())).c, str2, a3.getAbsolutePath())) {
                        udd.p("ewe", "resizePhoto: resized for path = %s", new Object[]{str2});
                        str2 = a3.getAbsolutePath();
                    } else {
                        udd.p("ewe", "resizePhoto: no resize needed for path = %s", new Object[]{str2});
                    }
                } catch (IOException e2) {
                    udd.s("ewe", "resizePhoto: failed", e2);
                }
                b3.b = str2;
                return new wve(b3);
        }
    }
}
