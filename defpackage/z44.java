package defpackage;

import android.media.AudioTrack;

/* renamed from: z44  reason: default package */
public final class z44 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z44(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        o45 o45;
        c54 c54;
        lhd lhd;
        p45 p45;
        switch (this.a) {
            case 0:
                ul7 ul7 = (ul7) this.b;
                swb.h(audioTrack == ((b54) ul7.c).u);
                b54 b54 = (b54) ul7.c;
                wwc wwc = b54.r;
                if (wwc != null && b54.U && (o45 = ((l28) wwc.b).e2) != null) {
                    o45.a.w0.c(2);
                    return;
                }
                return;
            default:
                a54 a54 = (a54) this.b;
                if (audioTrack.equals(a54.c.w) && (lhd = c54.s) != null && (c54 = a54.c).Y && (p45 = ((m28) lhd.b).V0) != null) {
                    p45.a();
                    return;
                }
                return;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.a) {
            case 1:
                a54 a54 = (a54) this.b;
                if (audioTrack.equals(a54.c.w)) {
                    a54.c.X = true;
                    return;
                }
                return;
            default:
                super.onPresentationEnded(audioTrack);
                return;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        o45 o45;
        c54 c54;
        lhd lhd;
        p45 p45;
        switch (this.a) {
            case 0:
                ul7 ul7 = (ul7) this.b;
                swb.h(audioTrack == ((b54) ul7.c).u);
                b54 b54 = (b54) ul7.c;
                wwc wwc = b54.r;
                if (wwc != null && b54.U && (o45 = ((l28) wwc.b).e2) != null) {
                    o45.a.w0.c(2);
                    return;
                }
                return;
            default:
                a54 a54 = (a54) this.b;
                if (audioTrack.equals(a54.c.w) && (lhd = c54.s) != null && (c54 = a54.c).Y && (p45 = ((m28) lhd.b).V0) != null) {
                    p45.a();
                    return;
                }
                return;
        }
    }
}
