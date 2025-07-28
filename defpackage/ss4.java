package defpackage;

import org.webrtc.EglRenderer;

/* renamed from: ss4  reason: default package */
public final /* synthetic */ class ss4 implements Runnable {
    public final /* synthetic */ float X;
    public final /* synthetic */ EglRenderer a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public /* synthetic */ ss4(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        this.a = eglRenderer;
        this.b = f;
        this.c = f2;
        this.o = f3;
        this.X = f4;
    }

    public final void run() {
        this.a.lambda$clearImage$4(this.b, this.c, this.o, this.X);
    }
}
