package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: cp2  reason: default package */
public final class cp2 extends l5e implements i26 {
    public File X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ gp2 w0;
    public final /* synthetic */ Uri x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cp2(gp2 gp2, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.w0 = gp2;
        this.x0 = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cp2 cp2 = new cp2(this.w0, this.x0, continuation);
        cp2.Z = obj;
        return cp2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = pu3.a
            int r1 = r8.Y
            jue r2 = jue.a
            r3 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            java.io.File r0 = r8.X
            java.lang.Object r1 = r8.Z
            ou3 r1 = (ou3) r1
            wx3.H(r9)     // Catch:{ all -> 0x0015 }
            goto L_0x0069
        L_0x0015:
            r9 = move-exception
            goto L_0x0072
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            wx3.H(r9)
            java.lang.Object r9 = r8.Z
            r1 = r9
            ou3 r1 = (ou3) r1
            gp2 r9 = r8.w0
            k77[] r4 = defpackage.gp2.M0
            t97 r9 = r9.w0
            java.lang.Object r9 = r9.getValue()
            mg5 r9 = (defpackage.mg5) r9
            gp2 r4 = r8.w0
            java.lang.String r4 = r4.J0
            java.io.File r9 = r9.q(r4)
            android.net.Uri r4 = r8.x0
            gp2 r5 = r8.w0
            boolean r6 = r9.exists()     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x0070
            if (r4 == 0) goto L_0x0070
            t97 r5 = r5.B0     // Catch:{ all -> 0x006b }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x006b }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x006b }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x006b }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0070
            zl3 r5 = defpackage.zl3.c     // Catch:{ all -> 0x006b }
            r8.Z = r1     // Catch:{ all -> 0x006b }
            r8.X = r9     // Catch:{ all -> 0x006b }
            r8.Y = r3     // Catch:{ all -> 0x006b }
            java.lang.Object r4 = r5.h(r9, r4, r8)     // Catch:{ all -> 0x006b }
            if (r4 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r0 = r9
        L_0x0069:
            r9 = r0
            goto L_0x0070
        L_0x006b:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L_0x0072
        L_0x0070:
            r4 = r2
            goto L_0x0078
        L_0x0072:
            kcc r4 = new kcc
            r4.<init>(r9)
            r9 = r0
        L_0x0078:
            gp2 r0 = r8.w0
            java.lang.Throwable r4 = mcc.a(r4)
            if (r4 == 0) goto L_0x0090
            r0.u()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "failed to copy picked image, e:"
            udd.s(r0, r1, r4)
        L_0x0090:
            gp2 r0 = r8.w0
            xzc r0 = r0.o
            java.lang.String r1 = r9.getAbsolutePath()
            at7.I(r0, r1, r1)
            gp2 r0 = r8.w0
            xzc r0 = r0.o
            java.lang.String r1 = r9.getAbsolutePath()
            at7.H(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            gp2 r1 = r8.w0
            t97 r1 = r1.B0
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<ru.ok.messages.views.ActAvatarCrop> r4 = ru.ok.messages.views.ActAvatarCrop.class
            r0.<init>(r1, r4)
            java.lang.String r1 = "ru.ok.tamtam.extra.URI"
            android.net.Uri r4 = android.net.Uri.fromFile(r9)
            r0.putExtra(r1, r4)
            java.lang.String r1 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r9 = r9.getAbsolutePath()
            r0.putExtra(r1, r9)
            java.lang.String r9 = "ru.ok.tamtam.extra.SHOW_RECAPTURE"
            r0.putExtra(r9, r3)
            java.lang.String r9 = "ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND"
            r1 = 0
            r0.putExtra(r9, r1)
            gp2 r8 = r8.w0
            l05 r8 = r8.E0
            ko2 r9 = new ko2
            r9.<init>(r0)
            defpackage.taf.o(r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp2.o(java.lang.Object):java.lang.Object");
    }
}
