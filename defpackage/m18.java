package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: m18  reason: default package */
public abstract class m18 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public m18(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
        this.c = new AtomicReference(hw4.a);
        this.d = new r7e(new qk8(6, this));
    }

    public void A(int i) {
    }

    public void B(int i) {
    }

    public void C() {
    }

    public void D() {
    }

    public void E(long j) {
    }

    public void F() {
    }

    public void G() {
        dy b2;
        FileOutputStream f;
        try {
            wia H = H();
            int intValue = ((Number) H.a).intValue();
            e13 e13 = (e13) H.b;
            if (e13 != null) {
                try {
                    String c2 = c();
                    fn6 fn6 = udd.e;
                    if (fn6 != null) {
                        if (fn6.c()) {
                            tn7 tn7 = tn7.X;
                            int size = ((List) ((AtomicReference) this.c).get()).size();
                            fn6.d(tn7, c2, "saveProtoToFile " + size + ", " + intValue + "bytes", (Throwable) null);
                        }
                    }
                    b2 = b();
                    f = b2.f();
                    if (f != null) {
                        f.write((byte[]) e13.e0(), 0, intValue);
                        b2.b(f);
                    }
                    urd.l(e13, (Throwable) null);
                } catch (Throwable th) {
                    urd.l(e13, th);
                    throw th;
                }
            } else if (intValue == 0) {
                dy b3 = b();
                if (b3.c.delete() && b3.d.delete()) {
                    b3.e.delete();
                }
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th2) {
            udd.s(c(), "failed to save state", th2);
        }
    }

    public wia H() {
        gr8 a2 = a();
        int serializedSize = a2.getSerializedSize();
        if (serializedSize == 0) {
            return new wia(0, (Object) null);
        }
        t54 a3 = ((g0b) ((t97) this.b).getValue()).b().a(serializedSize);
        byte[] bArr = (byte[]) a3.e0();
        String c2 = c();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            float length = ((float) bArr.length) / ((float) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            fn6.d(tn7, c2, "serializeData: size=" + length + "kb, bytes.ref=" + bArr + "}", (Throwable) null);
        }
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        gr8.toByteArray(a2, bArr, 0, serializedSize);
        return new wia(Integer.valueOf(serializedSize), a3);
    }

    public void I(nc8 nc8, Handler handler) {
        synchronized (this.a) {
            try {
                this.c = new WeakReference(nc8);
                fx fxVar = (fx) this.d;
                fx fxVar2 = null;
                if (fxVar != null) {
                    fxVar.removeCallbacksAndMessages((Object) null);
                }
                if (nc8 != null) {
                    if (handler != null) {
                        fxVar2 = new fx(this, handler.getLooper(), 12);
                    }
                }
                this.d = fxVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract gr8 a();

    public abstract dy b();

    public String c() {
        return (String) ((r7e) this.d).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.z49
            if (r0 == 0) goto L_0x0013
            r0 = r7
            z49 r0 = (defpackage.z49) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            z49 r0 = new z49
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.wx3.H(r7)
            goto L_0x0087
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            m18 r6 = r0.o
            defpackage.wx3.H(r7)
            goto L_0x0060
        L_0x0039:
            defpackage.wx3.H(r7)
            dy r7 = r6.b()
            r0.o = r6
            r0.Z = r4
            java.lang.Object r2 = r6.a
            t97 r2 = (defpackage.t97) r2
            java.lang.Object r2 = r2.getValue()
            pae r2 = (pae) r2
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.b()
            b59 r4 = new b59
            r4.<init>(r7, r6, r5)
            java.lang.Object r7 = defpackage.xs7.U(r2, r4, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            byte[] r7 = (byte[]) r7
            if (r7 != 0) goto L_0x0067
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x0067:
            java.lang.Object r2 = r6.a
            t97 r2 = (defpackage.t97) r2
            java.lang.Object r2 = r2.getValue()
            pae r2 = (pae) r2
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            a59 r4 = new a59
            r4.<init>(r6, r7, r5)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r7 = defpackage.xs7.U(r2, r4, r0)
            if (r7 != r1) goto L_0x0087
            return r1
        L_0x0087:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m18.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Boolean e(byte[] bArr);

    public void f(c58 c58) {
    }

    public void g(c58 c58, int i) {
    }

    public void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j() {
    }

    public boolean k(Intent intent) {
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void q() {
    }

    public void r(String str, Bundle bundle) {
    }

    public void s(String str, Bundle bundle) {
    }

    public void t(Uri uri, Bundle bundle) {
    }

    public void u(c58 c58) {
    }

    public void v() {
    }

    public void w(long j) {
    }

    public void x(float f) {
    }

    public void y(dyb dyb) {
    }

    public void z(dyb dyb) {
    }

    public m18(wd8 wd8) {
        this.d = wd8;
        this.a = new ArrayList();
    }

    public m18() {
        this.a = new Object();
        this.b = new mc8(this);
        this.c = new WeakReference((Object) null);
    }
}
