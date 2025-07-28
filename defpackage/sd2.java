package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: sd2  reason: default package */
public final class sd2 extends lx3 {
    public final rr3 A0;
    public final String B0 = "chatMediaViewer";
    public final mu C0;

    public sd2(rr3 rr3, ExecutorService executorService) {
        super(rr3, 0);
        this.A0 = rr3;
        this.C0 = new mu(new c9(0, this), new qe4((Object) executorService, 4, (Object) new w04(4)));
    }

    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r0v9, types: [one.me.chatmedia.viewer.video.VideoViewerWidget] */
    /* JADX WARNING: type inference failed for: r0v10, types: [one.me.chatmedia.viewer.photo.PhotoViewerWidget] */
    /* JADX WARNING: type inference failed for: r0v11, types: [one.me.chatmedia.viewer.photo.GifViewerWidget] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r14 = r14.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(defpackage.sgc r14, int r15) {
        /*
            r13 = this;
            boolean r0 = r14.n()
            if (r0 == 0) goto L_0x0042
            java.lang.Class<sd2> r13 = defpackage.sd2.class
            java.lang.String r13 = r13.getName()
            fn6 r15 = defpackage.udd.e
            if (r15 != 0) goto L_0x0011
            goto L_0x0041
        L_0x0011:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x0041
            tn7 r0 = tn7.X
            java.util.ArrayList r14 = r14.e()
            java.lang.Object r14 = defpackage.o23.f0(r14)
            vgc r14 = (defpackage.vgc) r14
            r1 = 0
            if (r14 == 0) goto L_0x002f
            rr3 r14 = r14.a
            if (r14 == 0) goto L_0x002f
            rr3 r14 = r14.getTargetController()
            goto L_0x0030
        L_0x002f:
            r14 = r1
        L_0x0030:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Media viewer. Configure router | root exist | target exist:"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r15.d(r0, r13, r14, r1)
        L_0x0041:
            return
        L_0x0042:
            mu r0 = r13.C0
            java.util.List r0 = r0.f
            java.lang.Object r15 = defpackage.o23.Y(r15, r0)
            k68 r15 = (defpackage.k68) r15
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            long r1 = r15.j()
            java.lang.String r3 = r15.x()
            boolean r0 = r15 instanceof defpackage.b68
            if (r0 == 0) goto L_0x0076
            b68 r15 = (defpackage.b68) r15
            boolean r15 = r15.X
            if (r15 == 0) goto L_0x006c
            one.me.chatmedia.viewer.photo.GifViewerWidget r15 = new one.me.chatmedia.viewer.photo.GifViewerWidget
            java.lang.String r4 = r13.B0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
        L_0x006a:
            r7 = r15
            goto L_0x0084
        L_0x006c:
            one.me.chatmedia.viewer.photo.PhotoViewerWidget r15 = new one.me.chatmedia.viewer.photo.PhotoViewerWidget
            java.lang.String r4 = r13.B0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
            goto L_0x006a
        L_0x0076:
            boolean r15 = r15 instanceof defpackage.i68
            if (r15 == 0) goto L_0x009d
            one.me.chatmedia.viewer.video.VideoViewerWidget r15 = new one.me.chatmedia.viewer.video.VideoViewerWidget
            java.lang.String r4 = r13.B0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
            goto L_0x006a
        L_0x0084:
            rr3 r13 = r13.A0
            r7.setTargetController(r13)
            qr3 r13 = defpackage.qr3.b
            r7.setRetainViewMode(r13)
            vgc r13 = new vgc
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.R(r13)
            return
        L_0x009d:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd2.E(sgc, int):void");
    }

    public final int j() {
        return this.C0.f.size();
    }

    public final long k(int i) {
        k68 k68 = (k68) o23.Y(i, this.C0.f);
        if (k68 != null) {
            return k68.getItemId();
        }
        return 0;
    }
}
