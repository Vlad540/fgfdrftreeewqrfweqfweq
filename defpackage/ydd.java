package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: ydd  reason: default package */
public final class ydd implements pp7 {
    public static final /* synthetic */ k77[] z0;
    public final t97 X;
    public final t97 Y;
    public final r7e Z;
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final e3 w0 = hwf.t();
    public final r7e x0;
    public final String y0;

    static {
        hc9 hc9 = new hc9(ydd.class, "shortcutsJob", "getShortcutsJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        z0 = new k77[]{hc9};
    }

    public ydd(Context context, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = context;
        this.b = t97;
        this.c = t972;
        this.o = t974;
        this.X = t976;
        this.Y = t977;
        this.Z = new r7e(new qo1(t975, t973, 4));
        this.x0 = new r7e(new nya(this, 20, t976));
        this.y0 = ydd.class.getName();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [sdd, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.ydd r7, i22 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.wdd
            if (r0 == 0) goto L_0x0016
            r0 = r9
            wdd r0 = (defpackage.wdd) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            wdd r0 = new wdd
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            i22 r8 = r0.X
            ydd r7 = r0.o
            defpackage.wx3.H(r9)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            defpackage.wx3.H(r9)
            java.lang.String r9 = r8.p()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0045
            goto L_0x0053
        L_0x0045:
            t97 r9 = r7.o
            java.lang.Object r9 = r9.getValue()
            f03 r9 = (f03) r9
            boolean r9 = r8.S(r9)
            if (r9 == 0) goto L_0x0056
        L_0x0053:
            r1 = r3
            goto L_0x014b
        L_0x0056:
            t97 r9 = r7.Y
            java.lang.Object r9 = r9.getValue()
            zm9 r9 = (defpackage.zm9) r9
            r0.o = r7
            r0.X = r8
            r0.w0 = r4
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 != r1) goto L_0x006c
            goto L_0x014b
        L_0x006c:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 != 0) goto L_0x0071
            goto L_0x0053
        L_0x0071:
            android.content.Context r0 = r7.a
            long r1 = r8.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            sdd r2 = new sdd
            r2.<init>()
            r2.a = r0
            r2.b = r1
            java.lang.String r0 = r8.p()
            r2.d = r0
            java.lang.String r0 = r8.p()
            r2.e = r0
            androidx.core.graphics.drawable.IconCompat r9 = androidx.core.graphics.drawable.IconCompat.b(r9)
            r2.f = r9
            sr7 r9 = defpackage.sr7.c
            r9.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = ":chats?id="
            r9.<init>(r0)
            long r0 = r8.a
            r9.append(r0)
            java.lang.String r8 = "&type=local"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            t97 r9 = r7.X
            java.lang.Object r0 = r9.getValue()
            al r0 = (al) r0
            gg7 r0 = (gg7) r0
            java.lang.String r0 = r0.b
            java.lang.Object r9 = r9.getValue()
            al r9 = (al) r9
            gg7 r9 = (gg7) r9
            java.lang.String r9 = r9.e
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<one.me.android.MainActivity> r5 = one.me.android.MainActivity.class
            android.content.Context r6 = r7.a
            r1.<init>(r6, r5)
            java.lang.String r5 = "CUSTOM_DEEP_LINK"
            r1.setAction(r5)
            sr7 r5 = defpackage.sr7.c
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "://"
            r5.append(r0)
            r5.append(r9)
            java.lang.String r9 = "/"
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r1.setData(r8)
            android.content.Intent[] r8 = new android.content.Intent[]{r1}
            r2.c = r8
            java.lang.String r8 = "ru.oneme.app.sharing.category.SHORTCUT_SHARE"
            java.util.Set r8 = java.util.Collections.singleton(r8)
            bs r9 = new bs
            r0 = 0
            r9.<init>((int) r0)
            r9.addAll(r8)
            r2.g = r9
            java.lang.CharSequence r8 = r2.d     // Catch:{ all -> 0x0141 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0141 }
            if (r8 != 0) goto L_0x0139
            android.content.Intent[] r8 = r2.c     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x0131
            int r8 = r8.length     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x0131
            wm7 r8 = r2.h     // Catch:{ all -> 0x0141 }
            if (r8 != 0) goto L_0x012d
            wm7 r8 = new wm7     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = r2.b     // Catch:{ all -> 0x0141 }
            r8.<init>(r9)     // Catch:{ all -> 0x0141 }
            r2.h = r8     // Catch:{ all -> 0x0141 }
        L_0x012d:
            r2.i = r4     // Catch:{ all -> 0x0141 }
            r1 = r2
            goto L_0x014b
        L_0x0131:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = "Shortcut must have an intent"
            r8.<init>(r9)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0141 }
        L_0x0139:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = "Shortcut must have a non-empty label"
            r8.<init>(r9)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r8 = move-exception
            java.lang.String r7 = r7.y0
            java.lang.String r9 = "fail to create shortcut"
            defpackage.udd.s(r7, r9, r8)
            goto L_0x0053
        L_0x014b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydd.b(ydd, i22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        c();
    }

    public final void c() {
        try {
            Context context = this.a;
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
            udd.E(context).getClass();
            Iterator it = udd.D(context).iterator();
            if (it.hasNext()) {
                hr1.r(it.next());
                throw null;
            }
        } catch (Throwable th) {
            udd.s(this.y0, "clear: failed", th);
        }
    }

    public final void d() {
        qod E = xs7.E((ou3) this.Z.getValue(), (hu3) null, ru3.b, new xdd(this, (Continuation) null), 1);
        this.w0.o1(this, z0[0], E);
    }
}
