package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: z5  reason: default package */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ z5(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r5, android.view.View$OnSystemUiVisibilityChangeListener, android.app.Activity, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: type inference failed for: r3v29, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r3 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = r3.b
            int r3 = r3.a
            switch(r3) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0032;
                case 2: goto L_0x002b;
                case 3: goto L_0x001d;
                case 4: goto L_0x0017;
                case 5: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.view.View r3 = r0.i1
            java.util.WeakHashMap r0 = eaf.a
            r9f.c(r3)
            return
        L_0x000f:
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r3 = r0.j1
            java.util.WeakHashMap r0 = eaf.a
            r9f.c(r3)
            return
        L_0x0017:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.w1
            r0.b0(r0)
            return
        L_0x001d:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.w1
            android.view.Window r3 = r0.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.invalidate()
            return
        L_0x002b:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.w1
            r3 = 0
            r0.u0(r3)
            return
        L_0x0032:
            r0.startPostponedEnterTransition()
            return
        L_0x0036:
            q98 r3 = r0.o1
            if (r3 == 0) goto L_0x004b
            v2b r3 = r0.O0
            java.lang.Object r3 = r3.b
            k93 r3 = (defpackage.k93) r3
            o2a r3 = (o2a) r3
            s98 r3 = r3.k()
            q98 r1 = r0.o1
            r3.k(r1)
        L_0x004b:
            q98 r3 = r0.p1
            if (r3 == 0) goto L_0x0060
            v2b r3 = r0.O0
            java.lang.Object r3 = r3.b
            k93 r3 = (defpackage.k93) r3
            o2a r3 = (o2a) r3
            s98 r3 = r3.k()
            q98 r1 = r0.p1
            r3.k(r1)
        L_0x0060:
            o88 r3 = r0.d1
            if (r3 == 0) goto L_0x00a8
            java.util.ArrayList r3 = r0.Z0
            int r1 = r3.size()
            if (r1 != 0) goto L_0x006d
            goto L_0x00a8
        L_0x006d:
            int r1 = r0.a1
            java.lang.Object r3 = r3.get(r1)
            tk7 r3 = (defpackage.tk7) r3
            if (r3 != 0) goto L_0x0078
            goto L_0x00a8
        L_0x0078:
            o88 r0 = r0.d1
            long r1 = r3.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r3 = r0.F(r1)
            boolean r0 = r3 instanceof ru.ok.messages.media.mediabar.FrgLocalVideo
            if (r0 == 0) goto L_0x00a8
            ru.ok.messages.media.mediabar.FrgLocalVideo r3 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r3
            xd9 r0 = r3.O1
            if (r0 != 0) goto L_0x008b
            goto L_0x00a8
        L_0x008b:
            q98 r3 = r3.M1
            al7 r3 = (defpackage.al7) r3
            r3.g = r0
            u2f r0 = r3.f
            if (r0 == 0) goto L_0x00a8
            int r0 = r3.i()
            int r1 = r3.g()
            int r2 = r3.h()
            p98 r3 = r3.e
            if (r3 == 0) goto L_0x00a8
            r3.P(r0, r1, r2)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5.run():void");
    }
}
