package defpackage;

import android.widget.ImageView;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: z6f  reason: default package */
public final class z6f implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ z6f(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setImageResource(phc.g);
                a24.Z(imageView, 300, new y6f(this.b, 0));
                return jue.a;
            default:
                ImageView imageView2 = (ImageView) obj;
                imageView2.setId(j2a.v);
                imageView2.setAlpha(0.0f);
                a24.Z(imageView2, 300, new y6f(this.b, 1));
                return jue.a;
        }
    }
}
