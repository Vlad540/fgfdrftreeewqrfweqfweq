package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: og0  reason: default package */
public final class og0 implements v4, c6c, l4f, icf {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ og0(char c2, int i) {
        this.a = i;
    }

    public static ga9 H() {
        og9 og9 = og9.a;
        og9.getClass();
        return new ga9(og9);
    }

    public void A() {
        t12 t12 = t12.c;
        char[] cArr = (char[]) this.c;
        synchronized (t12) {
            int i = t12.a;
            if (cArr.length + i < zr.a) {
                t12.a = i + cArr.length;
                ((lr) t12.b).b(cArr);
            }
        }
    }

    public synchronized void B(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public hw9 C(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 6, i, 7);
        return new hw9(bf3, 6, i2, 4);
    }

    public hw9 D(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 6, i, 6);
        return new hw9(bf3, 6, i2, 4);
    }

    public hw9 E(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 3, i, 4);
        return new hw9(bf3, 3, i2, 4);
    }

    public void F(long j) {
    }

    public hw9 G(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 3, i, 3);
        return new hw9(bf3, 3, i2, 4);
    }

    public void I() {
        ((bf3) this.c).g(this.b).d.W = 2;
    }

    public void J() {
    }

    public void K(String str) {
        int length = str.length();
        if (length != 0) {
            r(this.b, length);
            str.getChars(0, str.length(), (char[]) this.c, this.b);
            this.b += length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            pqe r0 = (defpackage.pqe) r0
            int r5 = r5.b
            jc4 r0 = r0.E0
            r0.getClass()
            monitor-enter(r0)
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            boolean r1 = defpackage.oze.l(r1, r5)     // Catch:{ all -> 0x0045 }
            defpackage.oyb.k(r1)     // Catch:{ all -> 0x0045 }
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x001e
            r1 = r2
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            defpackage.oyb.k(r1)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            ic4 r1 = (defpackage.ic4) r1     // Catch:{ all -> 0x0045 }
            r1.b = r2     // Catch:{ all -> 0x0045 }
            r1 = r4
        L_0x002d:
            android.util.SparseArray r3 = r0.g     // Catch:{ all -> 0x0045 }
            int r3 = r3.size()     // Catch:{ all -> 0x0045 }
            if (r1 >= r3) goto L_0x0047
            android.util.SparseArray r3 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r3.valueAt(r1)     // Catch:{ all -> 0x0045 }
            ic4 r3 = (defpackage.ic4) r3     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.b     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            r5 = move-exception
            goto L_0x008d
        L_0x0047:
            r4 = r2
        L_0x0048:
            r0.h = r4     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            int r3 = r0.o     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0045 }
            ic4 r1 = (defpackage.ic4) r1     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque r1 = r1.a     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x006c
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0063
            r0.c()     // Catch:{ all -> 0x0045 }
        L_0x0063:
            if (r4 == 0) goto L_0x006c
            gvf r5 = r0.a     // Catch:{ all -> 0x0045 }
            r5.k()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)
            goto L_0x008c
        L_0x006c:
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            if (r5 == r1) goto L_0x008b
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            ic4 r5 = (defpackage.ic4) r5     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque r5 = r5.a     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 != r2) goto L_0x008b
            ew0 r5 = r0.f     // Catch:{ all -> 0x0045 }
            ec4 r1 = new ec4     // Catch:{ all -> 0x0045 }
            r2 = 2
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0045 }
            r5.v(r1)     // Catch:{ all -> 0x0045 }
        L_0x008b:
            monitor-exit(r0)
        L_0x008c:
            return
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og0.L():void");
    }

    public zg9 a(int i) {
        zg9 zg9 = (zg9) ((SparseArray) this.c).get(i);
        if (zg9 != null) {
            return zg9;
        }
        throw new IllegalArgumentException(wn6.h(i, "Cannot find the wrapper for global view type "));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [stf, java.lang.Object, hcf] */
    public hcf b(zg9 zg9) {
        ? obj = new Object();
        obj.o = this;
        obj.a = new SparseIntArray(1);
        obj.b = new SparseIntArray(1);
        obj.c = zg9;
        return obj;
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        pqe pqe = (pqe) this.c;
        pqe.getClass();
        pqe.Y.execute(new zo5(pqe, 29, videoFrameProcessingException));
    }

    public boolean d(View view) {
        ((BottomSheetBehavior) this.c).K(this.b);
        return true;
    }

    public hw9 e(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 4, i, 4);
        return new hw9(bf3, 4, i2, 4);
    }

    public hw9 f(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 4, i, 3);
        return new hw9(bf3, 4, i2, 4);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ia9, y1] */
    public ia9 g() {
        Map g = ((pa2) this.c).g();
        ha9 ha9 = new ha9(this.b);
        ? y1Var = new y1(g);
        y1Var.Y = ha9;
        return y1Var;
    }

    public void h() {
        ((bf3) this.c).g(this.b).d.l0 = true;
    }

    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, ild[] ildArr) {
        int i;
        c6c[] c6cArr;
        do {
            i = this.b;
            c6cArr = (c6c[]) this.c;
            if (i >= c6cArr.length) {
                return false;
            }
            this.b = i + 1;
        } while (!c6cArr[i].i(unsatisfiedLinkError, ildArr));
        return true;
    }

    public void j(InputStream inputStream, OutputStream outputStream) {
        w66 w66 = (w66) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) w66.get(i);
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                w66.g(bArr);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ed1, ig7] */
    /* JADX WARNING: type inference failed for: r1v4, types: [ed1, ig7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ed1, ig7] */
    public int k() {
        w51 w51 = (w51) this.c;
        int i = w51.P0.a;
        int i2 = this.b;
        if (i != 0) {
            return i2;
        }
        if (w51.M0.j() == 0 || w51.M0.j() == 1) {
            return 1;
        }
        if (w51.M0.j() == 2) {
            return 2;
        }
        return i2;
    }

    public gn9 l(kc8 kc8, t33 t33) {
        v1d v1d = t33.a;
        int i = 0;
        oyb.d(v1d != null && v1d.a == 0);
        v1d.getClass();
        Service service = (Service) this.c;
        IconCompat c2 = IconCompat.c(service, t33.d);
        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        intent.setData(kc8.a.b);
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", v1d.b);
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", v1d.c);
        int i2 = this.b + 1;
        this.b = i2;
        if (oze.a >= 23) {
            i = 67108864;
        }
        return new gn9(c2, t33.f, PendingIntent.getService(service, i2, intent, 134217728 | i));
    }

    public gn9 m(kc8 kc8, IconCompat iconCompat, CharSequence charSequence, int i) {
        return new gn9(iconCompat, charSequence, n(kc8, (long) i));
    }

    public PendingIntent n(kc8 kc8, long j) {
        int i = 0;
        int i2 = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(kc8.a.b);
        Service service = (Service) this.c;
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i2));
        int i3 = oze.a;
        if (i3 >= 26 && j == 1 && !kc8.c().u()) {
            return PendingIntent.getForegroundService(service, i2, intent, 67108864);
        }
        if (i3 >= 23) {
            i = 67108864;
        }
        return PendingIntent.getService(service, i2, intent, i);
    }

    public void o(int i, int i2) {
    }

    public hw9 p(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 7, i, 7);
        return new hw9(bf3, 7, i2, 4);
    }

    public hw9 q(int i) {
        bf3 bf3 = (bf3) this.c;
        int i2 = this.b;
        bf3.d(i2, 7, i, 6);
        return new hw9(bf3, 7, i2, 4);
    }

    public void r(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void s(xm8 xm8, long j) {
        i22 B = ((kae) this.c).f().B(xm8.a.x0);
        List<xm8> singletonList = Collections.singletonList(xm8);
        if (B == null) {
            udd.r("og0", "Chat can't be null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", B.a);
        bundle.putLong("ru.ok.tamtam.extra.ATTACH_ID", j);
        bundle.putBoolean("ru.ok.tamtam.extra.NOTIFY", true);
        ArrayList arrayList = new ArrayList(singletonList.size());
        for (xm8 xm82 : singletonList) {
            try {
                arrayList.add(Long.valueOf(xm82.a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public int t() {
        int i = this.b;
        if (i != 0) {
            return ((int[]) this.c)[i - 1];
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public int u() {
        int i = this.b;
        if (i != 0) {
            int i2 = i - 1;
            this.b = i2;
            return ((int[]) this.c)[i2];
        }
        throw new NoSuchElementException();
    }

    public void v(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            ((int[]) this.c)[i2 - 1] = i;
            return;
        }
        throw new NoSuchElementException();
    }

    public void w(int i) {
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        if (this.b >= length) {
            int[] iArr2 = new int[(length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.c = iArr2;
            iArr = iArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public long x(q74 q74) {
        yze yze = (yze) this.c;
        int i = 0;
        q74.r(yze.a, 0, 1, false);
        byte b2 = yze.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        q74.r(yze.a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (yze.a[i] & 255) + (i4 << 8);
        }
        this.b = i3 + 1 + this.b;
        return (long) i4;
    }

    public long y(r74 r74) {
        ija ija = (ija) this.c;
        int i = 0;
        r74.r(ija.a, 0, 1, false);
        byte b2 = ija.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        r74.r(ija.a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (ija.a[i] & 255) + (i4 << 8);
        }
        this.b = i3 + 1 + this.b;
        return (long) i4;
    }

    public synchronized boolean z(String str) {
        for (String equals : (String[]) this.c) {
            if (str.equals(equals)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        B(sb);
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public /* synthetic */ og0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ og0(int i, Serializable serializable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = serializable;
    }

    public /* synthetic */ og0(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = 0;
    }

    public og0(pa2 pa2) {
        this.a = 12;
        this.c = pa2;
        this.b = 2;
    }

    public og0(int i, byte[] bArr) {
        this.a = 17;
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'value' value: null");
        } else if (i != 0) {
            this.c = bArr;
            this.b = i;
        } else {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        }
    }

    public og0(nd3 nd3, int i) {
        this.a = 22;
        a24.o(nd3);
        this.c = nd3;
        this.b = i;
    }

    public og0(int i, byte b2) {
        this.a = i;
        switch (i) {
            case 6:
                this.c = new Object();
                this.b = 0;
                return;
            case 14:
                this.b = 50;
                return;
            case 18:
                this.c = new int[8];
                return;
            case 19:
                this.c = new yze(8);
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                this.c = new ija(8);
                return;
            default:
                this.c = new String[5];
                this.b = 0;
                return;
        }
    }

    public og0(w66 w66) {
        this.a = 15;
        ez3.j(true);
        this.b = 16384;
        this.c = w66;
    }

    public og0(int i) {
        this.a = 11;
        vl.b().p().getClass();
        nqc b2 = oae.b();
        this.c = b2;
        this.b = i;
        b2.b();
        vl.b().g();
    }

    public og0(Notification notification) {
        this.a = 10;
        this.b = 1001;
        notification.getClass();
        this.c = notification;
    }
}
