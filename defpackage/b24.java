package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* renamed from: b24  reason: default package */
public abstract class b24 {
    public static final LinkedHashMap a = new LinkedHashMap();

    static {
        jn a2 = zs6.a();
        a2.I("AssetLoader", ws6.o("InputFormat", "OutputFormat"));
        Object[] objArr = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        e07.n(6, objArr);
        a2.I("AudioDecoder", ws6.h(6, objArr));
        a2.I("AudioGraph", ws6.o("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        e07.n(3, objArr2);
        a2.I("AudioMixer", ws6.h(3, objArr2));
        Object[] objArr3 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        e07.n(6, objArr3);
        a2.I("AudioEncoder", ws6.h(6, objArr3));
        Object[] objArr4 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        e07.n(6, objArr4);
        a2.I("VideoDecoder", ws6.h(6, objArr4));
        Object[] objArr5 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        e07.n(9, objArr5);
        a2.I("VFP", ws6.h(9, objArr5));
        a2.I("ExternalTextureManager", ws6.o("SignalEOS", "SurfaceTextureTransformFix"));
        a2.I("BitmapTextureManager", ws6.n("SignalEOS"));
        a2.I("TexIdTextureManager", ws6.n("SignalEOS"));
        a2.I("Compositor", ws6.n("OutputTextureRendered"));
        Object[] objArr6 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        e07.n(6, objArr6);
        a2.I("VideoEncoder", ws6.h(6, objArr6));
        a2.I("Muxer", ws6.p("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        a2.k();
        SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 114 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a() {
        /*
            java.lang.Class<b24> r0 = defpackage.b24.class
            monitor-enter(r0)
            java.lang.Class<b24> r1 = defpackage.b24.class
            monitor-enter(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        L_0x000b:
            r1 = move-exception
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b24.a():void");
    }
}
