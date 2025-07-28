package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: a7f  reason: default package */
public final class a7f extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a7f(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((a7f) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a7f a7f = new a7f(continuation, this.Y);
        a7f.X = obj;
        return a7f;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i5f i5f = (i5f) this.X;
        boolean z = i5f.b;
        VideoMessageWidget videoMessageWidget = this.Y;
        Drawable drawable = z ? (Drawable) videoMessageWidget.Y.getValue() : (Drawable) videoMessageWidget.Z.getValue();
        k77[] k77Arr = VideoMessageWidget.y0;
        videoMessageWidget.getClass();
        k77[] k77Arr2 = VideoMessageWidget.y0;
        k77 k77 = k77Arr2[1];
        n0c n0c = videoMessageWidget.o;
        ((ImageView) n0c.T0(videoMessageWidget, k77)).setImageDrawable(drawable);
        ViewPropertyAnimator viewPropertyAnimator = videoMessageWidget.w0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = ((ImageView) n0c.T0(videoMessageWidget, k77Arr2[1])).animate().alpha(i5f.a ? 1.0f : 0.0f).setDuration(200).withEndAction(new p36((Object) videoMessageWidget, 27, (Object) i5f));
        videoMessageWidget.w0 = withEndAction;
        if (withEndAction != null) {
            withEndAction.start();
        }
        return jue.a;
    }
}
