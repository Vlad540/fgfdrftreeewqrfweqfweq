package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ukd  reason: default package */
public final class ukd extends l5e implements i26 {
    public final /* synthetic */ vkd A0;
    public final /* synthetic */ i26 B0;
    public vkd X;
    public i26 Y;
    public Iterator Z;
    public hx6 w0;
    public int x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ukd(ArrayList arrayList, vkd vkd, kbb kbb, Continuation continuation) {
        super(2, continuation);
        this.z0 = arrayList;
        this.A0 = vkd;
        this.B0 = kbb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ukd ukd = new ukd((ArrayList) this.z0, this.A0, this.B0, continuation);
        ukd.y0 = obj;
        return ukd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.x0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            hx6 r1 = r10.w0
            java.util.Iterator r5 = r10.Z
            i26 r6 = r10.Y
            vkd r7 = r10.X
            java.lang.Object r8 = r10.y0
            ou3 r8 = (ou3) r8
            wx3.H(r11)
            goto L_0x007f
        L_0x001d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0025:
            java.lang.Object r1 = r10.y0
            ou3 r1 = (ou3) r1
            wx3.H(r11)
            goto L_0x0050
        L_0x002d:
            wx3.H(r11)
            java.lang.Object r11 = r10.y0
            ou3 r11 = (ou3) r11
            r1 = r11
        L_0x0035:
            boolean r11 = n1g.A(r1)
            if (r11 == 0) goto L_0x008c
            r10.y0 = r1
            r10.X = r2
            r10.Y = r2
            r10.Z = r2
            r10.w0 = r2
            r10.x0 = r4
            r5 = 1800(0x708, double:8.893E-321)
            java.lang.Object r11 = defpackage.ek8.q(r5, r10)
            if (r11 != r0) goto L_0x0050
            return r0
        L_0x0050:
            java.util.List r11 = r10.z0
            java.util.Iterator r11 = r11.iterator()
            vkd r5 = r10.A0
            i26 r6 = r10.B0
            r7 = r5
            r5 = r11
        L_0x005c:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0035
            java.lang.Object r11 = r5.next()
            hx6 r11 = (defpackage.hx6) r11
            r10.y0 = r1
            r10.X = r7
            r10.Y = r6
            r10.Z = r5
            r10.w0 = r11
            r10.x0 = r3
            r8 = 80
            java.lang.Object r8 = defpackage.ek8.q(r8, r10)
            if (r8 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r8 = r1
            r1 = r11
        L_0x007f:
            ou3 r11 = r7.a
            tkd r9 = new tkd
            r9.<init>(r6, r1, r2)
            r1 = 3
            xs7.E(r11, r2, r2, r9, r1)
            r1 = r8
            goto L_0x005c
        L_0x008c:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukd.o(java.lang.Object):java.lang.Object");
    }
}
