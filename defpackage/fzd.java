package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fzd  reason: default package */
public final class fzd implements of3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fzd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.uaf a(defpackage.xy2 r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r5.a
            boolean r1 = r0.isAnonymousClass()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x004b
        L_0x000a:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L_0x0011
            goto L_0x004b
        L_0x0011:
            boolean r1 = r0.isArray()
            java.util.HashMap r3 = defpackage.xy2.c
            if (r1 == 0) goto L_0x003a
            java.lang.Class r0 = r0.getComponentType()
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = r0.getName()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "Array"
            java.lang.String r2 = r0.concat(r1)
        L_0x0035:
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = "kotlin.Array"
            goto L_0x004b
        L_0x003a:
            java.lang.String r1 = r0.getName()
            java.lang.Object r1 = r3.get(r1)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = r0.getCanonicalName()
        L_0x004b:
            if (r2 == 0) goto L_0x005c
            java.lang.String r0 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r0.concat(r2)
            java.lang.Object r4 = r4.b
            w4g r4 = (defpackage.w4g) r4
            uaf r4 = r4.u(r5, r0)
            return r4
        L_0x005c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Local and anonymous classes can not be ViewModels"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzd.a(xy2):uaf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r1 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 2: goto L_0x0048;
                default: goto L_0x0005;
            }
        L_0x0005:
            jue r4 = (defpackage.jue) r4
            java.lang.Object r3 = r3.b
            pd r3 = (pd) r3
            boolean r4 = r3.a
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r3.b
            xwb r4 = (xwb) r4
            java.lang.String r0 = "OwnTalkingReporter"
            java.lang.String r1 = "on voice stop detected and reported"
            r4.log(r0, r1)
            java.lang.Object r4 = r3.Y
            rgc r4 = (defpackage.rgc) r4
            r0 = 0
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r4.b
            pe1 r4 = (pe1) r4
            ke1 r1 = r4.a
            boolean r2 = r1.d()
            r1.n = r0
            boolean r1 = r1.d()
            if (r2 == r1) goto L_0x0045
            ke1 r1 = r4.a
            ge1 r2 = r1.a
            if (r2 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            w2d r2 = r4.c(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r4.e(r2, r1)
        L_0x0045:
            r3.a = r0
        L_0x0047:
            return
        L_0x0048:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r3 = r3.b
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r3 = (ru.ok.tamtam.upload.workers.UploadFileAttachWorker) r3
            r3.e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzd.accept(java.lang.Object):void");
    }

    public void b(v2b v2b) {
        yha yha = (yha) this.b;
        yha.a = v2b;
        Iterator it = ((LinkedList) yha.c).iterator();
        while (it.hasNext()) {
            ((h0g) it.next()).b();
        }
        ((LinkedList) yha.c).clear();
        yha.b = null;
    }

    public fzd(Context context, String str) {
        this.a = 1;
        this.b = new r7e(new pxa(context, 4, str));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public fzd(bbf bbf, zaf zaf) {
        this(bbf, zaf, fw3.b);
        this.a = 3;
    }

    public fzd(bbf bbf, zaf zaf, hw3 hw3) {
        this.a = 3;
        this.b = new w4g((Object) bbf, (Object) zaf, (Object) hw3, 17);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fzd(defpackage.cbf r4) {
        /*
            r3 = this;
            r0 = 3
            r3.a = r0
            bbf r0 = r4.v()
            boolean r1 = r4 instanceof defpackage.le6
            if (r1 == 0) goto L_0x0013
            r2 = r4
            le6 r2 = (defpackage.le6) r2
            zaf r2 = r2.n()
            goto L_0x0015
        L_0x0013:
            sc4 r2 = defpackage.sc4.a
        L_0x0015:
            if (r1 == 0) goto L_0x001e
            le6 r4 = (defpackage.le6) r4
            pb9 r4 = r4.o()
            goto L_0x0020
        L_0x001e:
            fw3 r4 = defpackage.fw3.b
        L_0x0020:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzd.<init>(cbf):void");
    }
}
