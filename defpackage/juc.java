package defpackage;

import java.util.Iterator;

/* renamed from: juc  reason: default package */
public final class juc {
    public final byte[] a = new byte[4];
    public final ckd b;
    public final String c;
    public final Iterator d;
    public final float e;
    public final int f;
    public final int g;
    public iuc h;
    public iuc i;
    public long j;
    public long k = -9223372036854775807L;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: x29[]} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public juc(defpackage.xu5 r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 1
            r12.<init>()
            r2 = 4
            byte[] r2 = new byte[r2]
            r12.a = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.k = r2
            a39 r2 = r13.k
            r3 = 0
            r4 = 0
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r2 != 0) goto L_0x001e
            r2 = r0
            r7 = r4
            goto L_0x00a7
        L_0x001e:
            r9 = r0
            r6 = r3
            r7 = r4
            r8 = r5
        L_0x0022:
            x29[] r10 = r2.a
            int r11 = r10.length
            if (r6 >= r11) goto L_0x003e
            r10 = r10[r6]
            boolean r11 = r10 instanceof defpackage.zkd
            if (r11 == 0) goto L_0x0035
            zkd r10 = (defpackage.zkd) r10
            float r8 = r10.a
            int r9 = r10.b
            int r9 = r9 - r1
            goto L_0x003c
        L_0x0035:
            boolean r11 = r10 instanceof defpackage.ckd
            if (r11 == 0) goto L_0x003c
            r7 = r10
            ckd r7 = (defpackage.ckd) r7
        L_0x003c:
            int r6 = r6 + r1
            goto L_0x0022
        L_0x003e:
            if (r7 != 0) goto L_0x0045
        L_0x0040:
            r2 = r0
            r5 = r8
            r0 = r9
            goto L_0x00a7
        L_0x0045:
            if (r9 == r0) goto L_0x0049
            r2 = r1
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            java.lang.String r6 = "SVC temporal layer count not found."
            defpackage.oyb.j(r6, r2)
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            r2 = r1
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            java.lang.String r5 = "Capture frame rate not found."
            defpackage.oyb.j(r5, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r8 % r2
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x006e
            r2 = 1106247680(0x41f00000, float:30.0)
            float r2 = r8 % r2
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x006e
            r2 = r1
            goto L_0x006f
        L_0x006e:
            r2 = r3
        L_0x006f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid capture frame rate: "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            defpackage.oyb.j(r5, r2)
            int r2 = (int) r8
            int r2 = r2 / 30
            r5 = r9
        L_0x0084:
            if (r5 < 0) goto L_0x0040
            r6 = r2 & 1
            if (r6 != r1) goto L_0x00a4
            int r0 = r2 >> 1
            if (r0 != 0) goto L_0x0090
            r0 = r1
            goto L_0x0091
        L_0x0090:
            r0 = r3
        L_0x0091:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Could not compute normal speed max SVC layer for capture frame rate  "
            r2.<init>(r6)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            defpackage.oyb.j(r2, r0)
            r0 = r5
            goto L_0x0040
        L_0x00a4:
            int r2 = r2 >> r1
            int r5 = r5 + r0
            goto L_0x0084
        L_0x00a7:
            r12.b = r7
            java.lang.String r13 = r13.n
            r13.getClass()
            r12.c = r13
            if (r7 == 0) goto L_0x00cd
            java.lang.String r6 = "video/avc"
            boolean r6 = r13.equals(r6)
            if (r6 != 0) goto L_0x00c4
            java.lang.String r6 = "video/hevc"
            boolean r6 = r13.equals(r6)
            if (r6 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r1 = r3
        L_0x00c4:
            java.lang.String r3 = "Unsupported MIME type for SEF slow motion video track: "
            java.lang.String r13 = r3.concat(r13)
            defpackage.oyb.c(r13, r1)
        L_0x00cd:
            if (r7 == 0) goto L_0x00d2
            java.util.List r13 = r7.a
            goto L_0x00d6
        L_0x00d2:
            po5 r13 = defpackage.ws6.b
            e8c r13 = defpackage.e8c.X
        L_0x00d6:
            java.util.Iterator r13 = r13.iterator()
            r12.d = r13
            r12.e = r5
            r12.f = r0
            r12.g = r2
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00f3
            iuc r4 = new iuc
            java.lang.Object r13 = r13.next()
            akd r13 = (defpackage.akd) r13
            r4.<init>(r13, r0, r2)
        L_0x00f3:
            r12.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juc.<init>(xu5):void");
    }

    public final void a() {
        iuc iuc = this.h;
        iuc iuc2 = null;
        if (iuc != null) {
            this.j = ((iuc.b - iuc.a) * ((long) (iuc.c - 1))) + this.j;
            this.h = null;
        }
        this.h = this.i;
        Iterator it = this.d;
        if (it.hasNext()) {
            iuc2 = new iuc((akd) it.next(), this.f, this.g);
        }
        this.i = iuc2;
    }
}
