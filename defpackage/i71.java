package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: i71  reason: default package */
public final /* synthetic */ class i71 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yha b;

    public /* synthetic */ i71(yha yha, int i) {
        this.a = i;
        this.b = yha;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = bnb.ic_reject_video_call_15;
                s59 s59 = km4.y0;
                Context context = (Context) this.b.a;
                yn6 d = rf0.d(s59, context);
                Drawable b2 = gq3.b(context, i);
                js.D(b2, d.i);
                return b2;
            case 1:
                int i2 = bnb.ic_reject_audio_call_12;
                s59 s592 = km4.y0;
                Context context2 = (Context) this.b.a;
                yn6 d2 = rf0.d(s592, context2);
                Drawable b3 = gq3.b(context2, i2);
                js.D(b3, d2.i);
                return b3;
            case 2:
                int i3 = bnb.ic_incoming_video_call_15;
                s59 s593 = km4.y0;
                Context context3 = (Context) this.b.a;
                yn6 d3 = rf0.d(s593, context3);
                Drawable b4 = gq3.b(context3, i3);
                js.D(b4, d3.i);
                return b4;
            case 3:
                int i4 = bnb.ic_incoming_audio_call_13;
                s59 s594 = km4.y0;
                Context context4 = (Context) this.b.a;
                yn6 d4 = rf0.d(s594, context4);
                Drawable b5 = gq3.b(context4, i4);
                js.D(b5, d4.i);
                return b5;
            case 4:
                int i5 = bnb.ic_outgoing_video_call_15;
                s59 s595 = km4.y0;
                Context context5 = (Context) this.b.a;
                yn6 d5 = rf0.d(s595, context5);
                Drawable b6 = gq3.b(context5, i5);
                js.D(b6, d5.i);
                return b6;
            case 5:
                int i6 = bnb.ic_outgoing_audio_call_13;
                s59 s596 = km4.y0;
                Context context6 = (Context) this.b.a;
                yn6 d6 = rf0.d(s596, context6);
                Drawable b7 = gq3.b(context6, i6);
                js.D(b7, d6.i);
                return b7;
            default:
                int i7 = bnb.ic_link_16;
                s59 s597 = km4.y0;
                Context context7 = (Context) this.b.a;
                yn6 d7 = rf0.d(s597, context7);
                Drawable b8 = gq3.b(context7, i7);
                js.D(b8, d7.i);
                return b8;
        }
    }
}
