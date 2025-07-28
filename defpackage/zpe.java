package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: zpe  reason: default package */
public final class zpe {
    public final /* synthetic */ t97 a;
    public final /* synthetic */ t97 b;
    public final /* synthetic */ t97 c;
    public final /* synthetic */ t97 d;
    public final /* synthetic */ t97 e;
    public final /* synthetic */ t97 f;
    public final /* synthetic */ t97 g;

    public zpe(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, r7e r7e) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = r7e;
        this.f = t975;
        this.g = t976;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [a07, java.lang.Object] */
    public final void a(hi5 hi5) {
        bd bdVar = (bd) this.a.getValue();
        wd3 b2 = ((ed3) this.b.getValue()).b();
        boolean d2 = ((rf4) this.c.getValue()).d();
        if (!bdVar.a().c()) {
            ? obj = new Object();
            obj.c = "NET";
            obj.o = (String) hi5.e;
            int i = hi5.d;
            if (i != 0) {
                obj.b(Integer.valueOf(i), "sent");
            }
            long j = hi5.c;
            if (j != 0) {
                obj.b(Long.valueOf(j), "respTime");
            }
            if (hi5.b) {
                obj.b(Boolean.TRUE, "error");
            }
            String str = (String) hi5.f;
            if (!r1g.p(str)) {
                obj.b(str, "value");
            }
            obj.b(Boolean.valueOf(d2), "background");
            obj.b(b2.a(), "conn");
            bdVar.j(obj.d());
        }
    }

    public final long b() {
        ((rf4) this.c.getValue()).getClass();
        return SystemClock.elapsedRealtime();
    }

    public final wd3 c() {
        return ((ed3) this.b.getValue()).b();
    }

    public final void d(String str) {
        ((g15) this.d.getValue()).c(new Exception(str), true);
    }

    public final void e(Throwable th) {
        ((g15) this.d.getValue()).c(new ExceptionHandler$HandledException((String) null, th, 1, "ONEME-11028"), true);
    }

    public final boolean f(String str, String str2) {
        vqc vqc = (vqc) ((xh0) ((u98) this.g.getValue())).c;
        vqc.getClass();
        int o = (int) vqc.o(PmsKey.f78minstickersize, (long) 432);
        int o2 = (int) vqc.o(PmsKey.f69maxstickersize, (long) 512);
        int i = at7.z0;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int height = decodeFile.getHeight();
        int width = decodeFile.getWidth();
        if (height >= o && height <= o2 && width >= o && width <= o2) {
            return false;
        }
        Bitmap K = at7.K(o, o2, decodeFile);
        int e2 = new v25(str).e(1, "Orientation");
        try {
            at7.N(str2, K, 100, Bitmap.CompressFormat.PNG);
            K.recycle();
            decodeFile.recycle();
            v25 v25 = new v25(str2);
            v25.F("Orientation", String.valueOf(e2));
            v25.B();
            return true;
        } catch (Throwable th) {
            if (K != null) {
                K.recycle();
            }
            decodeFile.recycle();
            throw th;
        }
    }
}
