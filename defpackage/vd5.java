package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: vd5  reason: default package */
public final class vd5 extends l5e implements i26 {
    public final /* synthetic */ File X;
    public final /* synthetic */ wd5 Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vd5(File file, wd5 wd5, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = wd5;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vd5(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[Catch:{ all -> 0x001a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            wd5 r0 = r11.Y
            java.io.File r1 = r11.X
            wx3.H(r12)
            java.lang.String r12 = r1.getName()     // Catch:{ all -> 0x001a }
            java.lang.String r12 = js.s(r12)     // Catch:{ all -> 0x001a }
            if (r12 == 0) goto L_0x001c
            int r2 = r12.length()     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r6 = r12
            goto L_0x001f
        L_0x001a:
            r11 = move-exception
            goto L_0x004b
        L_0x001c:
            java.lang.String r12 = "*/*"
            goto L_0x0018
        L_0x001f:
            boolean r10 = r11.Z     // Catch:{ all -> 0x001a }
            android.content.Context r11 = r0.a     // Catch:{ all -> 0x001a }
            java.lang.String r12 = "download"
            java.lang.Object r11 = r11.getSystemService(r12)     // Catch:{ all -> 0x001a }
            boolean r12 = r11 instanceof android.app.DownloadManager     // Catch:{ all -> 0x001a }
            if (r12 == 0) goto L_0x0031
            android.app.DownloadManager r11 = (android.app.DownloadManager) r11     // Catch:{ all -> 0x001a }
        L_0x002f:
            r2 = r11
            goto L_0x0033
        L_0x0031:
            r11 = 0
            goto L_0x002f
        L_0x0033:
            if (r2 != 0) goto L_0x0036
            goto L_0x006a
        L_0x0036:
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x001a }
            java.lang.String r4 = r1.getName()     // Catch:{ all -> 0x001a }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ all -> 0x001a }
            long r8 = r1.length()     // Catch:{ all -> 0x001a }
            r5 = 0
            r2.addCompletedDownload(r3, r4, r5, r6, r7, r8, r10)     // Catch:{ all -> 0x001a }
            goto L_0x006a
        L_0x004b:
            java.lang.String r12 = defpackage.wd5.g
            java.lang.String r1 = "fail!"
            udd.s(r12, r1, r11)
            r0.getClass()
            k77[] r12 = defpackage.wd5.f
            r1 = 1
            r12 = r12[r1]
            nj4 r12 = r0.b
            java.lang.Object r12 = r12.get()
            g15 r12 = (defpackage.g15) r12
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            r0.<init>(r11)
            ((r4a) r12).c(r0, false)
        L_0x006a:
            jue r11 = jue.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd5.o(java.lang.Object):java.lang.Object");
    }
}
