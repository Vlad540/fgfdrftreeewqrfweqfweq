package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hw9  reason: default package */
public final class hw9 implements ux, vx, uw9 {
    public static final byte[] X = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] Y = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object o;

    public hw9(Context context) {
        this.a = 8;
        this.c = 0;
        this.o = context;
    }

    public static void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z2 = false;
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = (long) i2;
        if ((j2 >> 8) == 0) {
            z2 = true;
        }
        a06.j(j2, "out of range: %s", z2);
        byteBuffer.put((byte) ((int) j2));
    }

    public nsf M(View view, nsf nsf) {
        int i = nsf.a.f(7).b;
        int i2 = this.b;
        View view2 = (View) this.o;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return nsf;
    }

    public int a() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return this.b;
        }
    }

    public int b() {
        switch (this.a) {
            case 2:
                return this.c;
            default:
                return this.c;
        }
    }

    public int c() {
        switch (this.a) {
            case 2:
                int i = this.b;
                return i == -1 ? ((yze) this.o).y() : i;
            default:
                int i2 = this.b;
                return i2 == -1 ? ((ija) this.o).y() : i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        defpackage.urd.l(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(mma r5) {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = 1
            int r0 = r0 + r1
            r4.c = r0
            int r2 = r4.b
            if (r0 <= r2) goto L_0x000b
            return
        L_0x000b:
            java.lang.Object r4 = r4.o
            java.io.File r4 = (java.io.File) r4
            if (r4 != 0) goto L_0x0012
            return
        L_0x0012:
            java.io.File r0 = r4.getParentFile()     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x001b
            defpackage.h2g.t(r0)     // Catch:{ IOException -> 0x0039 }
        L_0x001b:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0039 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0039 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0039 }
            r3.<init>(r4, r1)     // Catch:{ IOException -> 0x0039 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0039 }
            xhd.e(r0, r5)     // Catch:{ all -> 0x0032 }
            r4 = 0
            defpackage.urd.l(r0, r4)     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0032:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r5 = move-exception
            defpackage.urd.l(r0, r4)     // Catch:{ IOException -> 0x0039 }
            throw r5     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw9.d(mma):void");
    }

    public void e(int i) {
        we3 g = ((bf3) this.o).g(this.c);
        switch (this.b) {
            case 1:
                g.d.F = i;
                return;
            case 2:
                g.d.G = i;
                return;
            case 3:
                g.d.H = i;
                return;
            case 4:
                g.d.I = i;
                return;
            case 5:
                g.d.L = i;
                return;
            case 6:
                g.d.K = i;
                return;
            case 7:
                g.d.J = i;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public synchronized int g() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = ((Context) suf.a((Context) this.o).b).getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int h() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.o;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) suf.a(context).b).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        this.c = 2;
        return 2;
    }

    public /* synthetic */ hw9(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.o = obj;
        this.c = i2;
    }

    public hw9(File file) {
        this.a = 1;
        this.o = file;
        nne nne = nne.a;
        Object obj = nne.c().get(r1g.c);
        tma tma = obj instanceof tma ? (tma) obj : null;
        this.b = (tma == null ? new tma(new og0(14, (byte) 0)) : tma).b;
    }

    public hw9(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 5;
        this.o = new ArrayList();
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), gwb.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == gwb.State_android_id) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == gwb.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new bf3().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public hw9(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.o = new hw9[256];
                this.b = 0;
                this.c = 0;
                return;
            default:
                return;
        }
    }

    public hw9(int i, int i2) {
        this.a = 6;
        this.o = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public hw9(px pxVar, vu5 vu5) {
        this.a = 2;
        yze yze = pxVar.c;
        this.o = yze;
        yze.H(12);
        int y = yze.y();
        if ("audio/raw".equals(vu5.A0)) {
            int v = mze.v(vu5.P0, vu5.N0);
            if (y == 0 || y % v != 0) {
                y = v;
            }
        }
        this.b = y == 0 ? -1 : y;
        this.c = yze.y();
    }

    public hw9(qx qxVar, xu5 xu5) {
        this.a = 3;
        ija ija = qxVar.c;
        this.o = ija;
        ija.G(12);
        int y = ija.y();
        if ("audio/raw".equals(xu5.n)) {
            int D = oze.D(xu5.D, xu5.B);
            if (y == 0 || y % D != 0) {
                ez3.j0("Audio sample size mismatch. stsd sample size: " + D + ", stsz sample size: " + y);
                y = D;
            }
        }
        this.b = y == 0 ? -1 : y;
        this.c = ija.y();
    }
}
