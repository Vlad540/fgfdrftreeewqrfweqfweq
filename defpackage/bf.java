package defpackage;

import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* renamed from: bf  reason: default package */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af b;

    public /* synthetic */ bf(af afVar, int i) {
        this.a = i;
        this.b = afVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                af afVar = this.b;
                afVar.b.v1.b();
                je.d(new bf(afVar, 1));
                return;
            default:
                AnimatedFileDrawable animatedFileDrawable = this.b.b;
                if (animatedFileDrawable.z1 != null) {
                    rn0.c();
                    animatedFileDrawable.z1 = null;
                }
                animatedFileDrawable.y1 = false;
                AnimatedFileDrawable.a(animatedFileDrawable);
                animatedFileDrawable.e();
                return;
        }
    }
}
