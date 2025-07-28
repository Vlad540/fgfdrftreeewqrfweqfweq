package defpackage;

import java.util.concurrent.ExecutorService;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: ocd  reason: default package */
public final class ocd {
    public final ExecutorService a;
    public final xwb b;
    public volatile String c;
    public volatile PeerConnectionFactory d;
    public final es9 e;
    public e3 f;
    public JavaAudioDeviceModule g;
    public EglBase h;
    public final mh9 i;
    public final wka j;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r3 = (xp0) r7.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r7 = (xp0) r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ocd(org.webrtc.EglBase r5, defpackage.xwb r6, defpackage.fe1 r7, defpackage.td4 r8) {
        /*
            r4 = this;
            java.util.concurrent.ExecutorService r0 = defpackage.gx0.s2
            r4.<init>()
            r4.a = r0
            r4.b = r6
            r4.i = r8
            es9 r1 = new es9
            org.webrtc.EglBase$Context r2 = r5.getEglBaseContext()
            r1.<init>(r2, r6)
            r4.e = r1
            wka r1 = new wka
            org.webrtc.EglBase$Context r2 = r5.getEglBaseContext()
            mn r7 = r7.w
            if (r7 == 0) goto L_0x0036
            java.lang.Object r3 = r7.b
            xp0 r3 = (xp0) r3
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.a
            if (r3 != 0) goto L_0x0034
        L_0x002a:
            java.lang.Object r7 = r7.c
            xp0 r7 = (xp0) r7
            if (r7 == 0) goto L_0x0036
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x0036
        L_0x0034:
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1.<init>(r2, r7, r6)
            r4.j = r1
            r8.b(r1)
            ncd r7 = new ncd
            r8 = 0
            r7.<init>(r4, r5, r6, r8)
            r0.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocd.<init>(org.webrtc.EglBase, xwb, fe1, td4):void");
    }
}
