package defpackage;

import android.content.Context;
import android.os.Parcel;

/* renamed from: qqe  reason: default package */
public final class qqe implements sqe, i36, n8c, c1g {
    public final Object a;

    public /* synthetic */ qqe(Object obj) {
        this.a = obj;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        hx4 hx4 = (hx4) obj;
    }

    /* JADX INFO: finally extract failed */
    public void accept(Object obj, Object obj2) {
        vde vde = (vde) obj2;
        i0g i0g = (i0g) ((m0g) obj).o();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(i0g.e);
        int i = kzf.a;
        ree ree = (ree) this.a;
        if (ree == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            ree.writeToParcel(obtain, 0);
        }
        try {
            i0g.d.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            vde.b((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [uw7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tqe b(android.content.Context r14, defpackage.z23 r15, defpackage.pv0 r16, defpackage.z4f r17, defpackage.lk9 r18, java.util.List r19, long r20) {
        /*
            r13 = this;
            lh4 r6 = defpackage.lh4.a
            r0 = 0
            r1 = 0
            r9 = r0
        L_0x0005:
            int r0 = r19.size()
            if (r1 >= r0) goto L_0x001d
            r0 = r19
            java.lang.Object r2 = r0.get(r1)
            uw7 r2 = (defpackage.uw7) r2
            boolean r3 = r2 instanceof defpackage.u2b
            if (r3 == 0) goto L_0x001a
            r9 = r2
            u2b r9 = (defpackage.u2b) r9
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001d:
            rqe r12 = new rqe
            r0 = r13
            java.lang.Object r0 = r0.a
            r2 = r0
            k4f r2 = (defpackage.k4f) r2
            r8 = 1
            r0 = r12
            r1 = r14
            r3 = r15
            r4 = r17
            r5 = r16
            r7 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqe.b(android.content.Context, z23, pv0, z4f, lk9, java.util.List, long):tqe");
    }

    public void e(Throwable th) {
        ((vj4) this.a).u();
    }

    public Object n() {
        Context context = (Context) ((t4g) ((c1g) this.a)).a.a;
        if (context != null) {
            return new d6g(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
