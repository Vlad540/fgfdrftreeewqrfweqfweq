package defpackage;

import android.graphics.Picture;
import android.text.Layout;
import kotlin.coroutines.Continuation;

/* renamed from: ia6  reason: default package */
public final class ia6 extends l5e implements i26 {
    public final /* synthetic */ Layout X;
    public final /* synthetic */ ja6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ia6(Layout layout, ja6 ja6, Continuation continuation) {
        super(2, continuation);
        this.X = layout;
        this.Y = ja6;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ia6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Layout layout = this.X;
        wx3.H(obj);
        p0b p0b = ja6.c;
        Picture picture = (Picture) p0b.h();
        if (picture == null) {
            picture = new Picture();
        }
        try {
            layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
            picture.endRecording();
            p0b.g(picture);
        } catch (Throwable th) {
            udd.s(this.Y.b, "fail to warm layout", th);
        }
        return jue.a;
    }
}
