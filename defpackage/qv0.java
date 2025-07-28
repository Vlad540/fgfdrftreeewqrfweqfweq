package defpackage;

/* renamed from: qv0  reason: default package */
public final /* synthetic */ class qv0 implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ qv0(uv0 uv0, int i) {
        this.a = i;
        this.b = uv0;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 135 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0005;
                case 2: goto L_0x0076;
                case 3: goto L_0x005c;
                case 4: goto L_0x0039;
                case 5: goto L_0x001f;
                case 6: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            uv0 r0 = r2.b
            monitor-enter(r0)
            r2 = 0
            r0.j = r2     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r2
        L_0x0011:
            r2 = move-exception
            goto L_0x000f
        L_0x0013:
            uv0 r0 = r2.b
            sv0 r3 = (defpackage.sv0) r3
            monitor-enter(r0)
            r0.k = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        L_0x001f:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            uv0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "uv0"
            java.lang.String r1 = "onClearCacheClicked: failed"
            udd.s(r0, r1, r3)
            tv0 r2 = r2.h
            r3 = r2
            ru.ok.messages.views.fragments.base.FrgBase r3 = (ru.ok.messages.views.fragments.base.FrgBase) r3
            r3.k1()
            r2.L()
            return
        L_0x0039:
            sv0 r3 = (defpackage.sv0) r3
            uv0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "uv0"
            java.lang.String r1 = "onClearCacheClicked: finished"
            udd.q(r0, r1)
            tv0 r2 = r2.h
            r0 = r2
            ru.ok.messages.views.fragments.base.FrgBase r0 = (ru.ok.messages.views.fragments.base.FrgBase) r0
            r0.k1()
            java.lang.String r0 = r3.b
            r2.l(r0)
            java.util.List r3 = r3.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2.e(r3)
            return
        L_0x005c:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            uv0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "uv0"
            java.lang.String r1 = "onClearCacheTypesPicked: failed"
            udd.s(r0, r1, r3)
            tv0 r2 = r2.h
            r3 = r2
            ru.ok.messages.views.fragments.base.FrgBase r3 = (ru.ok.messages.views.fragments.base.FrgBase) r3
            r3.k1()
            r2.L()
            return
        L_0x0076:
            sv0 r3 = (defpackage.sv0) r3
            uv0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "uv0"
            java.lang.String r1 = "onClearCacheTypesPicked: success"
            udd.n(r0, r1)
            tv0 r2 = r2.h
            r0 = r2
            ru.ok.messages.views.fragments.base.FrgBase r0 = (ru.ok.messages.views.fragments.base.FrgBase) r0
            r0.k1()
            r2.J()
            java.lang.String r3 = r3.b
            r2.l(r3)
            return
        L_0x0095:
            sv0 r3 = (defpackage.sv0) r3
            uv0 r2 = r2.b
            r2.getClass()
            java.lang.String r0 = "uv0"
            java.lang.String r1 = "onViewCreated: finished"
            udd.n(r0, r1)
            java.lang.String r3 = r3.b
            tv0 r2 = r2.h
            r2.l(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv0.accept(java.lang.Object):void");
    }

    public Object apply(Object obj) {
        ms9 c;
        uv0 uv0 = this.b;
        String str = (String) obj;
        synchronized (uv0) {
            uv0.j = null;
            c = uv0.c();
        }
        return c;
    }
}
