package defpackage;

import androidx.media3.common.PlaybackException;

/* renamed from: k48  reason: default package */
public final /* synthetic */ class k48 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ k48(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    public final void invoke(Object obj) {
        hya hya = (hya) obj;
        switch (this.a) {
            case 0:
                hya.r0(this.b);
                return;
            case 1:
                hya.x0(this.b);
                return;
            case 2:
                hya.r0(this.b);
                return;
            default:
                hya.x0(this.b);
                return;
        }
    }
}
