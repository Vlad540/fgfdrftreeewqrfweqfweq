package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: pt4  reason: default package */
public final class pt4 {
    public static final Object o = new Object();
    public static volatile pt4 p;
    public final ReentrantReadWriteLock a;
    public final bs b;
    public volatile int c = 3;
    public final Handler d;
    public final lt4 e;
    public final ot4 f;
    public final qr4 g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final w74 n;

    public pt4(tt5 tt5) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.h = tt5.b;
        this.i = tt5.c;
        this.j = tt5.d;
        this.k = tt5.f;
        this.l = -16711936;
        ot4 ot4 = tt5.a;
        this.f = ot4;
        int i2 = tt5.g;
        this.m = i2;
        this.n = tt5.h;
        this.d = new Handler(Looper.getMainLooper());
        bs bsVar = new bs(0);
        this.b = bsVar;
        this.g = new qr4(10);
        bs bsVar2 = tt5.e;
        if (bsVar2 != null && !bsVar2.isEmpty()) {
            bsVar.addAll(tt5.e);
        }
        lt4 lt4 = new lt4(this);
        this.e = lt4;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                ot4.c(new kt4(lt4));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static pt4 a() {
        pt4 pt4;
        synchronized (o) {
            pt4 = p;
            e07.p("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", pt4 != null);
        }
        return pt4;
    }

    public static void c(tt5 tt5) {
        if (p == null) {
            synchronized (o) {
                try {
                    if (p == null) {
                        p = new pt4(tt5);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        e07.p("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.m == 1);
        if (b() != 1) {
            this.a.writeLock().lock();
            try {
                if (this.c != 0) {
                    this.c = 0;
                    this.a.writeLock().unlock();
                    lt4 lt4 = this.e;
                    pt4 pt4 = (pt4) lt4.a;
                    try {
                        pt4.f.c(new kt4(lt4));
                    } catch (Throwable th) {
                        pt4.e(th);
                    }
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new fo((List) arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new fo((List) arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence g(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        boolean z;
        boolean z2 = false;
        e07.p("Not initialized yet", b() == 1);
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        } else if (i4 >= 0) {
            e07.j("start should be <= than end", i2 <= i3);
            if (charSequence == null) {
                return null;
            }
            e07.j("start should be < than charSequence length", i2 <= charSequence.length());
            e07.j("end should be < than charSequence length", i3 <= charSequence.length());
            if (charSequence.length() == 0 || i2 == i3) {
                return charSequence;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    z2 = this.h;
                }
                z = z2;
            } else {
                z = true;
            }
            return this.e.c(charSequence, i2, i3, i4, z);
        } else {
            throw new IllegalArgumentException("maxEmojiCount cannot be negative");
        }
    }

    public final CharSequence h(CharSequence charSequence) {
        return g(0, charSequence == null ? 0 : charSequence.length(), charSequence, Integer.MAX_VALUE, 0);
    }

    public final void i(nt4 nt4) {
        e07.o(nt4, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1) {
                if (this.c != 2) {
                    this.b.add(nt4);
                }
            }
            this.d.post(new fo(Arrays.asList(new nt4[]{nt4}), this.c, (Throwable) null));
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
