package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: eb6  reason: default package */
public final class eb6 implements wkd {
    public final Context a;
    public final hcd b;
    public final s0c c;
    public final ContextScope d;
    public final String e;
    public l0g f;
    public int g = 6;
    public n6g h;

    public eb6(Context context, pae pae) {
        this.a = context;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.b = b2;
        this.c = new s0c(b2);
        this.d = n1g.a(((n3a) pae).c().getImmediate());
        String name = eb6.class.getName();
        this.e = name;
        r7e r7e = new r7e(new gz3(18, this));
        if (d8.z(context, (db6) r7e.getValue(), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", 2) == null) {
            udd.u(name, new Error("SMS Retriever registration failed"), (String) null, new Object[0]);
        }
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.eb6 r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            java.lang.String r0 = "[0-9]{"
            boolean r1 = r11 instanceof defpackage.bb6
            if (r1 == 0) goto L_0x0018
            r1 = r11
            bb6 r1 = (defpackage.bb6) r1
            int r2 = r1.x0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.x0 = r2
            goto L_0x001d
        L_0x0018:
            bb6 r1 = new bb6
            r1.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r1.Z
            pu3 r2 = pu3.a
            int r3 = r1.x0
            java.lang.String r4 = ", message="
            java.lang.String r5 = "sms code matching failed: codeLength="
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r8) goto L_0x003b
            java.io.Serializable r9 = r1.Y
            java.lang.String r10 = r1.X
            eb6 r0 = r1.o
            wx3.H(r11)
            r11 = r9
            r9 = r0
            goto L_0x00b2
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0043:
            wx3.H(r11)
            int r11 = r9.g     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            r3.append(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r11 = "}"
            r3.append(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x006c }
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch:{ all -> 0x006c }
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch:{ all -> 0x006c }
            boolean r0 = r11.find()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006e
            java.lang.String r11 = r11.group(r7)     // Catch:{ all -> 0x006c }
            goto L_0x0076
        L_0x006c:
            r11 = move-exception
            goto L_0x0070
        L_0x006e:
            r11 = r6
            goto L_0x0076
        L_0x0070:
            kcc r0 = new kcc
            r0.<init>(r11)
            r11 = r0
        L_0x0076:
            boolean r0 = r11 instanceof kcc
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00b2
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00a1
            uu3 r0 = new uu3
            int r1 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = r9.e
            udd.u(r2, r0, r6, r1)
            goto L_0x00b2
        L_0x00a1:
            hcd r3 = r9.b
            r1.o = r9
            r1.X = r10
            r1.Y = r11
            r1.x0 = r8
            java.lang.Object r0 = r3.a(r0, r1)
            if (r0 != r2) goto L_0x00b2
            goto L_0x00da
        L_0x00b2:
            java.lang.Throwable r11 = mcc.a(r11)
            if (r11 == 0) goto L_0x00d8
            java.lang.String r0 = r9.e
            uu3 r1 = new uu3
            int r9 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r9)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9, r11)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            udd.u(r0, r1, r6, r9)
        L_0x00d8:
            jue r2 = jue.a
        L_0x00da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb6.a(eb6, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        n6g c2;
        if (this.h != null) {
            udd.q(this.e, "task not null! skip start retriever");
            return;
        }
        n6g n6g = null;
        if (this.f == null) {
            hk9 hk9 = new hk9(6);
            this.f = new la6(this.a, l0g.B0, (GoogleSignInOptions) null, hk9);
        }
        l0g l0g = this.f;
        if (!(l0g == null || (c2 = l0g.c(1, new szf())) == null)) {
            xp xpVar = new xp(2, new gw2(17, this));
            c27 c27 = cee.a;
            c2.d(c27, xpVar);
            c2.i(new ab6(this));
            c2.c(c27, new ab6(this));
            c2.a(c27, new ab6(this));
            n6g = c2;
        }
        this.h = n6g;
    }
}
